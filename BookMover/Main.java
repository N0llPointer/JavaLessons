public class Main {
    public static void main(String[] args) {
        Book book = new Book("Lord of the ring");
        Book newBook = new Book("The Hobbit");
        FromAvailableBookMover fromAvailable = new FromAvailableBookMover();
        FromArchivedBookMover fromArchived = new FromArchivedBookMover();
        FromBorrowedBookMover fromBorrowed = new FromBorrowedBookMover();
        FromOverduedBookMover fromOverdued = new FromOverduedBookMover();

        System.out.println("===1===");
        fromAvailable.moveToStatus(book, Status.OVERDUED);
        System.out.println(">>> " + book.getStatus() + "\n");

        System.out.println("===2===");
        fromArchived.moveToStatus(book, Status.AVAILABLE);
        System.out.println(">>> " + book.getStatus() + "\n");

        System.out.println("===3===");
        fromAvailable.moveToStatus(book, Status.BORROWED);
        System.out.println(">>> " + book.getStatus() + "\n");

        System.out.println("=====================");
        System.out.println("Правильный цикл книги");
        System.out.println("=====================");

        System.out.println("===1===");
        fromAvailable.moveToStatus(newBook,Status.AVAILABLE);
        fromAvailable.moveToStatus(newBook,Status.OVERDUED);
        fromAvailable.moveToStatus(newBook, Status.BORROWED);
        System.out.println(">>> " + newBook.getStatus() + "\n");

        System.out.println("===2===");
        fromBorrowed.moveToStatus(newBook, Status.BORROWED);
        fromBorrowed.moveToStatus(newBook, Status.OVERDUED);
        System.out.println(">>> " + newBook.getStatus() + "\n");

        System.out.println("===3===");
        fromOverdued.moveToStatus(newBook, Status.OVERDUED);
        fromOverdued.moveToStatus(newBook, Status.BORROWED);
        fromOverdued.moveToStatus(newBook, Status.ARCHIVED);
        System.out.println(">>> " + newBook.getStatus() + "\n");

        System.out.println("===4===");
        fromArchived.moveToStatus(newBook, Status.ARCHIVED);
        fromArchived.moveToStatus(newBook, Status.OVERDUED);
        fromArchived.moveToStatus(newBook, Status.AVAILABLE);
        System.out.println(">>> " + newBook.getStatus() + "\n");



    }
}