package Sorting;

import java.util.*;


public class SortMountains{
    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255 ));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered: \n" + mountains);

        mountains.sort((mount1, mount2) -> mount1.getMountainName().compareTo(mount2.getMountainName()));
        System.out.println("by name: \n" + mountains);

        mountains.sort((mount1, mount2) -> mount2.getMountainHeight() - mount1.getMountainHeight());
        System.out.println("by height: \n" + mountains);
    }
}