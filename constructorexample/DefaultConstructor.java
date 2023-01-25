package constructorexample;

public class DefaultConstructor {
    String string = "Moby Gay";
    DefaultConstructor(){
        System.out.println(this.string);
    }
    DefaultConstructor(String s){
        System.out.println(s + "Ti amo Lollo Riccio");
    }
    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();
        DefaultConstructor dc1 = new DefaultConstructor("Dichiarazione d'intenti: ");
        
    }
}