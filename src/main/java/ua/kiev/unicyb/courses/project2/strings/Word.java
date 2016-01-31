package ua.kiev.unicyb.courses.project2.strings;

import ua.kiev.unicyb.courses.project2.strings.symbol.ComponentOfSentence;
import ua.kiev.unicyb.courses.project2.strings.symbol.ComponentOfWord;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Class Word is a class that allows to create a word with sequence of different {@link ComponentOfWord}.</p>
 * Object <code>Word</code> defines word in a form of one parameter
 * <code>components</code>, where
 * <ul>
 * <li><code>components</code> - an object of type {@link List}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 */
public class Word implements ComponentOfSentence {
    /**
     * components, which make up a word.
     */
    private List<ComponentOfWord> components;

    /**
     * Creates a new empty word - word without symbols.
     */
    public Word() {
        components = new ArrayList<>();
    }

    /**
     * Creates a new word which consists of the <code>components</code>.
     *
     * @param components list of components, which makes a new word.
     */
    public Word(ArrayList<ComponentOfWord> components) {
        this.components = components;
    }

    /**
     *
     * @return <code>true</code> if word is empty
     *         <code>false</code> if word is not empty.
     */
    public boolean isEmpty(){
        return components.isEmpty();
    }

    /**
     * Adds a letter in the word.
     *
     * @param letter the letter to add.
     */
    public void addLetter(ComponentOfWord letter){
        components.add(letter);
    }

    public List<ComponentOfWord> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentOfWord> components) {
        this.components = components;
    }

    /**
     * Deletes all subsequent occurrences of the word the first letter of the word.
     */
    public void removeFirstOccurrence(){
        if (components.size()!=0) {
            char first = components.get(0).getValue();
            int i = 1;
            ComponentOfWord componentOfWord;
            while (i < components.size()) {
                componentOfWord = components.get(i);
                if (componentOfWord.getValue()==first) {
                    components.remove(i);
                } else {
                    i++;
                }
            }
        }
    }

    @Override
    public String getStringValue() {
        String res = "";
        for (ComponentOfWord componentOfWord : components){
            res+= componentOfWord.getValue();
        }
        return res;
    }
}
