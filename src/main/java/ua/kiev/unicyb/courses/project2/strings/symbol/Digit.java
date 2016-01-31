package ua.kiev.unicyb.courses.project2.strings.symbol;

/**
 * <p>Class Digit is a class that allows to create one of the types of {@link AbstractSymbol} digit.</p>
 * Object <code>Digit</code> inherits all fields of class {@link AbstractSymbol} and allows to get the int value of Digit.
 *
 * @author Denst
 * @version 1.0
 */
public class Digit extends AbstractSymbol implements ComponentOfWord {

    /**
     * Creates a new digit with the given <code>value</code>.
     *
     * @param value the value of a created digit.
     */
    public Digit(char value) {
        super(value);
    }

    /**
     * Creates a new digit with the given <code>value</code>.
     *
     * @param value the value of a created digit.
     */
    public Digit(int value) {
        super((char) value);
    }

    /**
     * @return integer value of digit.
     */
    public int intValue() {
        return value;
    }
}
