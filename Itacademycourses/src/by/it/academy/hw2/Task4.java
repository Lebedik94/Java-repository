package by.it.academy.hw2;

public class Task4 {
    public static void main(String[] args) {
        byte numberByte = 127;
        short numberShort = 32000;
        int numberInt = 4000000;
        long numberLong = 5000000;
        float numberFloat = 50.75f;
        double numberDouble = 600.75d;
        char numberChar = 70;

        byteConversion(numberByte, numberShort, numberInt, numberLong, numberFloat, numberDouble, numberChar);
        shortConversion(numberShort, numberInt, numberLong, numberFloat, numberDouble, numberChar);
        intConversion(numberInt, numberLong, numberFloat, numberDouble, numberChar);
        longConversion(numberLong, numberFloat, numberDouble);
        floatConversion(numberFloat, numberDouble);
        doubleConversion(numberInt, numberLong, numberFloat, numberDouble);
        charConversion(numberByte, numberShort, numberInt, numberLong, numberFloat, numberDouble, numberChar);


    }

    public static void byteConversion(byte numberByte, short numberShort, int numberInt, long numberLong, float numberFloat, double numberDouble, char numberChar) {
        numberShort = numberByte;
        numberInt = numberByte;
        numberLong = numberByte;
        numberFloat = numberByte;
        numberDouble = numberByte;
        numberChar = (char) numberByte;
        System.out.println("The byte conversion has the following meanings" + "\n" + numberByte + "\n" + numberShort + "\n" + numberInt + "\n" + numberLong + "\n" + numberFloat + "\n" + numberDouble + "\n" + numberChar);


    }

    public static void shortConversion(short numberShort, int numberInt, long numberLong, float numberFloat, double numberDouble, char numberChar) {
        numberInt = numberShort;
        numberLong = numberShort;
        numberFloat = numberShort;
        numberDouble = numberShort;
        numberChar = (char) numberShort;
        System.out.println("The short conversion has the following meanings" + "\n" + numberShort + "\n" + numberInt + "\n" + numberLong + "\n" + numberFloat + "\n" + numberDouble + "\n" + numberChar);

    }

    public static void intConversion(int numberInt, long numberLong, float numberFloat, double numberDouble, char numberChar) {
        numberLong = numberInt;
        numberFloat = numberInt;
        numberDouble = numberInt;
        numberChar = (char) numberInt;
        System.out.println("The int conversion has the following meanings" + "\n" + numberInt + "\n" + numberLong + "\n" + numberFloat + "\n" + numberDouble + "\n" + numberChar);

    }

    public static void longConversion(long numberLong, float numberFloat, double numberDouble) {
        numberFloat = numberLong;
        numberDouble = numberLong;
        System.out.println("The long conversion has the following meanings" + "\n" + numberLong + "\n" + numberFloat + "\n" + numberDouble);

    }

    public static void floatConversion(float numberFloat, double numberDouble) {
        numberDouble = numberFloat;
        System.out.println("The float conversion has the following meanings" + "\n" + numberFloat + "\n" + numberDouble);

    }

    public static void doubleConversion(int numberInt, long numberLong, float numberFloat, double numberDouble) {
        numberInt = (int) numberDouble;
        numberLong = (long) numberDouble;
        numberFloat = (long) numberDouble;
        System.out.println("The double conversion has the following meanings" + "\n" + numberInt + "\n" + numberLong + "\n" + numberFloat + "\n" + numberDouble);

    }

    public static void charConversion(byte numberByte, short numberShort, int numberInt, long numberLong, float numberFloat, double numberDouble, char numberChar) {
        numberByte = (byte) numberChar;
        numberShort = (short) numberChar;
        numberInt = (int) numberChar;
        numberLong = (long) numberChar;
        numberFloat = (float) numberChar;
        numberDouble = (double) numberChar;
        System.out.println("The char conversion has the following meanings" + "\n" + numberByte + "\n" + numberShort + "\n" + numberInt + "\n" + numberLong + "\n" + numberFloat + "\n" + numberDouble + "\n" + numberChar);
    }
}

