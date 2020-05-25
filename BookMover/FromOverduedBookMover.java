public class FromOverduedBookMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.OVERDUED)) {
            System.out.println("Книга не в OVERDUED, а в " + book.getStatus());
            return;
        }
        switch (requestedStatus) {
            case ARCHIVED:
            case AVAILABLE:
                System.out.println("Переводим книгу " + book + " из OVERDUED в " + requestedStatus);
                book.setStatus(requestedStatus);
                break;
            case BORROWED:
                System.out.println("Перевод книги " + book + " из AVAILABLE в " + requestedStatus + " невозможен!");
                break;
            case OVERDUED:
                System.out.println("Книга уже в OVERDUED!");
                break;

        }
    }
}