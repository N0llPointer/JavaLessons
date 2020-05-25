public class FromArchivedBookMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.ARCHIVED)) {
            System.out.println("Книга не в ARCHIVED, а в " + book.getStatus());
            return;
        }
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.println("Книга уже в ARCHIVED");
                break;
            case OVERDUED:
                System.out.println("Перевод книги " + book + " из ARCHIVED в OVERDUED невозможен!");
                break;
            case AVAILABLE:
                System.out.println("Переводим книгу " + book + "из ARCHIVED в AVAILABLE");
                book.setStatus(requestedStatus);
                break;
            case BORROWED:
                System.out.println("Перевод книги " + book + " из ARCHIVED в BORROWED невозможен!");
                break;

        }
    }
}

/* Мой исправленный вариант

switch (requestedStatus) {
            case AVAILABLE:
                System.out.println("Переводим книгу " + book + "из ARCHIVED в " + requestedStatus);
                book.setStatus(Status.BORROWED);
                break;
            case BORROWED:
            case OVERDUED:
                System.out.println("Перевод книги " + book + " из ARCHIVED в " + requestedStatus + " невозможен!");
                break;
            case ARCHIVED:
                System.out.println("Книга уже в ARCHIVED");
                break;

        }

 */