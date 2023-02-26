package by.it.academy.hw7;

public class Apricot extends Fruits {

    public Apricot (int weightGram, double priceGram) {
        super(weightGram, priceGram);
    }
        public double computeCost(){
            return getWeight() * getPrice();
        }


    }

