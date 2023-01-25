 class Tank{
    int level;
}
//Example that shows how the assignement and reference of objects work

public class Assignement {
    public static void main (String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9; 
        t2.level = 47;
        System.out.print("1: t1.level: " + t1.level + ", t2.level: " + t2.level + "\n");
        t1 = t2;
        System.out.print("2: t1.level: " + t1.level + ", t2.level: " + t2.level + "\n");
        t1.level = 27;
        System.out.print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}