
// class Reverse {
//    Reverse() {
//    }

//    public static void reverseofarray(int[] var0) {
//       int var1 = 0;

//       for(int var2 = var0.length - 1; var1 < var2; --var2) {
//          int var3 = var0[var2];
//          var0[var2] = var0[var1];
//          var0[var1] = var3;
//          ++var1;
//       }

//    }

//    public static void main(String[] var0) {
//       int[] var1 = new int[]{2, 4, 3, 8, 10, 9, 5};
//       reverseofarray(var1);

//       for(int var2 = 0; var2 < var1.length; ++var2) {
//          System.out.print(var1[var2] + " ");
//       }

//       System.out.println();
//    }
// }

class Reverse{
    public static void reverseofarray(int num[]){
        int left = 0, right=num.length-1;
        while(left<right){
            //swap
            int temp = num[right];
            num[right] = num [left];
            num[left] = temp;
            left++;
            right--;
        }
        
    }

    public static void main(String[] args) {
        int num[] = {2,4,3,8,10,9,5};

        reverseofarray(num);

        for(int i=0; i <num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}

