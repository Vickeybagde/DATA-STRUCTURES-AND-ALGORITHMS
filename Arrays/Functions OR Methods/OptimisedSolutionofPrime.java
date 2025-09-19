public class OptimisedSolutionofPrime {
    
    public static boolean isprime(int n){

        for(int i =2; i<= Math.sqrt(n); i++){          // ye optimized solution hai prime number ka Uderoot ka use karke
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        System.out.println(isprime(7));
    }
}
