public class FromAvailableBookMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.AVAILABLE)) {
            System.out.println("Книга не в AVAILABLE, а в " + book.getStatus());
            return;
        }
        switch (requestedStatus) {
            case ARCHIVED:
            case BORROWED:
                System.out.println("Переводим книгу " + book + " из AVAILABLE в " + requestedStatus);
                book.setStatus(requestedStatus);
                break;
            case OVERDUED:
                System.out.println("Перевод книги " + book + " из AVAILABLE в " + requestedStatus + " невозможен!");
                break;
            case AVAILABLE:
                System.out.println("Книга уже в AVAILABLE!");
                break;

        }
    }
}