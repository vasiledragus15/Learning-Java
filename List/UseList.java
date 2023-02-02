package List;

public class UseList {
    public static void main(String[] args) {
        List<Integer> list = new List<>(10,
                        new List<>(20,
                        new List<>(30,
                        new List<>(40,null))));
        
        int first = list.getHead();
        int second = list.getTail().getHead();
        int third = list.getTail().getTail().getHead();
        System.out.println(first + " " + second + " " + third);
        System.out.println(list.toString());
        System.out.println(list.getLenght());


        List<String> list2 = new List<>("a", 
                    new List<>("b",
                    new List<>("c", 
                    new List<>("d", null))));
        System.out.println(list2.toString());
        System.out.println(list2.getLenght());
        
    }
    
}