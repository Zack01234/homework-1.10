package homework.lesson_1_10;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Сергеевич", "Пушкин");
        Book book = new Book("Барышня-крестьянка", 1831, new Author("Александр", "Сергеевич", "Пушкин"));
        book.setPublishDate(1831);
        System.out.println(book);

        Author author1 = new Author("Михаил", "Юрьевич", "Лермонтов");
        Book book1 = new Book("Мцыри",1840, new Author("Михаил", "Юрьевич", "Лермонтов"));
        book1.setPublishDate(1841);
        System.out.println(book1);

    }
}
