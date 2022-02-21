

import java.util.function.*;

public class Calculator {


    public Supplier supplier;

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
//        if (y==0){
//            return Integer.MAX_VALUE;
//        } else {
//            return x / y;
//        }
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return Integer.MAX_VALUE;
        }

    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = c -> System.out.println((c));

}
