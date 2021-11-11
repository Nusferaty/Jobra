package jaava.src.book;

public class Book {
    private String name;
    private int sections;

    public Book(String n, int s) {
        name = n;
        sections = s;
    }

    public Book(String n) {
        name = n;
        sections = 11;
    }

    public Book() {
        name = "Lord of the Rings";
        sections = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public int getSections() {
        return sections;
    }

    public String toString() {
        return " This book is called ' " + this.name + " ' and lies in section " + this.sections;
    }
}