package Point3D;

class UsePoint3D {
    public static void main (String[] args){
        Point3D p1 = new Point3D();
        p1.build (10.0 , 20.0 , 30.0);
        Point3D p2 = new Point3D();
        p2.build(10.0, 20.0, 31.0);
        System.out.println("Square modulus of p1 is: " + p1.getSquareModulus());
        System.out.println("Is p1 equal to p2? :" + p1.isEqual(p2));
    }
}
