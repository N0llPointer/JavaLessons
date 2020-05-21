public class Book  {
    private String name; //название книги
    private String author; //автор книги
    private String ISBN; //уникальный код книги ISBN
    private int year; //год издания книиги
    private String publisher; //издатель книги
    private String text; //текст книги

    public Book(String name, String author, String ISBN, int year, String publisher, String text) { //конструктор класса "Книга"
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
        this.publisher = publisher;
        this.text = text;
    }

    @Override
    public String toString() {  //toString для этого класса
        return "Название книги : " + name + "\n" +
                "Автор: " + author + "\n" +
                "Год издания: " + year + "\n" +
                "Издатель: " + publisher + "\n" +
                "ISBN: " + ISBN + "\n" +
                "Текст: " + text;
    }

    @Override
    public boolean equals(Object obj) { //сравнение объектов класса "Книга"
        if(obj instanceof Book){  //Если сравниваемый объект другого класса, то сразу возвращается false
            return this.ISBN.equals(((Book) obj).ISBN); // Если объекты одинакового класса, то сравниваются ISBN книг
        }else
            return false;
    }

    public String printBook(){   // Метод для вывода книги в печать, просто копия toString
        return "Название книги : " + name + "\n" +
                "Автор: " + author + "\n" +
                "Год издания: " + year + "\n" +
                "Издатель: " + publisher + "\n" +
                "ISBN: " + ISBN + "\n" +
                "Текст: " + text;
    }

    /*
     Все остальные методы - это так называемые getter - то есть, методы для получения защищенных переменных файлов.
     Такой подход является "хорошим тоном", так как код становится читаемым, и не нарушаются принципы ООП (а именно, инкапсуляция)
     */
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getText() {
        return text;
    }
}
