import java.util.*;

public class Product{
    
    public static int productoftwoNo(int a, int b){
        
        int Multiply = a*b;
        System.out.println("product of two number is : " + Multiply);
        return Multiply;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();

        productoftwoNo(a, b);
        
    }
}