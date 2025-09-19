public class InvertNumbers {
    
    public static void INVERTED(int n){
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }

            
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        INVERTED(5);
    }
}
