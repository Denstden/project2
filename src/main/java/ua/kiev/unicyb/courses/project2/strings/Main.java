package ua.kiev.unicyb.courses.project2.strings;

/**
 * Создать программу обработки текста учебника по программированию с использованием классов: Символ, Слово, Предложение,
 * Знак препинания и др. Во всех задачах с формированием текста заменять табуляции и последовательности пробелов одним пробелом.
 *
 * 15.	Преобразовать каждое слово в тексте, удалив из него все последующие вхождения первой буквы этого слова.
 */
public class Main {
    public static void main(String[] args) {
        Text text = Parser.getText("src/main/resources/input");
        if (text!=null) {
            text.replaceTabulationsSequencesOfSpaces();
            text.removeFirstOccurrence();
            System.out.println(text);
        }
    }
}
