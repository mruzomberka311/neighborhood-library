package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

//Errors say duplicate class and I don't know how I can get my code to run
    //Very confused why I couldn't use my array in functions.
    //Overall felt confused with how to plan the code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[20];
        books[0] = new Book(7, "978-0-00-675402-02", "The Hobbit");
        books[1] = new Book(9, "272-0-00-432594-03", "The Fellowship of the Ring");
        books[2] = new Book(10, "412-0-00-890765-04", "The Two Towers");
        books[3] = new Book(12, "980-0-00-123897-05", "The Return of the King");


        //Prompt the user for an entry choice to find a book
        System.out.println("Please enter a descriptor of your desired book by number: ");
        System.out.println("To see inventory - 1");
        System.out.println("What is the book ID? - 2");
        System.out.println("What is the book International Book Number? - 3");
        System.out.println("What is the title? - 4 ");
        System.out.println("Exit - 5");
        int choice = scanner.nextInt();



//In case of ID, ISBN, or Title given return corrssponding book;
        switch (choice) {
            case 1:
                for (int i = 0; i < books.length; i++) {
                    System.out.println(books[i]);
                }
            case 2:
              getBookID(scanner);
              break;
            case 3:
             getbookIsbn(scanner);
            break;

            case 4:
               getBookTitle(scanner);

                break;
            case 5:
                return;

        }
        boolean isCheckedOut = false;

        System.out.println("Would you like to check out a book? Yes/No");
        String answer = scanner.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("What book would you like by title?");
            String checkOut = scanner.nextLine();
            System.out.println("Thank you for checking out" + checkOut);
        } else if (isCheckedOut = true) {
            System.out.println("This book has already been checked out");
            return;
        } else if (answer.equals("No")){
            return;

        }else{
            System.out.println("User input required");
        }return;

    }


}
    public static void getBookID (Scanner scanner){
        System.out.println("Enter your book id: ");
      int bookId = scanner.nextInt();

      for (int i = 0; i < books.length; i++){
          if (books[i].getBookId == bookId);
          System.out.println(books[i]);
      }


      public static void getBookIsbn(Scanner scanner){
        System.out.println("Please enter the book isbn: ");
        String code = scanner.nextLine();
        for (int i = 0; i < books.length; i++){
            System.out.println(code[i]);
            if (books[i].getBookIsbn[i].equals(code){
                System.out.println(books[i]);
            }


            public static void getBookTitle(Scanner scanner){
            System.out.println("Please enter your book title: ");
            String title = scanner.nextLine();
            for (int i = 0; i < books.length; i++);
            if (book[i].getTitle.equals(title)){
                System.out.println(books[i]);
            }

        }








        }



