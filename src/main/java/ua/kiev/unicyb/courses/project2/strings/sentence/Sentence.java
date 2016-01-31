package ua.kiev.unicyb.courses.project2.strings.sentence;

import ua.kiev.unicyb.courses.project2.strings.symbol.ComponentOfSentence;
import ua.kiev.unicyb.courses.project2.strings.symbol.White;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Class Sentence is a class that allows to create a sentence with sequence of different {@link ComponentOfSentence}.</p>
 * Object <code>Sentence</code> defines sentence in a form of one parameter
 * <code>components</code>, where
 * <ul>
 * <li><code>components</code> - an object of type {@link List}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 */
public class Sentence {
    /**
     * components, which make up a sentence.
     */
    private List<ComponentOfSentence> components;

    /**
     * Creates a new empty sentence - sentence without components.
     */
    public Sentence() {
        components = new ArrayList<>();
    }

    /**
     * Creates a new sentence which consists of the <code>components</code>.
     *
     * @param components list of components, which makes a new sentence.
     */
    public Sentence(List<ComponentOfSentence> components) {
        this.components = components;
    }

    /**
     * Adds a component in the sentence.
     *
     * @param symbol the component of sentence to add.
     */
    public void addComponent(ComponentOfSentence symbol){
        components.add(symbol);
    }

    /**
     *
     * @return <code>true</code> if sentence is empty
     *         <code>false</code> if sentence is not empty.
     */
    public boolean isEmpty(){
        return  components.isEmpty();
    }

    /**
     *
     * @return the type of sentence.
     */
    public SentenceType getType(){
        if (components.isEmpty())
            return SentenceType.UNKNOWN;
        ComponentOfSentence last = components.get(components.size()-1);
        if (last.getStringValue().equals("."))
            return SentenceType.DECLARATIVE;
        if (last.getStringValue().equals("?"))
            return SentenceType.INTERROGATIVE;
        if (last.getStringValue().equals("!"))
            return SentenceType.EXCLAMATORY;
        return SentenceType.UNKNOWN;
    }

    /**
     * Replaces tabs and sequence of spaces in the sentence by a single space.
     */
    public void replaceTabulationsSequencesOfSpaces(){
        int i = 0;
        do {
            while (i < components.size()) {
                if (components.get(i) instanceof White) {
                    if (components.get(i).getStringValue().equals("\t")){
                        components.set(i, new White(' '));
                    }
                    break;
                }
                i++;
            }
            if (i != components.size()) {
                i++;
                while (i < components.size() && components.get(i) instanceof White) {
                    components.remove(components.get(i));
                }
            }
        } while (i < components.size());
    }

    public List<ComponentOfSentence> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentOfSentence> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        String res = "";
        for (ComponentOfSentence componentOfSentence : components){
            res+= componentOfSentence.getStringValue();
        }
        return res;
    }
}
