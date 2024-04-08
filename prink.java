public class prink {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
            i += 6;
        }
        return true;
    }

    // Function to print prime numbers in the range n to m
    static void printPrimesInRange(int n, int m) {
        System.out.println("Prime numbers between " + n + " and " + m + ":");
        for (int i = n; i <= m; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        int n = 10; // starting number
        int m = 50; // ending number
        printPrimesInRange(n, m);
    }
}

