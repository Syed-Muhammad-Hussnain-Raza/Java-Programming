package Lecture_17_Recursion.Part2;

public class Q5_MoveAllX {
    private int count = 0;
    private String newString = "";

    public void moveAllXAtEnd(String str, int index) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        if (currentChar == 'x') {
            this.count++ ;
            moveAllXAtEnd(str, index + 1);
        } else {
            this.newString += currentChar;
            moveAllXAtEnd(str, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "axxxXxbcxxxxxxxd";

        Q5_MoveAllX obj = new Q5_MoveAllX();
        obj.moveAllXAtEnd(str, 0);
    }
}
