package MapAndSets;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets_STL {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(9);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(8);
        set.add(7);

        System.out.println(set.size());
        System.out.println(set.contains(4));
        set.remove(4);
        System.out.println(set.size());
        System.out.println(set.contains(4));
        System.out.println(set);  //normal printing without any arrangement

        TreeSet<Integer> treeSet = new TreeSet<>();  //Ordered set and Balanced BST

        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(7);

        System.out.println(treeSet);  //here printing done in ordered manner   log n --> time complexity

        for(int ele : set){
            System.out.println(ele);
        }  // second way of traversal

    }


}
