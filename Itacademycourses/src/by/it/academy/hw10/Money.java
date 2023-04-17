package by.it.academy.hw10;

import java.util.Stack;

public class Money {
    private final int number;

    public Money(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "number=" + number +
                '}';
    }

    public static Integer max(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            Integer last = stack.pop();
            Integer next = max(stack);
            stack.push(last);
            if (last > next) {
                return last;
            } else {
                return next;
            }
        }
    }
}