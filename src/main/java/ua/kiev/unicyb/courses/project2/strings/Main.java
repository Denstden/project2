package ua.kiev.unicyb.courses.project2.strings;

/**
 * ������� ��������� ��������� ������ �������� �� ���������������� � �������������� �������: ������, �����, �����������,
 * ���� ���������� � ��. �� ���� ������� � ������������� ������ �������� ��������� � ������������������ �������� ����� ��������.
 *
 * 15.	������������� ������ ����� � ������, ������ �� ���� ��� ����������� ��������� ������ ����� ����� �����.
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
