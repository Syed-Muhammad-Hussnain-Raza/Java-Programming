package Lecture_12_String;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = "Syed Hussnain";
        String name2 = "Muhammad Ali" ;
        String name3 = "Syed Hussnain";

//        if (name1.compareTo(name3) == 0) {
//            System.out.println("Equal strings");
//        } else if (name1.compareTo(name3) == 1) {
//            System.out.println("Not equal");
//        }

        // Use of compareTo instead of ==
        if (new String("Name") == new String("Name")) {
            System.out.println("Equal strings");
        } else if (new String("Name") != new String("Name")) {
            System.out.println("Not equal");
        }
    }
}
