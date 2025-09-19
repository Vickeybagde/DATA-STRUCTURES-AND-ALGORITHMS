import java.util.*;

public class incomeTaxCalculator {
    
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Income : ");
      int income = sc.nextInt();
      int Tax;

      if (income < 500000) {
        Tax = 0;
        System.out.println(Tax);
    }
    else if(income >= 500000 || income < 1000000){
        Tax = (int) (income * 0.2);
        System.out.println(Tax);
    }
    else{
        Tax = (int)(income * 0.3);
        
    }

    

    System.out.println("your Tax is : " + Tax);
}
}
