public class Logical {
    /*
     * 
     * logical operators :- &&, ||, !
     */

     public static void main(String args[]){
        int a = 20;
        int b = 30;
        
        //for OR operator if both conditions are true,if both false it givs false
        // if(a == b || a<=b){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }

        //for AND operator both are true it gives true
        // if(a < b && b>=a){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
         
        // for NOT operator
        if(a < b != b>=a){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
     }
}
