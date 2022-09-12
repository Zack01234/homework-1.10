package homework.lesson_1_10;

public class Book {

    private String title;
    private int publishDate;
    private Author author;

    public Book(String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public int getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Книга - " + title + ", Дата публикации - " + publishDate + ", " + author;
    }
}
