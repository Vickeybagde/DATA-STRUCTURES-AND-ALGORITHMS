public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){        //for line
            for(int j = 1; j<=i; j++){     // for star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
