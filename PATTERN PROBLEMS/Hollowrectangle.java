public class Hollowrectangle {
    public static void hollowrect(int totlrows, int totlcolms){
        for(int i = 1; i<= totlrows; i++){
            for(int j= 1; j<= totlcolms; j++){
                //(i,j)
                if(i==1 || i== totlrows || j==1 || j == totlcolms){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        
    }
    
    public static void main(String[] args) {
        hollowrect(5, 8);
    }
}
