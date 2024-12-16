package org.example;

public class Main {
    public static void main(String[] args) {

        String fullName = "Иванов Иван Иванович";
        String[] partsOfName = fullName.split(" ");
        String lastName = partsOfName[0];
        String firstName = partsOfName[1];
        String surname = partsOfName[2];
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(surname);
    }
}