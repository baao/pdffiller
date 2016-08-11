package formfiller;

public class NachforschungsauftragPOJO {
    private boolean dhlPackage;
    private boolean nachnahmeSendung;
    private boolean paeckchenOderWarensendung;
    private boolean internationalPackage;
    private boolean paeckchenInternational;
    private boolean unfrei;
    private boolean isHigherInsured2500;
    private boolean isHigherInsured25000;
    private String sentDate;
    private String shipmentWeight;
    private String bankNachnahme;
    private String verwendungszweckNachnahme;
    private String senderName;
    private String receiverName;
    private String senderStreetHouseNo;
    private String receiverStreetHouseNo;
    private String senderPlzOrt;
    private String receiverPlzOrt;
    private String senderCountry;
    private String receiverCountry;
    private String senderPhoneEmail;
    private String receiverPhoneEmail;
    private String refundIban;
    private String refundBic;
    private String refundBank;
    private String refundDifferentNameOfAccountHolder;
    private String refundDifferentAddressOfAccountHolder;
    private String sendungsnummer;
    private String amountNachnahme;
    private String bicNachnahme;
    private String ibanNachnahme;
    private String articleOne;
    private String articleTwo;
    private String articleThree;
    private String articleFour;
    private String articleFive;

    private String euroArticleOne;
    private String euroArticleTwo;
    private String euroArticleThree;
    private String euroArticleFour;
    private String euroArticleFive;

    private String centArticleOne;
    private String centArticleTwo;
    private String centArticleThree;
    private String centArticleFour;
    private String centArticleFive;

    private String euroSumBrutto;
    private String centSumBrutto;
    private String euroUst;
    private String centUst;
    private String euroSumNetto;
    private String centSumNetto;

    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public NachforschungsauftragPOJO(String orderId) {
        this.orderId = orderId;
    }

    @FormField(name = "DHL Paket", isCheckBox = true, value = "On", equalField = "DHL Paket_2")
    public boolean isDhlPackage() {
        return dhlPackage;
    }

    public void setDhlPackage(boolean dhlPackage) {
        this.dhlPackage = dhlPackage;
    }

    @FormField(name = "Nachnahmebetrag Die Sendung wurde dem Empfänger", isCheckBox = true, value = "On", equalField = "Nachnahmebetrag Die Sendung wurde dem Empfänger_2")
    public boolean isNachnahmeSendung() {
        return nachnahmeSendung;
    }

    public void setNachnahmeSendung(boolean nachnahmeSendung) {
        this.nachnahmeSendung = nachnahmeSendung;
    }

    @FormField(name = "anderen Produkt", isCheckBox = true, value = "On", equalField = "anderen Produkt_2")
    public boolean isPaeckchenOderWarensendung() {
        return paeckchenOderWarensendung;
    }

    public void setPaeckchenOderWarensendung(boolean paeckchenOderWarensendung) {
        this.paeckchenOderWarensendung = paeckchenOderWarensendung;
    }

    @FormField(name = "DHL Paket International  Weltpaket", isCheckBox = true, value = "On", equalField = "DHL Paket International  Weltpaket_2")
    public boolean isInternationalPackage() {
        return internationalPackage;
    }

    public void setInternationalPackage(boolean internationalPackage) {
        this.internationalPackage = internationalPackage;
    }

    @FormField(name = "DHL Päckchen International", isCheckBox = true, value = "On", equalField = "DHL Päckchen International_2")
    public boolean isPaeckchenInternational() {
        return paeckchenInternational;
    }

    public void setPaeckchenInternational(boolean paeckchenInternational) {
        this.paeckchenInternational = paeckchenInternational;
    }

    @FormField(name = "unfrei", isCheckBox = true, value = "On", equalField = "unfrei_2")
    public boolean isUnfrei() {
        return unfrei;
    }

    public void setUnfrei(boolean unfrei) {
        this.unfrei = unfrei;
    }

    @FormField(name = "2500 Euro oder", isCheckBox = true, value = "On", equalField = "2500 Euro oder_2")
    public boolean isHigherInsured2500() {
        return isHigherInsured2500;
    }

    public void setHigherInsured2500(boolean higherInsured2500) {
        isHigherInsured2500 = higherInsured2500;
    }

    @FormField(name = "25000 Euro", isCheckBox = true, value = "On", equalField = "25000 Euro_2")
    public boolean isHigherInsured25000() {
        return isHigherInsured25000;
    }

    public void setHigherInsured25000(boolean higherInsured25000) {
        isHigherInsured25000 = higherInsured25000;
    }

    @FormField(name = "Text12")
    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    @FormField(name = "Text13")
    public String getShipmentWeight() {
        return shipmentWeight;
    }

    public void setShipmentWeight(String shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }

    @FormField(name = "Bank", equalField = "Bank_3")
    public String getBankNachnahme() {
        return bankNachnahme;
    }

    public void setBankNachnahme(String bankNachnahme) {
        this.bankNachnahme = bankNachnahme;
    }

    @FormField(name = "Verwendungszweck", equalField = "Verwendungszweck_2")
    public String getVerwendungszweckNachnahme() {
        return verwendungszweckNachnahme;
    }

    public void setVerwendungszweckNachnahme(String verwendungszweckNachnahme) {
        this.verwendungszweckNachnahme = verwendungszweckNachnahme;
    }

    @FormField(name = "Name Vorname  Firma", equalField = "Name Vorname  Firma_3")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @FormField(name = "Name Vorname  Firma_2", equalField = "Name Vorname  Firma_4")
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @FormField(name = "Straße Hausnummer", equalField = "Straße Hausnummer_3")
    public String getSenderStreetHouseNo() {
        return senderStreetHouseNo;
    }

    public void setSenderStreetHouseNo(String senderStreetHouseNo) {
        this.senderStreetHouseNo = senderStreetHouseNo;
    }

    @FormField(name = "Straße Hausnummer_2", equalField = "Straße Hausnummer_4")
    public String getReceiverStreetHouseNo() {
        return receiverStreetHouseNo;
    }

    public void setReceiverStreetHouseNo(String receiverStreetHouseNo) {
        this.receiverStreetHouseNo = receiverStreetHouseNo;
    }

    @FormField(name = "PLZ Ort", equalField = "PLZ Ort_3")
    public String getSenderPlzOrt() {
        return senderPlzOrt;
    }

    public void setSenderPlzOrt(String senderPlzOrt) {
        this.senderPlzOrt = senderPlzOrt;
    }

    @FormField(name = "PLZ Ort_2", equalField = "PLZ Ort_4")
    public String getReceiverPlzOrt() {
        return receiverPlzOrt;
    }

    public void setReceiverPlzOrt(String receiverPlzOrt) {
        this.receiverPlzOrt = receiverPlzOrt;
    }

    @FormField(name = "Land", equalField = "Land_3")
    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    @FormField(name = "Land_2", equalField = "Land_4")
    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    @FormField(name = "TelefonNr mit Durchwahl Ansprechpartner EMailAdresse", equalField = "TelefonNr mit Durchwahl Ansprechpartner EMailAdresse_3")
    public String getSenderPhoneEmail() {
        return senderPhoneEmail;
    }

    public void setSenderPhoneEmail(String senderPhoneEmail) {
        this.senderPhoneEmail = senderPhoneEmail;
    }

    @FormField(name = "TelefonNr mit Durchwahl Ansprechpartner EMailAdresse_2", equalField = "TelefonNr mit Durchwahl Ansprechpartner EMailAdresse_4")
    public String getReceiverPhoneEmail() {
        return receiverPhoneEmail;
    }

    public void setReceiverPhoneEmail(String receiverPhoneEmail) {
        this.receiverPhoneEmail = receiverPhoneEmail;
    }

    @FormField(name = "IBAN", equalField = "IBAN_2")
    public String getRefundIban() {
        return refundIban;
    }

    public void setRefundIban(String refundIban) {
        this.refundIban = refundIban;
    }

    @FormField(name = "BIC", equalField = "BIC_2")
    public String getRefundBic() {
        return refundBic;
    }

    public void setRefundBic(String refundBic) {
        this.refundBic = refundBic;
    }

    @FormField(name = "Bank_2", equalField = "Bank_4")
    public String getRefundBank() {
        return refundBank;
    }

    public void setRefundBank(String refundBank) {
        this.refundBank = refundBank;
    }

    @FormField(name = "Kontoinhaber bei Abweichungen oder Abtretung", equalField = "Kontoinhaber bei Abweichungen oder Abtretung_2")
    public String getRefundDifferentNameOfAccountHolder() {
        return refundDifferentNameOfAccountHolder;
    }

    public void setRefundDifferentNameOfAccountHolder(String refundDifferentNameOfAccountHolder) {
        this.refundDifferentNameOfAccountHolder = refundDifferentNameOfAccountHolder;
    }

    @FormField(name = "Anschrift des Kontoinhabers bei Abweichungen oder Abtretung", equalField = "Anschrift des Kontoinhabers bei Abweichungen oder Abtretung_2")
    public String getRefundDifferentAddressOfAccountHolder() {
        return refundDifferentAddressOfAccountHolder;
    }

    public void setRefundDifferentAddressOfAccountHolder(String refundDifferentAddressOfAccountHolder) {
        this.refundDifferentAddressOfAccountHolder = refundDifferentAddressOfAccountHolder;
    }

    @FormField(name = "Text1")
    public String getSendungsnummer() {
        return sendungsnummer;
    }

    public void setSendungsnummer(String sendungsnummer) {
        this.sendungsnummer = sendungsnummer;
    }

    @FormField(name = "Text2")
    public String getAmountNachnahme() {
        return amountNachnahme;
    }

    public void setAmountNachnahme(String amountNachnahme) {
        this.amountNachnahme = amountNachnahme;
    }

    @FormField(name = "Text3")
    public String getBicNachnahme() {
        return bicNachnahme;
    }


    public void setBicNachnahme(String bicNachnahme) {
        this.bicNachnahme = bicNachnahme;
    }

    @FormField(name = "Text4")
    public String getIbanNachnahme() {
        return ibanNachnahme;
    }


    public void setIbanNachnahme(String ibanNachnahme) {
        this.ibanNachnahme = ibanNachnahme;
    }

    @FormField(name = "Text5")
    public String getArticleOne() {
        return articleOne;
    }

    public void setArticleOne(String articleOne) {
        this.articleOne = articleOne;
    }

    @FormField(name = "Text6")
    public String getArticleTwo() {
        return articleTwo;
    }

    public void setArticleTwo(String articleTwo) {
        this.articleTwo = articleTwo;
    }

    @FormField(name = "Text7")
    public String getArticleThree() {
        return articleThree;
    }

    public void setArticleThree(String articleThree) {
        this.articleThree = articleThree;
    }

    @FormField(name = "Text8")
    public String getArticleFour() {
        return articleFour;
    }

    public void setArticleFour(String articleFour) {
        this.articleFour = articleFour;
    }

    @FormField(name = "Text9")
    public String getArticleFive() {
        return articleFive;
    }

    public void setArticleFive(String articleFive) {
        this.articleFive = articleFive;
    }

    @FormField(name = "EuroRow1")
    public String getEuroArticleOne() {
        return euroArticleOne;
    }

    public void setEuroArticleOne(String euroArticleOne) {
        this.euroArticleOne = euroArticleOne;
    }

    @FormField(name = "EuroRow2")
    public String getEuroArticleTwo() {
        return euroArticleTwo;
    }

    public void setEuroArticleTwo(String euroArticleTwo) {
        this.euroArticleTwo = euroArticleTwo;
    }

    @FormField(name = "EuroRow3")
    public String getEuroArticleThree() {
        return euroArticleThree;
    }

    public void setEuroArticleThree(String euroArticleThree) {
        this.euroArticleThree = euroArticleThree;
    }

    @FormField(name = "EuroRow4")
    public String getEuroArticleFour() {
        return euroArticleFour;
    }

    public void setEuroArticleFour(String euroArticleFour) {
        this.euroArticleFour = euroArticleFour;
    }

    @FormField(name = "Text10")
    public String getEuroArticleFive() {
        return euroArticleFive;
    }

    public void setEuroArticleFive(String euroArticleFive) {
        this.euroArticleFive = euroArticleFive;
    }

    @FormField(name = "CentRow1")
    public String getCentArticleOne() {
        return centArticleOne;
    }

    public void setCentArticleOne(String centArticleOne) {
        this.centArticleOne = centArticleOne;
    }

    @FormField(name = "CentRow2")
    public String getCentArticleTwo() {
        return centArticleTwo;
    }

    public void setCentArticleTwo(String centArticleTwo) {
        this.centArticleTwo = centArticleTwo;
    }

    @FormField(name = "CentRow3")
    public String getCentArticleThree() {
        return centArticleThree;
    }

    public void setCentArticleThree(String centArticleThree) {
        this.centArticleThree = centArticleThree;
    }

    @FormField(name = "CentRow4")
    public String getCentArticleFour() {
        return centArticleFour;
    }

    public void setCentArticleFour(String centArticleFour) {
        this.centArticleFour = centArticleFour;
    }

    @FormField(name = "CentSumme Brutto abzüglich USt nach  2 UStG  Summe Netto")
    public String getCentArticleFive() {
        return centArticleFive;
    }

    public void setCentArticleFive(String centArticleFive) {
        this.centArticleFive = centArticleFive;
    }

    @FormField(name = "Text11")
    public String getEuroSumBrutto() {
        return euroSumBrutto;
    }

    public void setEuroSumBrutto(String euroSumBrutto) {
        this.euroSumBrutto = euroSumBrutto;
    }

    @FormField(name = "CentSumme Brutto abzüglich USt nach  2 UStG  Summe Netto_2")
    public String getCentSumBrutto() {
        return centSumBrutto;
    }

    public void setCentSumBrutto(String centSumBrutto) {
        this.centSumBrutto = centSumBrutto;
    }

    @FormField(name = "EuroSumme Brutto abzüglich USt nach  2 UStG  Summe Netto_2")
    public String getEuroUst() {
        return euroUst;
    }

    public void setEuroUst(String euroUst) {
        this.euroUst = euroUst;
    }

    @FormField(name = "CentSumme Brutto abzüglich USt nach  2 UStG  Summe Netto_3")
    public String getCentUst() {
        return centUst;
    }

    public void setCentUst(String centUst) {
        this.centUst = centUst;
    }

    @FormField(name = "EuroSumme Brutto abzüglich USt nach  2 UStG  Summe Netto_3")
    public String getEuroSumNetto() {
        return euroSumNetto;
    }

    public void setEuroSumNetto(String euroSumNetto) {
        this.euroSumNetto = euroSumNetto;
    }

    @FormField(name = "CentSumme Brutto abzüglich USt nach  2 UStG  Summe Netto_4")
    public String getCentSumNetto() {
        return centSumNetto;
    }

    public void setCentSumNetto(String centSumNetto) {
        this.centSumNetto = centSumNetto;
    }

    @Override
    public String toString() {
        return "NachforschungsauftragPOJO{" +
                "dhlPackage=" + dhlPackage +
                ", nachnahmeSendung=" + nachnahmeSendung +
                ", paeckchenOderWarensendung=" + paeckchenOderWarensendung +
                ", internationalPackage=" + internationalPackage +
                ", paeckchenInternational=" + paeckchenInternational +
                ", unfrei=" + unfrei +
                ", isHigherInsured2500=" + isHigherInsured2500 +
                ", isHigherInsured25000=" + isHigherInsured25000 +
                ", sentDate='" + sentDate + '\'' +
                ", shipmentWeight='" + shipmentWeight + '\'' +
                ", bankNachnahme='" + bankNachnahme + '\'' +
                ", verwendungszweckNachnahme='" + verwendungszweckNachnahme + '\'' +
                ", senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", senderStreetHouseNo='" + senderStreetHouseNo + '\'' +
                ", receiverStreetHouseNo='" + receiverStreetHouseNo + '\'' +
                ", senderPlzOrt='" + senderPlzOrt + '\'' +
                ", receiverPlzOrt='" + receiverPlzOrt + '\'' +
                ", senderCountry='" + senderCountry + '\'' +
                ", receiverCountry='" + receiverCountry + '\'' +
                ", senderPhoneEmail='" + senderPhoneEmail + '\'' +
                ", receiverPhoneEmail='" + receiverPhoneEmail + '\'' +
                ", refundIban='" + refundIban + '\'' +
                ", refundBic='" + refundBic + '\'' +
                ", refundBank='" + refundBank + '\'' +
                ", refundDifferentNameOfAccountHolder='" + refundDifferentNameOfAccountHolder + '\'' +
                ", refundDifferentAddressOfAccountHolder='" + refundDifferentAddressOfAccountHolder + '\'' +
                ", sendungsnummer='" + sendungsnummer + '\'' +
                ", amountNachnahme='" + amountNachnahme + '\'' +
                ", bicNachnahme='" + bicNachnahme + '\'' +
                ", ibanNachnahme='" + ibanNachnahme + '\'' +
                ", articleOne='" + articleOne + '\'' +
                ", articleTwo='" + articleTwo + '\'' +
                ", articleThree='" + articleThree + '\'' +
                ", articleFour='" + articleFour + '\'' +
                ", articleFive='" + articleFive + '\'' +
                ", euroArticleOne='" + euroArticleOne + '\'' +
                ", euroArticleTwo='" + euroArticleTwo + '\'' +
                ", euroArticleThree='" + euroArticleThree + '\'' +
                ", euroArticleFour='" + euroArticleFour + '\'' +
                ", euroArticleFive='" + euroArticleFive + '\'' +
                ", centArticleOne='" + centArticleOne + '\'' +
                ", centArticleTwo='" + centArticleTwo + '\'' +
                ", centArticleThree='" + centArticleThree + '\'' +
                ", centArticleFour='" + centArticleFour + '\'' +
                ", centArticleFive='" + centArticleFive + '\'' +
                ", euroSumBrutto='" + euroSumBrutto + '\'' +
                ", centSumBrutto='" + centSumBrutto + '\'' +
                ", euroUst='" + euroUst + '\'' +
                ", centUst='" + centUst + '\'' +
                ", euroSumNetto='" + euroSumNetto + '\'' +
                ", centSumNetto='" + centSumNetto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NachforschungsauftragPOJO)) return false;

        NachforschungsauftragPOJO that = (NachforschungsauftragPOJO) o;

        if (isDhlPackage() != that.isDhlPackage()) return false;
        if (isNachnahmeSendung() != that.isNachnahmeSendung()) return false;
        if (isPaeckchenOderWarensendung() != that.isPaeckchenOderWarensendung()) return false;
        if (isInternationalPackage() != that.isInternationalPackage()) return false;
        if (isPaeckchenInternational() != that.isPaeckchenInternational()) return false;
        if (isUnfrei() != that.isUnfrei()) return false;
        if (isHigherInsured2500() != that.isHigherInsured2500()) return false;
        if (isHigherInsured25000() != that.isHigherInsured25000()) return false;
        if (getSentDate() != null ? !getSentDate().equals(that.getSentDate()) : that.getSentDate() != null)
            return false;
        if (getShipmentWeight() != null ? !getShipmentWeight().equals(that.getShipmentWeight()) : that.getShipmentWeight() != null)
            return false;
        if (getBankNachnahme() != null ? !getBankNachnahme().equals(that.getBankNachnahme()) : that.getBankNachnahme() != null)
            return false;
        if (getVerwendungszweckNachnahme() != null ? !getVerwendungszweckNachnahme().equals(that.getVerwendungszweckNachnahme()) : that.getVerwendungszweckNachnahme() != null)
            return false;
        if (getSenderName() != null ? !getSenderName().equals(that.getSenderName()) : that.getSenderName() != null)
            return false;
        if (getReceiverName() != null ? !getReceiverName().equals(that.getReceiverName()) : that.getReceiverName() != null)
            return false;
        if (getSenderStreetHouseNo() != null ? !getSenderStreetHouseNo().equals(that.getSenderStreetHouseNo()) : that.getSenderStreetHouseNo() != null)
            return false;
        if (getReceiverStreetHouseNo() != null ? !getReceiverStreetHouseNo().equals(that.getReceiverStreetHouseNo()) : that.getReceiverStreetHouseNo() != null)
            return false;
        if (getSenderPlzOrt() != null ? !getSenderPlzOrt().equals(that.getSenderPlzOrt()) : that.getSenderPlzOrt() != null)
            return false;
        if (getReceiverPlzOrt() != null ? !getReceiverPlzOrt().equals(that.getReceiverPlzOrt()) : that.getReceiverPlzOrt() != null)
            return false;
        if (getSenderCountry() != null ? !getSenderCountry().equals(that.getSenderCountry()) : that.getSenderCountry() != null)
            return false;
        if (getReceiverCountry() != null ? !getReceiverCountry().equals(that.getReceiverCountry()) : that.getReceiverCountry() != null)
            return false;
        if (getSenderPhoneEmail() != null ? !getSenderPhoneEmail().equals(that.getSenderPhoneEmail()) : that.getSenderPhoneEmail() != null)
            return false;
        if (getReceiverPhoneEmail() != null ? !getReceiverPhoneEmail().equals(that.getReceiverPhoneEmail()) : that.getReceiverPhoneEmail() != null)
            return false;
        if (getRefundIban() != null ? !getRefundIban().equals(that.getRefundIban()) : that.getRefundIban() != null)
            return false;
        if (getRefundBic() != null ? !getRefundBic().equals(that.getRefundBic()) : that.getRefundBic() != null)
            return false;
        if (getRefundBank() != null ? !getRefundBank().equals(that.getRefundBank()) : that.getRefundBank() != null)
            return false;
        if (getRefundDifferentNameOfAccountHolder() != null ? !getRefundDifferentNameOfAccountHolder().equals(that.getRefundDifferentNameOfAccountHolder()) : that.getRefundDifferentNameOfAccountHolder() != null)
            return false;
        if (getRefundDifferentAddressOfAccountHolder() != null ? !getRefundDifferentAddressOfAccountHolder().equals(that.getRefundDifferentAddressOfAccountHolder()) : that.getRefundDifferentAddressOfAccountHolder() != null)
            return false;
        if (getSendungsnummer() != null ? !getSendungsnummer().equals(that.getSendungsnummer()) : that.getSendungsnummer() != null)
            return false;
        if (getAmountNachnahme() != null ? !getAmountNachnahme().equals(that.getAmountNachnahme()) : that.getAmountNachnahme() != null)
            return false;
        if (getBicNachnahme() != null ? !getBicNachnahme().equals(that.getBicNachnahme()) : that.getBicNachnahme() != null)
            return false;
        if (getIbanNachnahme() != null ? !getIbanNachnahme().equals(that.getIbanNachnahme()) : that.getIbanNachnahme() != null)
            return false;
        if (getArticleOne() != null ? !getArticleOne().equals(that.getArticleOne()) : that.getArticleOne() != null)
            return false;
        if (getArticleTwo() != null ? !getArticleTwo().equals(that.getArticleTwo()) : that.getArticleTwo() != null)
            return false;
        if (getArticleThree() != null ? !getArticleThree().equals(that.getArticleThree()) : that.getArticleThree() != null)
            return false;
        if (getArticleFour() != null ? !getArticleFour().equals(that.getArticleFour()) : that.getArticleFour() != null)
            return false;
        if (getArticleFive() != null ? !getArticleFive().equals(that.getArticleFive()) : that.getArticleFive() != null)
            return false;
        if (getEuroArticleOne() != null ? !getEuroArticleOne().equals(that.getEuroArticleOne()) : that.getEuroArticleOne() != null)
            return false;
        if (getEuroArticleTwo() != null ? !getEuroArticleTwo().equals(that.getEuroArticleTwo()) : that.getEuroArticleTwo() != null)
            return false;
        if (getEuroArticleThree() != null ? !getEuroArticleThree().equals(that.getEuroArticleThree()) : that.getEuroArticleThree() != null)
            return false;
        if (getEuroArticleFour() != null ? !getEuroArticleFour().equals(that.getEuroArticleFour()) : that.getEuroArticleFour() != null)
            return false;
        if (getEuroArticleFive() != null ? !getEuroArticleFive().equals(that.getEuroArticleFive()) : that.getEuroArticleFive() != null)
            return false;
        if (getCentArticleOne() != null ? !getCentArticleOne().equals(that.getCentArticleOne()) : that.getCentArticleOne() != null)
            return false;
        if (getCentArticleTwo() != null ? !getCentArticleTwo().equals(that.getCentArticleTwo()) : that.getCentArticleTwo() != null)
            return false;
        if (getCentArticleThree() != null ? !getCentArticleThree().equals(that.getCentArticleThree()) : that.getCentArticleThree() != null)
            return false;
        if (getCentArticleFour() != null ? !getCentArticleFour().equals(that.getCentArticleFour()) : that.getCentArticleFour() != null)
            return false;
        if (getCentArticleFive() != null ? !getCentArticleFive().equals(that.getCentArticleFive()) : that.getCentArticleFive() != null)
            return false;
        if (getEuroSumBrutto() != null ? !getEuroSumBrutto().equals(that.getEuroSumBrutto()) : that.getEuroSumBrutto() != null)
            return false;
        if (getCentSumBrutto() != null ? !getCentSumBrutto().equals(that.getCentSumBrutto()) : that.getCentSumBrutto() != null)
            return false;
        if (getEuroUst() != null ? !getEuroUst().equals(that.getEuroUst()) : that.getEuroUst() != null) return false;
        if (getCentUst() != null ? !getCentUst().equals(that.getCentUst()) : that.getCentUst() != null) return false;
        if (getEuroSumNetto() != null ? !getEuroSumNetto().equals(that.getEuroSumNetto()) : that.getEuroSumNetto() != null)
            return false;
        return getCentSumNetto() != null ? getCentSumNetto().equals(that.getCentSumNetto()) : that.getCentSumNetto() == null;

    }

    @Override
    public int hashCode() {
        int result = (isDhlPackage() ? 1 : 0);
        result = 31 * result + (isNachnahmeSendung() ? 1 : 0);
        result = 31 * result + (isPaeckchenOderWarensendung() ? 1 : 0);
        result = 31 * result + (isInternationalPackage() ? 1 : 0);
        result = 31 * result + (isPaeckchenInternational() ? 1 : 0);
        result = 31 * result + (isUnfrei() ? 1 : 0);
        result = 31 * result + (isHigherInsured2500() ? 1 : 0);
        result = 31 * result + (isHigherInsured25000() ? 1 : 0);
        result = 31 * result + (getSentDate() != null ? getSentDate().hashCode() : 0);
        result = 31 * result + (getShipmentWeight() != null ? getShipmentWeight().hashCode() : 0);
        result = 31 * result + (getBankNachnahme() != null ? getBankNachnahme().hashCode() : 0);
        result = 31 * result + (getVerwendungszweckNachnahme() != null ? getVerwendungszweckNachnahme().hashCode() : 0);
        result = 31 * result + (getSenderName() != null ? getSenderName().hashCode() : 0);
        result = 31 * result + (getReceiverName() != null ? getReceiverName().hashCode() : 0);
        result = 31 * result + (getSenderStreetHouseNo() != null ? getSenderStreetHouseNo().hashCode() : 0);
        result = 31 * result + (getReceiverStreetHouseNo() != null ? getReceiverStreetHouseNo().hashCode() : 0);
        result = 31 * result + (getSenderPlzOrt() != null ? getSenderPlzOrt().hashCode() : 0);
        result = 31 * result + (getReceiverPlzOrt() != null ? getReceiverPlzOrt().hashCode() : 0);
        result = 31 * result + (getSenderCountry() != null ? getSenderCountry().hashCode() : 0);
        result = 31 * result + (getReceiverCountry() != null ? getReceiverCountry().hashCode() : 0);
        result = 31 * result + (getSenderPhoneEmail() != null ? getSenderPhoneEmail().hashCode() : 0);
        result = 31 * result + (getReceiverPhoneEmail() != null ? getReceiverPhoneEmail().hashCode() : 0);
        result = 31 * result + (getRefundIban() != null ? getRefundIban().hashCode() : 0);
        result = 31 * result + (getRefundBic() != null ? getRefundBic().hashCode() : 0);
        result = 31 * result + (getRefundBank() != null ? getRefundBank().hashCode() : 0);
        result = 31 * result + (getRefundDifferentNameOfAccountHolder() != null ? getRefundDifferentNameOfAccountHolder().hashCode() : 0);
        result = 31 * result + (getRefundDifferentAddressOfAccountHolder() != null ? getRefundDifferentAddressOfAccountHolder().hashCode() : 0);
        result = 31 * result + (getSendungsnummer() != null ? getSendungsnummer().hashCode() : 0);
        result = 31 * result + (getAmountNachnahme() != null ? getAmountNachnahme().hashCode() : 0);
        result = 31 * result + (getBicNachnahme() != null ? getBicNachnahme().hashCode() : 0);
        result = 31 * result + (getIbanNachnahme() != null ? getIbanNachnahme().hashCode() : 0);
        result = 31 * result + (getArticleOne() != null ? getArticleOne().hashCode() : 0);
        result = 31 * result + (getArticleTwo() != null ? getArticleTwo().hashCode() : 0);
        result = 31 * result + (getArticleThree() != null ? getArticleThree().hashCode() : 0);
        result = 31 * result + (getArticleFour() != null ? getArticleFour().hashCode() : 0);
        result = 31 * result + (getArticleFive() != null ? getArticleFive().hashCode() : 0);
        result = 31 * result + (getEuroArticleOne() != null ? getEuroArticleOne().hashCode() : 0);
        result = 31 * result + (getEuroArticleTwo() != null ? getEuroArticleTwo().hashCode() : 0);
        result = 31 * result + (getEuroArticleThree() != null ? getEuroArticleThree().hashCode() : 0);
        result = 31 * result + (getEuroArticleFour() != null ? getEuroArticleFour().hashCode() : 0);
        result = 31 * result + (getEuroArticleFive() != null ? getEuroArticleFive().hashCode() : 0);
        result = 31 * result + (getCentArticleOne() != null ? getCentArticleOne().hashCode() : 0);
        result = 31 * result + (getCentArticleTwo() != null ? getCentArticleTwo().hashCode() : 0);
        result = 31 * result + (getCentArticleThree() != null ? getCentArticleThree().hashCode() : 0);
        result = 31 * result + (getCentArticleFour() != null ? getCentArticleFour().hashCode() : 0);
        result = 31 * result + (getCentArticleFive() != null ? getCentArticleFive().hashCode() : 0);
        result = 31 * result + (getEuroSumBrutto() != null ? getEuroSumBrutto().hashCode() : 0);
        result = 31 * result + (getCentSumBrutto() != null ? getCentSumBrutto().hashCode() : 0);
        result = 31 * result + (getEuroUst() != null ? getEuroUst().hashCode() : 0);
        result = 31 * result + (getCentUst() != null ? getCentUst().hashCode() : 0);
        result = 31 * result + (getEuroSumNetto() != null ? getEuroSumNetto().hashCode() : 0);
        result = 31 * result + (getCentSumNetto() != null ? getCentSumNetto().hashCode() : 0);
        return result;
    }
}
