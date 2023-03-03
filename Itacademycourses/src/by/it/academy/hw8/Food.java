package by.it.academy.hw8;

public class Food implements Cookable{
    public String name ;

    public Food(String name) {
        this.name = name;
    }

    public void prepare(Cookable c) {
        c.cook();
    }

    @Override
    public void cook() {

    }
}
