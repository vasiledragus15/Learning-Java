package InheritanceEs;

class C extends A {
    C(int i) {
        super(i);
        B b = new B(i);
    }
}
