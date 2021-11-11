import pr2.src.author.*;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Miki Liv", "kjhb@mail.com",'M');
        Author a2 = new Author("Nora Ukiti", "jbnhg@mail,com", 'U');
        Author a3 = new Author("Laura Novil", "njhfrd@mail.com", 'F');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
