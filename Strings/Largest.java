public class Largest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana", "lichi", "papaya"};

        String largest = fruits[0];
        /*
         * ye lexican graphic ke hisab se work karta hai
         * isme dictionary ke hisab se chalta hai for ex
         * a,b,d,e to inme se jo sabse bada honga wahi largest honga
         */
        
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
