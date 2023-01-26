package Cars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cars {
    public static void main(String[] args) {
        Collection<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Fiat");
        cars.add("Ferrari");

        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}