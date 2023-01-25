package Dog;

 class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog("Laika", "Meticcio");
        d.size = 23;
        d.bark();
        System.out.println("The dog's name is: " + d.getName());
        System.out.println("The dog's breed is: " + d.getBreed());
    }
}
