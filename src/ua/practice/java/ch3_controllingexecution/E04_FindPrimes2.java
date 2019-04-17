package ch3_controllingexecution;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import static util.Print.printnb;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.04.2019.
 */
/*One of the fastest ways of finding prime numbers is called the Sieve of
Eratosthenes. The following program uses a boolean array to mark prime
numbers.
You need only test odd numbers, since 2 is the only even prime. The program
uses a max + 1 sized array to make indexing easier. The search continues until
you have crossed out all numbers divisible by sqrt( max), where ⎣x⎦ is the floor
function. Additional optimizations are left as exercises.
*/
public class E04_FindPrimes2 {
    public static void main(String[] args) {
        int max = 100;
        if (args.length != 0) {
            max = Integer.parseInt(args[0]);
        }
        boolean[] sieve = new boolean[max + 1];
        int limit = (int) floor(sqrt(max));
        printnb(1 + " ");
        if (max > 1) {
            printnb(2 + " ");
        }
        // Detect prime numbers
        for (int i = 3; i <= limit; i += 2) {
            if (!sieve[i]) {
                for (int j = 2; j <= max; j += i) {
                    sieve[j] = true;
                }
            }
        }
        // Print prime numbers
        for (int i = 3; i <= max; i += 2) {
            if (!sieve[i]) {
                printnb(i + " ");
            }
        }
    }
}
