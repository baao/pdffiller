package formfiller;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public final class PdfFormFiller {
    private String thisMoment;
    private PDDocument pdfDocument;
    private Method[] methods;

    public static void main(String[] a) throws Exception {
        NachforschungsauftragPOJO nachforschungsauftragPOJO = new NachforschungsauftragPOJO("kljsdfls");
        nachforschungsauftragPOJO.setAmountNachnahme("1000");
        new PdfFormFiller().fillAllFieldsWithTheirNames();
    }

    private PdfFormFiller() throws IOException {
        this("/opt/IdeaProjects/Bewertungsmailer/src/main/resources/GKS_Nachforschungsauftrag.pdf");
    }

    public PdfFormFiller(String pdfFile) throws IOException {
        setThisMoment();
        pdfDocument = PDDocument.load(new File(pdfFile));
    }

    public PdfFormFiller fill(Object pojo) throws IOException, NoFormCouldBeFoundException {
        if (this.methods == null) this.forSchema(pojo.getClass());
        PDAcroForm form = pdfDocument.getDocumentCatalog().getAcroForm();
        if (form == null) throw new NoFormCouldBeFoundException();
        for (Method m : getMethods()) {
            if (m.isAnnotationPresent(FormField.class)) {
                FormField formField = m.getAnnotation(FormField.class);
                try {
                    if (!formField.isCheckBox()) {
                        form.getField(formField.name()).setValue((String) m.invoke(pojo));
                    } else if (formField.isCheckBox() && (boolean) m.invoke(pojo)) {
                        form.getField(formField.name()).setValue(formField.value());
                        if (! formField.equalField().equals("")) form.getField(formField.equalField()).setValue(formField.value());
                    }
                    if (!formField.equalField().equals("") && ! formField.isCheckBox()) {
                        form.getField(formField.equalField()).setValue((String) m.invoke(pojo));
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.out.println("--- Method couldn't be executed: " + m.getName() + " ---");
                    e.printStackTrace();
                } catch (NullPointerException nullPointer) {
                    System.out.println("--- Field not found in PDF Form: " + formField.name() + " ---");
                    nullPointer.printStackTrace();
                }
            }
        }
        return this;
    }

    public void fillAllFieldsWithTheirNames() throws IOException, NoFormCouldBeFoundException {
        PDAcroForm form = pdfDocument.getDocumentCatalog().getAcroForm();
        if (form == null) throw new NoFormCouldBeFoundException();
        form.getFields().forEach(field -> {
            System.out.println(field.getPartialName());
            try {
                field.setValue(field.getPartialName());
            } catch (Exception e) {
                try {
                    field.setValue("On");
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        });
        this.save();
    }

    private String getThisMoment() {
        return thisMoment;
    }

    private void setThisMoment() {
        this.thisMoment = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmX")
                .withZone(ZoneOffset.UTC)
                .format(Instant.now());
    }

    private Method[] getMethods() {
        return methods;
    }

    public PdfFormFiller forSchema(Class forClass) {
        this.methods = forClass.getMethods();
        return this;
    }

    public boolean save(String fileName) {
        try {
            pdfDocument.save(fileName);
            pdfDocument.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean save() throws IOException {
        return this.save(getThisMoment() + ".pdf");
    }

    public boolean fillAndSave(Object pojo) throws IOException, NoFormCouldBeFoundException {
        return this
                .fill(pojo)
                .save();
    }

    public boolean fillAndSave(Object pojo, String outputFileName) throws IOException, NoFormCouldBeFoundException {
        return this
                .fill(pojo)
                .save(outputFileName);
    }


}

