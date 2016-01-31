package ua.kiev.unicyb.courses.project2.strings;

import com.sun.istack.internal.Nullable;
import ua.kiev.unicyb.courses.project2.strings.sentence.Sentence;
import ua.kiev.unicyb.courses.project2.strings.sentence.SentenceType;
import ua.kiev.unicyb.courses.project2.strings.symbol.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Class Parser is a class that allows to get an object of type {@link Text} from file.</p>
 *
 * @author Denst
 * @version 1.0
 */
public class Parser {
    /**
     * set of punctuation marks.
     */
    private static Set<Character> punctuationMarks = new HashSet<Character>(){{
        addAll(Arrays.asList('.', '?', '!', ';', ':', '-', '(', ')', '[', ']', '\'', '\"', '\\'));
    }};
    /**
     * set of white symbols.
     */
    private static Set<Character> whites = new HashSet<Character>(){{
        addAll(Arrays.asList('\t', ' '));
    }};

    /**
     *
     * @param filename name of file, where is text.
     * @return text for processing.
     */
    @Nullable
    public static Text getText(String filename){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(filename)));
            Text text = new Text();
            Sentence sentence = new Sentence();
            Word word = new Word();
            int c;
            while ((c = reader.read()) != -1) {
                char currentSymb = (char) c;
                if (punctuationMarks.contains(currentSymb)){
                    if (!word.isEmpty()){
                        sentence.addComponent(word);
                        word = new Word();
                        sentence.addComponent(new PunctuationMark(currentSymb));
                        if (sentence.getType()!= SentenceType.UNKNOWN){
                            text.addSentence(sentence);
                            sentence = new Sentence();
                        }
                    }
                    else{
                        sentence.addComponent(new PunctuationMark(currentSymb));
                    }
                }
                else if(whites.contains(currentSymb)){
                    if (!word.isEmpty()){
                        sentence.addComponent(word);
                        word = new Word();
                    }
                    sentence.addComponent(new White(currentSymb));
                }
                else if (Character.isLetter(currentSymb)){
                    word.addLetter(new Letter(currentSymb));
                }
                else if (Character.isDigit(currentSymb)){
                    word.addLetter(new Digit(currentSymb));
                }
                else{
                    word.addLetter(new Other(currentSymb));
                }
            }
            text.addSentence(sentence);
            reader.close();
            return text;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
