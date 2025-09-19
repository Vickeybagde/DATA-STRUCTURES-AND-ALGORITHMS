import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a  second number : ");
        int b = sc.nextInt();
        System.out.println("Enter a operand like +, -, *, /, % : ");
        char c = sc.next().charAt(0);

        switch(c){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("bhai tu galat kar raha hai yrr");
        }
        
    }
}
