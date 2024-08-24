public class Lecture_10_Arrays {
    // Arrays in Java
    public static void main(String[] args) {
        int [] marks = new int[10];

        // Initializing array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (i + 1) * 5;
        }

        // Printing array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("mark[" + "]" + " = " + marks[i]);
        }
    }
}
