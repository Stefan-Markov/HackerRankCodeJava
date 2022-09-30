package AbstractClass;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Book book = new MyBook();
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        book.setTitle(title);

        System.out.println(book.getTitle());
    }

    static abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return "The title is: "+ title;
        }
    }

    static class MyBook extends Book {

        @Override
        void setTitle(String s) {
            this.title = s;
        }
    }
}
