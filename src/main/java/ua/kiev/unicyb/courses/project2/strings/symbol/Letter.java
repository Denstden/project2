package ua.kiev.unicyb.courses.project2.strings.symbol;

/**
 * <p>Class Letter is a class that allows to create one of the types of {@link AbstractSymbol} letter.</p>
 * Object <code>Letter</code> inherits all fields of class {@link AbstractSymbol} and allows to get the upper or lower
 * value of letter.
 *
 * @author Denst
 * @version 1.0
 */
public class Letter extends AbstractSymbol implements ComponentOfWord {

    /**
     * Creates a new letter with the given <code>value</code>.
     *
     * @param value the value of a created letter.
     */
    public Letter(char value) {
        super(value);
    }

    /**
     *
     * @return upper value of letter.
     */
    public AbstractSymbol toUpper(){
        return new Letter(Character.toUpperCase(value));
    }

    /**
     *
     * @return lower value of letter.
     */
    public AbstractSymbol toLower(){
        return new Letter(Character.toLowerCase(value));
    }
}
