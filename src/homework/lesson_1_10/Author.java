package homework.lesson_1_10;

public class Author {
    private String middleName;
    private String name;
    private String surName;

    public Author(String name, String surName, String middleName) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public String getMiddleName() {
        return middleName;
    }
    @Override
    public String toString() {
        return "Автор - " + middleName + " " + name + " " + surName;
    }
}
