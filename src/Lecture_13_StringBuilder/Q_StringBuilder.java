package Lecture_13_StringBuilder;

public class Q_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony Stark");
        System.out.println(sb);

        // get char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char in string
        sb.insert(0, 'S');
        System.out.println(sb);

        // deleting in string
        sb.delete(0, 6);
        System.out.println(sb);

        // Append in a string
        sb.append(" Tony");
        System.out.println(sb);

        // length of a string
        System.out.println(sb.length());
    }
}
