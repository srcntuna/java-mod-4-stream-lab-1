# Stream Lab 1

## Instruction

Create a method called `isPrime` which takes a single parameter called `num` of
type `long`. Use a solution that uses streams to find out if the input number is
a prime number or not. You can use the `LongStream` interface’s `range` methods
to generate the values needed to test your number.

Note: A prime number is a value greater than 1 that has no positive divisors
other than 1 and itself.

```java
import java.util.Scanner;

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
    }
}
```
