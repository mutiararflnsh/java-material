import library.Book;
import library.Library;
import library.StaffMember;
import library.Member;

public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library();

        Book mybook1 = new Book(1, "Death On The Nile", "Agatha Christie", 5);
        Book mybook2 = new Book(2, "Murder On Orient Express", "Agatha Christie", 3);
        Book mybook3 = new Book(2, "ABC Murder", "Agatha Christie", 1);

        library.addBook(mybook1);
        library.addBook(mybook2);
        library.addBook(mybook3);

        Member member1 = new Member(123, "Bubu");
        Member member2 = new Member(124, "Kucil");
        StaffMember staff1 = new StaffMember(231, "Moko", "Librarian");

        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(staff1);

        library.displayAvailableBooks();

        member1.borrowBook(mybook1);
        member2.borrowBook(mybook3);
        member1.borrowBook(mybook3);

        staff1.borrowBook(mybook1);
        staff1.borrowBook(mybook2);

        library.displayAvailableBooks();

        member1.returnBook(mybook1);
        staff1.returnBook(mybook2);

        library.displayAvailableBooks();
    }
}
