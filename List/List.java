package List;

public class List<X> {

    private final X head;
    private final List<X> tail;

    public List(final X head, final List<X> tail) {
        this.head = head;
        this.tail = tail;
    }

    public X getHead() {
        return head;
    }

    public List<X> getTail() {
        return tail;
    }

    public int getLenght() {
        return (this.tail == null) ? 1 : 1 + this.tail.getLenght();
    }
    public String toString() {
        return "List [head=" + head + ", tail=" + tail + "]";
    }

    
}