package by.it.academy.hw7.Task1;

public class GraduateStudent extends Student {
    private final boolean scientificWork;

    public GraduateStudent(String name, String lastName, int courseNumber, String groupName, double averageRating, boolean scientificWork) {
        super(name, lastName, courseNumber, groupName, averageRating);
        this.scientificWork = scientificWork;
    }

    public boolean getScientificWork() {
        return scientificWork;
    }

    @Override
    public String getInfo() {
        return "Graduate student's name: " + getName() + " " + getLastName() + ", Course number: " + getCourseNumber() + ", Group Name: " + getGroupName() + ", Average Rating " + getAverageRating() + ", Scientific Work " + getScientificWork() + ", " + "Stipend is " + getStipend();
    }

    @Override
    public double getStipend() {
        if (getAverageRating() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
