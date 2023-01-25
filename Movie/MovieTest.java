package Movie;

public class MovieTest{
    public static void main (String[] args){
        Movie one = new Movie("Gone With Stock", "Tragic", -2);
        System.out.println(one.getTitle());
        Movie two = new Movie("Lost in Cubicle Space", "Comedy", 5);
        two.playIt();
        Movie three = new Movie("Byte Club", "Tragic but ultimately uplifting", 127);
        System.out.println(three.getTitle());
    }
}