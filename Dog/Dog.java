package Dog;

 class Dog {
    int size;
    private String breed;
    private String name;
    public Dog(String name , String breed){
        this.name = name;
        this.breed = breed;
    }

    void bark(){
        System.out.println("Ruff! Ruff!");
    }
    
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
}
