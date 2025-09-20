public class Shortestpath {
    public static int Short(String str){
        int x = 0, y = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }                                  //git remote add origin https://github.com/Vickeybagde/DATA-STRUCTURES-AND-ALGORITHMS.git
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (int)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(Short(str));
        
    }
}
