public class InvertedPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=(n-i+1); j++){       //hamesha i ki value change hote jayengi ex:- n-i+1 = 4-1+1=4 ase hi i change honga 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
