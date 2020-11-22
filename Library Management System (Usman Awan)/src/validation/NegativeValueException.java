package validation;

public final class NegativeValueException extends Exception {

    public NegativeValueException() {
        super("Negative Values Found");
    }

    public static boolean checkNumbers(final int bookid, final int bookshelf, final int quantity, final double price) {
        return bookid < 0 || bookshelf < 0 || quantity < 0 || price < 0;
    }
}
