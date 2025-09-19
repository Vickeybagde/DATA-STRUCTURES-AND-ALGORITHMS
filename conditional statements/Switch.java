import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 5 : ");
        int a = sc.nextInt();
        switch(a){
            case 1: System.out.println("ghoomne jana hai");
            break;
            case 2: System.out.println("ghar jana hai");
            break;
            case 3: System.out.println("padai karni hai");
            break;
            case 4: System.out.println("khelne jana hai");
            break;
            case 5: System.out.println("ghar par baat karni hai");
            break;
            default: System.out.println("muze baat nahi karni");

        }
    }
    
}
