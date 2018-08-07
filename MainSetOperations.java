package MainSetOperations;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class MainSetOperations {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.removeAll(b);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }

    public static <T> void display(Set<T> set) {
        for (Iterator<T> it = set.iterator(); it.hasNext();) {
            System.out.print(" " + it.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Set<Integer> b = new HashSet<Integer>();
        b.add(5);
        b.add(3);
        b.add(6);
        b.add(1);
        System.out.print("a = ");
        display(a);
        System.out.print("b = ");
        display(b);
        System.out.print("union(a, b) = ");
        display(union(a, b));
        System.out.print("intersection(a, b) = ");
        display(intersection(a, b));
        System.out.print("difference(a, b) = ");
        display(difference(a, b));
        System.out.print("complement(a, b) = ");
        display(complement(a, b));
    }
}