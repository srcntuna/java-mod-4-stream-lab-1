import java.util.Scanner;
import java.util.stream.LongStream;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    /**
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        // your code here


        return LongStream.rangeClosed(2,number/2).allMatch(num -> number % num !=0);
    }
}
