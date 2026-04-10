package week_6;

import java.util.HashSet;

public class SetOperations {


    public static HashSet<String> performUnion(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }


    public static HashSet<String> performIntersection(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }


    public static HashSet<String> performDifference(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

    public static void main(String[] args) {


        HashSet<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");


        HashSet<String> union = performUnion(set1, set2);
        HashSet<String> intersection = performIntersection(set1, set2);
        HashSet<String> difference = performDifference(set1, set2);


        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        System.out.println("\nUnion: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (Set1 - Set2): " + difference);
    }
}
