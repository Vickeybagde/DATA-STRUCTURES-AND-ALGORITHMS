public class LinearSearch {
    // public static int linearsearch(int numbers[], int key){

    //     for(int i=0; i<numbers.length;i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    
    
    
    // public static void main(String[] args) {
    //     int numbers[] = { 1,20,40,10,15,25,60};
    //     int key = 15;

    //     int index = linearsearch(numbers, key);
    //         if(index == -1){
    //             System.out.println("Not found");
    //         }
    //         else{
    //             System.out.println("key found at index : " + index);
    //         }
        
    // }


    // public static int getlargest(int num[]){
    //     int largest = Integer.MIN_VALUE;

    //     for(int i=0; i<num.length; i++){
    //         if(largest < num[i]){
    //             largest = num[i];
    //         }
    //     }
    //     return largest;

    // }

    // public static void main(String[] args) {
    //     int num[] = {2,4,8,5,9,6,16};
    //     System.out.println("Largest number is : " + getlargest(num));

    // }


    //  public static int getlargest(int num[]){
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i=0; i<num.length; i++){
    //         if(smallest > num[i]){
    //             smallest = num[i];
    //         }
    //     }
    //     return smallest;

    // }

    // public static void main(String[] args) {
    //     int num[] = {2,4,8,5,9,6,16};
    //     System.out.println("smallest number is : " + getlargest(num));

    // }


    public static int Binarysearch( int numbers[],int  key){

       int start = 0, end = numbers.length-1;

       while (start<= end) {
        int mid = (start + end)/2;
        if(numbers[mid]== key){
            return mid;
        }
        if(numbers[mid]< key){
            start= mid+1;
        }
        else{
            start = mid-1;
        }
        
       }

       return -1;
    }
    
    
    
    
    public static void main(String[] args) {
        int numbers[] = { 1,2,3,4,5,6,7,8,9};
        int key = 6;

        System.out.println("Index of key are : " + Binarysearch(numbers, key));
        
    }
}
