public class BinomialCoefficient {
    
    public static int Fact(int n){

        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }

        return f;
    }
    
    public static int BC(int n, int r){
        int fc_n = Fact(n);
        int fc_r = Fact(r);
        int fc_nmr = Fact(n-r);
        int bc = fc_n/(fc_r*fc_nmr);
        return bc;
        
    }
    public static void main(String[] args) {
        System.out.println(BC(5, 2));
        
    }
}
