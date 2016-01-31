package ua.kiev.unicyb.courses.project2.strings;

import ua.kiev.unicyb.courses.project2.strings.sentence.Sentence;
import ua.kiev.unicyb.courses.project2.strings.symbol.ComponentOfSentence;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Class Text is a class that allows to create a text with sequence of different {@link Sentence}.</p>
 * Object <code>Text</code> defines text in a form of one parameter
 * <code>sentences</code>, where
 * <ul>
 * <li><code>sentences</code> - an object of type {@link List}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 */
public class Text {
    /**
     * sentences, which make up a text.
     */
    private List<Sentence> sentences;

    /**
     * Creates a new empty text - text without components.
     */
    public Text() {
        sentences = new ArrayList<>();
    }

    /**
     * Creates a new sentence which consists of the <code>components</code>.
     *
     * @param sentences list of sentences, which makes a new text.
     */
    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    /**
     * Adds a sentence in the text.
     *
     * @param sentence the sentence to add.
     */
    public void addSentence(Sentence sentence){
        sentences.add(sentence);
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    /**
     * Replaces tabs and sequence of spaces in the text by a single space.
     */
    public void replaceTabulationsSequencesOfSpaces(){
        for (Sentence sentence:sentences) {
            sentence.replaceTabulationsSequencesOfSpaces();
        }
    }

    /**
     * Deletes all subsequent occurrences of the word the first letter of the each word in the text.
     */
    public void removeFirstOccurrence(){
        for (Sentence sentence:sentences){
            for (ComponentOfSentence componentOfSentence :sentence.getComponents()){
                if (componentOfSentence instanceof Word){
                    Word word =(Word) componentOfSentence;
                    word.removeFirstOccurrence();
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (Sentence sentence:sentences){
            res+=sentence.toString();
        }
        return res;
    }
}
