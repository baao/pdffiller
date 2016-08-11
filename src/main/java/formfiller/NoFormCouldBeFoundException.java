package formfiller;

public class NoFormCouldBeFoundException extends Exception{

    public NoFormCouldBeFoundException() {
        super("There's no form found in the document!");
    }
}
