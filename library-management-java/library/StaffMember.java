package library;

public class StaffMember extends Member {
    private String position;

    public StaffMember(int id, String name, String position) {
        super(id, name);
        this.position = position;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            System.out.println(name + " (Staff) borrowed \"" + book.getTitle() + "\"");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Staff ID: " + id + ", Name: " + name + ", Position: " + position +
                ", Borrowed Books: " + borrowedBooks.size());
    }
}
