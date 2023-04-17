package by.it.academy.hw7.Task1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vitali", "Lebedik", 3, "Group 31403116", 5.0);
        Student student2 = new Student("Violetta", "Lebedik", 3, "Group 31403116", 5.0);
        Student student3 = new Student("Daniil", "Kuncewith", 1, "Group 2587463", 3.4);
        GraduateStudent graduateStudent1 = new GraduateStudent("Aleksey", "Skripko", 2, "Group 31402114", 3.5, true);
        GraduateStudent graduateStudent2 = new GraduateStudent("Dima", "Seledkin", 5, "Group 4561236", 5.0, true);
        GraduateStudent graduateStudent3 = new GraduateStudent("Artyom", "Ivanech", 5, "Group 54612698", 4.8, false);
        Student[] students = new Student[]{student1, student2, student3};
        for (Student student : students) {
            System.out.println(student.getInfo());
        }
        GraduateStudent[] graduateStudent = new GraduateStudent[]{graduateStudent1, graduateStudent2, graduateStudent3};
        for (GraduateStudent graduateStudents : graduateStudent) {
            System.out.println(graduateStudents.getInfo());
        }
    }
}
