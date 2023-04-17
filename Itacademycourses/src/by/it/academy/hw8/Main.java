package by.it.academy.hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Food cheesecake = new Food("cheesecake");
        cheesecake.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Правильно отрезаем стейк. Стейк должен быть не менее двух сантиметров толщиной.\n" +
                        "После нарезания стейк должен полежать при комнатной температуре 40-50 минут,\n" +
                        "мясо нельзя жарить холодным сразу после того как достали из холодильника.\n" +
                        "Кладем стейк на раскаленную сковородку (гриль, мангал, барбекю).\n" +
                        "Обжариваем с каждой стороны по 3 минуты.\n" +
                        "Затем слегка убавляем огонь и дожариваем переворачивая на 180 градусов 2-3 минуты для получения красивого рисунка");

            }
        });

        System.out.println("==================================================================================");

        User1 user1 = new User1("domovoJ846","IDGRFLS8794132--44");
        User1.Query query = user1.new Query();
        query.printToLog();

        System.out.println("==============================================================================");


        Shop cloth1 = new Cloth("dress", "Catch", "red", 4897.20, Cloth.Dimensions.XS);
        Shop cloth2 = new Cloth("skirt", "Bershka", "blue", 95, Cloth.Dimensions.L);
        Shop cloth3 = new Cloth("shorts", "Nike", "black", 80.45, Cloth.Dimensions.XL);
        Shop cloth4 = new Cloth("dress", "Inside", "red", 23.75, Cloth.Dimensions.M);
        Shop cloth5 = new Cloth("skirt", "Reserved", "white", 19.99, Cloth.Dimensions.XS);
        Shop cloth6 = new Cloth("shorts", "Zara", "blue", 59.99, Cloth.Dimensions.XL);
        Shop cloth7 = new Cloth("shirt", "Tommy Hilfiger", "green", 200, Cloth.Dimensions.S);
        Shop shoes1 = new Shoes("boots", "Gucci", "black", 654.35, Shoes.DimensionsShoes.sizeShoes1);
        Shop shoes2 = new Shoes("sandals", "Gues", "brown", 39.47, Shoes.DimensionsShoes.sizeShoes2);
        Shop shoes3 = new Shoes("loafers", "Bonucci", "blue", 135, Shoes.DimensionsShoes.sizeShoes5);
        Shop shoes4 = new Shoes("sneakers", "Adidas", "black", 235.99, Shoes.DimensionsShoes.sizeShoes3);
        Shop shoes5 = new Shoes("sneakers", "Pudra", "white", 500, Shoes.DimensionsShoes.sizeShoes4);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter in the search, one of the proposed products: red, blue, black, white, green or brown");
        String colorProduct = scanner1.next();

        Shop[] clothesShoes = new Shop[]{cloth1, cloth2, cloth3, cloth4, cloth5, cloth6, cloth7, shoes1, shoes2, shoes3, shoes4, shoes5};
        for (Shop product : clothesShoes) {
            if (colorProduct.equals(product.getColor())) {
                System.out.println(product.getInfoColor());
            }
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the suggested clothing size in the search: XS, S, M, L, XL");
        String clothingSize = scanner2.next();

        Cloth.Dimensions dimensions = Cloth.Dimensions.valueOf(clothingSize);

        for (Shop product : clothesShoes) {
            if (dimensions.equals(product.getDimensions())) {
                System.out.println(product.getInfoSize());
            }
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter the suggested shoe size in the search box: 41, 42, 43, 44, 45");
        Integer shoeSize = scanner3.nextInt();

        for (Shop product : clothesShoes) {

            if (shoeSize.equals(product.getDimensionsShoes())) {
                System.out.println(product.getInfoSize());
            }
        }

    }
    }

