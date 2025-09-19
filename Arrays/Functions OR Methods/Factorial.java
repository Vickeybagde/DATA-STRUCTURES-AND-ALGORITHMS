import java.util.*;

public class Factorial {
    
    public static int Fact(int n){

        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        System.out.println("Factorial of given number is : " + f);

        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(Fact(a));
    }
}
