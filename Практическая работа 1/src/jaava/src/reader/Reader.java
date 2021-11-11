import jaava.src.book.*;

public class Reader {
    public static void main(String[] args){
        Book b1 = new Book("Lord of the Rings", 10);
        Book b2 = new Book("Flight", 8);
        Book b3 = new Book("Bedtime Tales");
        b3.setSections(6);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
