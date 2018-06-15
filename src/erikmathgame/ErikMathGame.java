/*
 * Erik Neville
 * June 15, 2018
 */
package erikmathgame;

import java.util.Scanner;

/**
 *
 * @author <a href= "mailto:erikeneville@gmail.com" >Erik Neville</a>
 */
public class ErikMathGame {

    private static final String FIB = " ** Fibonacci ";
    private static final String PRIME = " ** Prime ";
    private static final String DIVSEV = " ** Divisible by 7 ";
    private static final String CONTSEV = " ** Contains 7 ";
    private static final String DIVELEV = " ** Double Number ";
    
    public static String fibPrime = FIB + PRIME;
    public static String fibDivSev = FIB + DIVSEV;
    public static String fibContSev = FIB + CONTSEV;
    public static String fibElev = FIB + DIVELEV;
    public static String divContElev = DIVSEV + CONTSEV + DIVELEV;
    public static String primeContSev = PRIME + CONTSEV;
    public static String primeElev = PRIME + DIVELEV;
    public static String divContSev = DIVSEV + CONTSEV;
    public static String divSevElev = DIVSEV + DIVELEV;
    
    
    public static int[] makeArr(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
         }
        return a;
    }
    
    // format numbers with commas
    static String comma(int i) {
        return String.format("%,d", i);
    }

    // check for perfect square, part of fibonacci
    static boolean isPerfSquare(int n) {
        int s = (int) Math.sqrt(n);
        return (s * s == n);
    }

    // determines if n is a fibonacci number
    static boolean isFib(int n) {
        return isPerfSquare(5 * n * n + 4)
                || isPerfSquare(5 * n * n - 4);
    }

    // check if n is divisible by seven
    static boolean divSev(int n) {
        return n % 7 == 0;
    }

    // check if n is divisible by 11
    static boolean divEleven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j )
        }
    }

    // check if n is prime
    static boolean isPrime(int n) {
        if ((n > 2 && n % 2 == 0) || n == 1) {
            return false;
        }
        for (int j = 3; j <= (int) Math.sqrt(n); j += 2) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter which game you want to play\n"
                + "1) Just 7s and doubles\n2) Just primes\n3) Just Fibonacci\n"
                + "4) Prime and 7s (and doubles)\n5) Prime and Fibonacci\n"
                + "6) Fibonacci and 7s (and doubles)\n7) All three\n"
                + "8) Just Fibonacci Numbers\n\nEnter Choice: --->  ");
        int choice = in.nextInt();

        System.out.print("Enter a max number to play to: ");
        int n = in.nextInt();
        System.out.println();
        switch (choice) {

            // 7s or Doubles
            case 1:
                for (int i = 1; i <= n; i++) {
                    if (divSev(i) == true && divEleven(i) == true 
                            && String.valueOf(i).contains("7")) {
                        System.out.println(comma(i) + divContElev);
                    } else if (divSev(i) == true && divEleven(i) == true) {
                        System.out.println(comma(i) + divSevElev);
                    } else if (divEleven(i) == true) {
                        System.out.println(comma(i) + DIVELEV);
                    } else {
                        System.out.println(comma(i));
                    }
                    
                    
//                    if (divSev(i) == true) {
//                        System.out.println(comma(i) + DIVSEV);
//                    } else if (String.valueOf(i).contains("7")) {
//                        System.out.println(comma(i) + CONTSEV);
//                    } else if (divEleven(i) == true) {
//                        System.out.println(comma(i) + DOUBLES);
//                    } else {
//                        System.out.println(comma(i));
//                    }
                }
                break;

            // Primes    
            case 2:
                for (int i = 1; i <= n; i++) {
                    if (isPrime(i) == true) {
                        System.out.println(comma(i) + " **** is prime");
                    } else {
                        System.out.println(comma(i));
                    }
                }
                break;

            // Fibonacci    
            case 3:
                for (int i = 1; i <= n; i++) {
                    if (isFib(i) == true) {
                        System.out.println(comma(i) + " **** is a Fibonacci number");
                    } else {
                        System.out.println(comma(i));
                    }
                }
                break;

            // Prime and 7s
            case 4:
                for (int i = 1; i <= n; i++) {
                    if (divSev(i) == true) {
                        System.out.println(comma(i) + " **** is divisible by 7");
                    } else if (String.valueOf(i).contains("7")) {
                        System.out.println(comma(i) + " **** contains a 7");
                    } else if (divEleven(i) == true) {
                        System.out.println(comma(i) + " **** is a double number");
                    } else if (isPrime(i) == true) {
                        System.out.println(comma(i) + " **** is prime");
                    } else {
                        System.out.println(comma(i));
                    }
                }
                break;

            // Prime and Fibonacci    
            case 5:
                for (int i = 1; i <= n; i++) {
                    if (isPrime(i) == true && isFib(i) == true) {
                        System.out.println(comma(i) + " ** is Prime and ** Fibonacci");
                    } else if (isFib(i) == true && isPrime(i) == false) {
                        System.out.println(comma(i) + " ** is Fibonacci");
                    } else if (isFib(i) == false && isPrime(i) == true) {
                        System.out.println(comma(i) + " ** is Prime");
                    } else {
                        System.out.println(comma(i));
                    }
                }
                break;

            // Fibonacci and 7s    
            case 6:
                for (int i = 1; i <= n; i++) {
                    if (divSev(i) == true) {
                        System.out.println(comma(i) + " **** is divisible by 7");
                    } else if (String.valueOf(i).contains("7")) {
                        System.out.println(comma(i) + " **** contains a 7");
                    } else if (divEleven(i) == true) {
                        System.out.println(comma(i) + " **** is a double number");
                    } else if (isFib(i) == true) {
                        System.out.println(comma(i) + " **** is a Fibonacci number");
                    } else {
                        System.out.println(comma(i));
                    }
                }
                break;

            // All of the above    
            case 7:
                for (int i = 1; i <= n; i++) {
                    if (isFib(i) == true) {
                        System.out.println(comma(i) + " **** is a Fibonacci number");
                    } else if (divSev(i) == true) {
                        System.out.println(comma(i) + " **** is divisible by 7");
                    } else if (String.valueOf(i).contains("7")) {
                        System.out.println(comma(i) + " **** contains a 7");
                    } else if (divEleven(i) == true) {
                        System.out.println(comma(i) + " **** is a double number");
                    } else if (isPrime(i) == true) {
                        System.out.println(comma(i) + " **** is prime");
                    } else {
                        System.out.println(comma(i));
                    }
                }
                break;

            case 8:
                System.out.println(1);
                for (int i = 1; i <= n; i++) {
                    if (isFib(i)) {
                        comma(i);
                    }
                }
                break;

            // default    
            default:
                throw new AssertionError();
        }
    }
}


// String.valueOf(i).contains("7")
