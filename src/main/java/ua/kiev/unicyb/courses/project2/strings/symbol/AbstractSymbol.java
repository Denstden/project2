package ua.kiev.unicyb.courses.project2.strings.symbol;

/**
 * <p>AbstractSymbol is abstract base class for all kinds of symbols.</p>
 * Object <code>AbstractSymbol</code> defines symbol in a form of one parameter <code>value</code>, where
 * <ul>
 * <li><code>value</code> - an object of type {@link char}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 */
public abstract class AbstractSymbol {
    /**
     * the char value of a symbol.
     */
    protected char value;

    /**
     * Creates a new symbol.
     */
    public AbstractSymbol() {
    }

    /**
     * Creates a new symbol with the given <code>value</code>.
     *
     * @param value the value of a created symbol.
     */
    public AbstractSymbol(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
