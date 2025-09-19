import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter an integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter an integer c: ");
        int c = sc.nextInt();
        
        if(a>=b && a>=c){
            System.out.println("bhai kaisa hai");
        }
        else if(a>=c){
            System.out.println("aaj ghumne chalenga");
        }
        else if(b>=c){
            System.out.println("kaha");
        }
        else{
            System.out.println("rehne de bhai aaj nahi chalte");
        }
    }
}
