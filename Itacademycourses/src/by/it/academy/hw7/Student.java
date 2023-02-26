package by.it.academy.hw7;

public class Student {
    String name;
    String firstName;
    int numberCourses;
    String groupName;
    double averageRating;

    public Student(String name, String firstName, int numberCourses, String groupName, double averageRating) {
        this.name = name;
        this.firstName = firstName;
        this.numberCourses = numberCourses;
        this.groupName = groupName;
        this.averageRating = averageRating;
    }
    String getInfo(){
        return "Имя : " + name + " ; " + "Фамилия : " + firstName + " ; "  + "Номер курса : " + numberCourses + " ; " + "Название группы : " + groupName + " ; " + "Cредняя оценка : " + averageRating +  " ; " + "Размер стипендии : ";
    }

    int getStipend() {
        int Stipend;
        if (averageRating == 5) {
            Stipend = 100;
        } else {
            Stipend = 80;
        }
        return Stipend;


        }


    }

