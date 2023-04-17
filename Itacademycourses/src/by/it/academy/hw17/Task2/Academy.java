package by.it.academy.hw17.Task2;

public class Academy {

    private String name;

    public Academy(String name){
        this.name = name;
    }

    @Retention(year = "2010")
    public void printNameAndYear(){
        System.out.println("Name of the Academy: " + name);
    }

    @Retention
    public void printInfo(){
        System.out.println(name + " 4 branches: Minsk, Grodno, Gomel, Brest.\n" +
                "227 teachers\n" +
                "12 years of work");
    }

    public void printMessage(){
        System.out.println("Learning is light and ignorance is darkness!");
    }
}
