package Sorting;

public class Mountain {
    
    private final String mountainName;
    private final int mountainHeight;

    public Mountain(final String name, final int height) {
        this.mountainName = name;
        this.mountainHeight = height;
    }

    public String toString() {
        return mountainName + " " + mountainHeight ; 
    }

    public String getMountainName() {
        return mountainName;
    }

    public int getMountainHeight() {
        return mountainHeight;
    }
    
}
