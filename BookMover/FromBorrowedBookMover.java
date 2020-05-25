public class FromBorrowedBookMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.BORROWED)) {
            System.out.println("Книга не в BORROWED, а в " + book.getStatus());
            return;
        }
        //Мой исправленный вариант
        switch (requestedStatus) {
            case AVAILABLE:
            case OVERDUED:
            case ARCHIVED:
                System.out.println("Переводим книгу " + book + " из BORROWED в " + requestedStatus);
                book.setStatus(requestedStatus);
                break;
            case BORROWED:
                System.out.println("Книга уже в BORROWED!");
                break;

        }
        //Старый вариант
        /*switch (requestedStatus) {
            case ARCHIVED:
                System.out.println("Переводим книгу " + book + " из BORROWED в " + requestedStatus);
                book.setStatus(requestedStatus);
                break;
            case AVAILABLE:
            case OVERDUED:
                System.out.println("Перевод книги " + book + " из AVAILABLE в " + requestedStatus + " невозможен!");
                break;
            case BORROWED:
                System.out.println("Книга уже в BORROWED!");
                break;

        }*/
    }
}
/*Мой исправленный вариант

switch (requestedStatus) {
        case AVAILABLE:
        case OVERDUED:
        case ARCHIVED:
        System.out.println("Переводим книгу " + book + " из BORROWED в " + requestedStatus);
        book.setStatus(requestedStatus);
        break;
        case BORROWED:
        System.out.println("Книга уже в BORROWED!");
        break;

        }
 */