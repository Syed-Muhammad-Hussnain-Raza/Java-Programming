package Lecture_12_String;

public class Strings {
    public static void main(String[] args) {
        String firstName = "Syed Muhammad Hussnain" ;
        String lastName  = "Raza" ;

        // Concatenate
        String fullName = firstName + " " + lastName;
        // String fullName = firstName.concat(lastName);

        System.out.println(fullName);

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compareTo

    }
}
