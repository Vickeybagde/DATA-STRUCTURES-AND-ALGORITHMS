public class compare {
    
    public static void main(String[] args) {
        String str1 = "vickey";
        String str2 = "vickey";
        String str3 = new String("vickey");

        if(str1 == str2){
            System.out.println("Strings are equals");
        }
        // if(str1 == str3){
        //     System.out.println("S1 and s3 are equals");  // isme isne o/p diya Strings are not equal because str3 ko java ne 1 new String ke roop me dekha hai
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }


        // ye 1 (str1.equals (str3) ) koi string kisi dusre string ke equal hai ya nahi wo check karti hai


        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("strings are not equl");
        }
    }
}
