package formfiller;

class NoFormCouldBeFoundException extends Exception{
    NoFormCouldBeFoundException() {
        super("There's no form found in the document!");
    }
}
