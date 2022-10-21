package basicProgramming;

public class Problem4 {
    private static boolean primeNumber(int number) {
        System.out.println(number);
        if (number < 2) return false;
        else if (number == 2) return true;
        else if (number % 2 == 0) return false;
        else {
            int limit = (int) Math.sqrt(number);
            for (int divisor = 3; divisor <= limit; divisor += 2) {
                if (number % divisor == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {


        System.out.println(primeNumber(7));
        System.out.println(primeNumber(10));

    }
}
