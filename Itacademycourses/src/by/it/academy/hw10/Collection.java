package by.it.academy.hw10;

import java.util.HashSet;
import java.util.Set;

public class Collection {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
    public static void printSet(String name, Set set){
        System.out.println(" " + name + " " + set);
    }
}
