public class Unary {
     /* operator basically do type ke hote hai
      *  1. binary operator :- +,-,*,/,%
         2. unary operator :- ++,--  
         * ab unary operator bhi do type ke hote hai 
         *1.preincrement:- ++a  :* isme phle value change hongi
                                 * then us value ko use karenge


         2. postincrement:-  a++  :*value use
                                   * then change
                                   * 
        same as predecriment & postdecriment
     */

     public static void main(String[] args) {  
        // example of preincrement
        // int a =5;
        // int b = ++a;
        // System.out.println(a);  //value change hui
        // System.out.println(b);  // then use me aayi

        // example of postincrement
        int a = 4;
        int b = a++;
        System.out.println(a);
        System.out.println(b);// isme phle increase hoti then use me aati hai 
     }
}
