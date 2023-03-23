package by.it.academy.hw6;

public class Task4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createSomeString(3, 56);

        System.out.println(stringBuilder);
        System.out.println();// чтобы был пробел между блоками

        modifySomeString(stringBuilder);
        System.out.println(stringBuilder);

    }

    public static StringBuilder createSomeString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b);
        return result;
    }

    public static StringBuilder modifySomeString(StringBuilder stringBuilder) {
        int pos;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно ");
        }
        return stringBuilder;
    }

}
