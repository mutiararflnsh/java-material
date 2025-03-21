package library;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person {

    protected List<Book> borrowedBooks;

    public Member(int id, String name) {
        super(id, name);
        this.borrowedBooks = new ArrayList<>();
        // TODO Auto-generated constructor stub
    }

    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Sorry, the book you want to borrow with title \"" + book.getTitle()
                    + "\" is currently unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned \"" + book.getTitle() + "\"");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Member ID: " + id + ", Name: " + name + ", Borrowed Books: " + borrowedBooks.size());
    }

}
