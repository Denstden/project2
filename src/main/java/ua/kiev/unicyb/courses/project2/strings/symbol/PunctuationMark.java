package ua.kiev.unicyb.courses.project2.strings.symbol;

/**
 * <p>Class PunctuationMark is a class that allows to create one of the types of {@link AbstractSymbol} punctuation mark.</p>
 * Object <code>PunctuationMark</code> inherits all fields of class {@link AbstractSymbol} and allows to get the
 * string value of punctuation mark.
 *
 * @author Denst
 * @version 1.0
 */
public class PunctuationMark extends AbstractSymbol implements ComponentOfSentence {

    /**
     * Creates a new punctuation mark with the given <code>value</code>.
     *
     * @param value the value of a created punctuation mark.
     */
    public PunctuationMark(char value) {
        super(value);
    }

    @Override
    public String getStringValue(){
        return ""+value;
    }
}
