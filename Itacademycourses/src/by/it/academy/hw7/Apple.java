package by.it.academy.hw7;

public  class Apple extends  Fruits{

    public Apple(int weightGram, double priceGram) {
        super(weightGram, priceGram);
    }
        public double computeCost(){
            return getWeight() * getPrice();
        }

        }

















