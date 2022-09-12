package homework.lesson_1_10;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return middleName.equals(author.middleName) && name.equals(author.name) && surName.equals(author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(middleName, name, surName);
    }
}
