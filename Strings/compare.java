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

        /*
         * why string are immutable?
         * humne isme dekha ki jab hum new key word banate hai aur same string pass karte hai to java bata hai ki String equla nahi hai 
         * is concept ko interning kahte hai  hamare pass compter ke andat do tarah ki  memory hoti hai 
         * stack and heap naam ki jab hum likhte hai str1 = "vickey"  to str1 jake stack memory me store ho jata hai aur "vickey" heap memory me
         * jab hum koi dusri string jaise str2 = "vickey" banate hai aur same string likte hai usme bhi aur jab hum in dono string ko check karte hai equal hai ya nahi to 
         * to ye dono String heap memory me Store same string ko point karte hai 
         * aur jab hum koi naya  object banate hai aur usme bhi same string pass karte hai to ye 1 nayi string ban jati hai
         */


        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("strings are not equl");
        }
    }
}
