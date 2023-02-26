package by.it.academy.hw7;

public class Aspirant extends Student {
    boolean scientificWork;

    public Aspirant(String name, String firstName, int numberCourses, String groupName, double averageRating, boolean scientificWork) {
        super(name, firstName, numberCourses, groupName, averageRating);
        this.scientificWork = scientificWork;
    }
    String getInfo(){
        return "Имя : " + name + " ; " + "Фамилия : " + firstName + " ; "  + "Номер курса : " + numberCourses + " ; " + "Название группы : " + groupName + " ; " + "Cредняя оценка : " + averageRating + " ; "  + "Наличие степени : " + scientificWork + " ; " + "Размер стипендии : ";
    }

    int getStipend() {
        int Stipend;
        if (averageRating == 5) {
            Stipend = 200;
        } else {
            Stipend = 180;
        }
        return Stipend;
    }
}