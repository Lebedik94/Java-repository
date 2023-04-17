package by.it.academy.hw7.Task1;

public class Student {
    private final String name;
    private final String lastName;
    private final int courseNumber;
    private final String groupName;
    private final double averageRating;

    public Student(String name, String lastName, int courseNumber, String groupName, double averageRating) {
        this.name = name;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
        this.averageRating = averageRating;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public String getInfo() {
        return ("Student's name: " + getName() + " " + getLastName() + ", Course number: " + getCourseNumber() + ", Group Name: " + getGroupName() + ", Average Rating " + getAverageRating() + ", " + "Stipend is " + getStipend());
    }

    public double getStipend() {
        if (averageRating == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
