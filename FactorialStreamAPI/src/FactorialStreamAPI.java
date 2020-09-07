import java.util.stream.IntStream;

public class FactorialStreamAPI {
    public int getFactorial(int number) {

        IntStream pampam = IntStream.rangeClosed(2, number); // 2,3,4,5
        int result = pampam.reduce(1, (accumulator, currentNumber) -> accumulator * currentNumber);
        return result;
        /*or more compact variant:
        return IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
        */
    }

}