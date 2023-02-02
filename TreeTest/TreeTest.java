package TreeTest;

import java.util.Set;
import java.util.TreeSet;

public class TreeTest {

    public static void main(String[] args) {
        new TreeTest().go();
    }
    
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        Book b4 = new Book("A spasso con tua mamma"); 
        
        Set<Book> tree = new TreeSet<>((book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);
        System.out.println(tree);
    }
}    
    
class Book {

    private final String title;

    public Book(final String title) {
        this.title = title;
    }

    public String toString(){
        return "title: " + this.title;
    }

    public String getTitle() {
        return title;
    }

}
