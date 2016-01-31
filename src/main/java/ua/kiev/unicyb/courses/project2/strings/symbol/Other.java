package ua.kiev.unicyb.courses.project2.strings.symbol;

/**
 * <p>Class Other is a class that allows to create one of the types of {@link AbstractSymbol} other symbol. Other symbol it is
 * a symbol that is not a letter, digit, punctuation and white symbol.</p>
 * Object <code>Other</code> inherits all fields of class {@link AbstractSymbol}.
 *
 * @author Denst
 * @version 1.0
 */
public class Other extends AbstractSymbol implements ComponentOfWord {

    /**
     * Creates a new other symbol with the given <code>value</code>.
     *
     * @param value the value of a created other symbol.
     */
    public Other(char value) {
        super(value);
    }
}
