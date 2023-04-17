package by.it.academy.hw17.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class Main  {
    public static void main(String[] args){
        Class<HashMap> hashMapClass = HashMap.class;

        getInfoHashMap(hashMapClass);
        getInfoAboutInnerClasses(hashMapClass);
    }

    public static void getInfoHashMap(Class<HashMap> hashMapClass){
        Field[] fields = hashMapClass.getDeclaredFields();
        System.out.println("Fields of the HashMap class: " + Arrays.toString(fields));

        Class superClass = hashMapClass.getSuperclass();
        System.out.println("Parent class of the HashMap class: " + superClass);

        Constructor[] constructors = hashMapClass.getDeclaredConstructors();
        System.out.println("HashMap class constructors: " + Arrays.toString(constructors));

        Method[] methods = hashMapClass.getDeclaredMethods();
        System.out.println("HashMap Class Methods: " + Arrays.toString(methods));
    }

    public static void getInfoAboutInnerClasses(Class<HashMap> hashMapClass){
        Class[] innerClasses = hashMapClass.getClasses();
        System.out.println("Internal classes of the HashMap class: " + Arrays.toString(innerClasses));

        for (Class innerClass : innerClasses){
            System.out.println("Inner class name: " + innerClass.getName());
            Field[] fieldsIn = innerClass.getDeclaredFields();
            System.out.println("Inner class fields: " + Arrays.toString(fieldsIn));

            Constructor[] constructorsIn = innerClass.getDeclaredConstructors();
            System.out.println("Inner class constructors: " + Arrays.toString(constructorsIn));

            Method[] methodsIn = innerClass.getDeclaredMethods();
            System.out.println("Inner class methods: " + Arrays.toString(methodsIn));
        }

    }
}
