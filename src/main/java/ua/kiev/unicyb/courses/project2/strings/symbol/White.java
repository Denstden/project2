package ua.kiev.unicyb.courses.project2.strings.symbol;

/**
 * <p>Class White is a class that allows to create one of the types of {@link AbstractSymbol} white symbol.</p>
 * Object <code>White</code> inherits all fields of class {@link AbstractSymbol} and allows to get the
 * string value of white symbol.
 *
 * @author Denst
 * @version 1.0
 */
public class White extends AbstractSymbol implements ComponentOfSentence {

    /**
     * Creates a new white symbol with the given <code>value</code>.
     *
     * @param value the value of a created white symbol.
     */
    public White(char value) {
        super(value);
    }

    @Override
    public String getStringValue() {
        return ""+value;
    }
}
