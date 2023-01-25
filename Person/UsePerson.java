package Person;

public class UsePerson {
    public static void main(String[] args){
        Person p1 = new Person("Mario rossi");
        Person p2 = new Person("Gino Bianchi", 1979);
        Person p3 = new Person("Carlo Verdi", 1971, true);
        System.out.println(p1.name + " " + p1.birth + " " + p1.married);
    }
}
