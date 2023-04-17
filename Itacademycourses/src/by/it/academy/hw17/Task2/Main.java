package by.it.academy.hw17.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<Academy> itAcademyClass = Academy.class;
            Constructor<Academy> constructor = itAcademyClass.getConstructor(String.class);
            Academy itAcademy = constructor.newInstance("ITAcademy");
            checkForAnnotation(itAcademy);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void checkForAnnotation(Academy itAcademy) {
        try{
            Method[] methods = itAcademy.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Retention.class)) {
                    System.out.println("Method annotated with @AcademyInfo: " + method.getName());
                    Retention annotation = method.getDeclaredAnnotation(Retention.class);
                    method.invoke(itAcademy);
                    System.out.println("year value: " + annotation.year());
                }
            }
        }catch (InvocationTargetException | IllegalAccessException ex){
            System.out.println(ex.getMessage());
        }
    }
}
