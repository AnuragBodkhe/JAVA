package Day12.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();       //Unordered Dataset    // HashSet
        //HashSet<Integer> set2 = new HashSet<>();

        set.add(1);
        set.add(20);                                    // No duplicates allowed
        set.add(10);
        set.add(30);
        set.add(1);

        System.out.println(set);

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();      // LinkedHashSet //Unoredred Dataset

        linkedSet.add(1);                                              // No duplicates allowed
        linkedSet.add(40);
        linkedSet.add(62);
        linkedSet.add(32);
        linkedSet.add(1);

        System.out.println(linkedSet);

        Set<Integer> treeSet = new TreeSet<>();       // TreeSet  // Sorted Dataset // Ordered Dataset

        treeSet.add(1);                              // No duplicates allowed
        treeSet.add(32);
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(1);

        System.out.println(treeSet);

    }
}
