public class Book {
    protected String title;
    protected Status status;

    public Book(String title) {
        this.title = title;
        status = status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return title;
    }
}
