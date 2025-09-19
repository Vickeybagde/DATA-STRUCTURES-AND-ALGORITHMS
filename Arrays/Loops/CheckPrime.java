import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;      // 0, 1 prime nahi
        if (n == 2) return true;       // 2 prime hai
        if (n % 2 == 0) return false;  // Even numbers prime nahi (2 ke alawa)

        // Sirf odd numbers check karo
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
