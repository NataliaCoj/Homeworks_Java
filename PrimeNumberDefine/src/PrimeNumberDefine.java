public class PrimeNumberDefine {
    public static boolean isPrime(Integer num) {
        int temp;
        boolean isPrime = true;

        // проверяем число на простоту
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if(isPrime) {
            return true;
        } else {
            return false;
        }
    }
}
