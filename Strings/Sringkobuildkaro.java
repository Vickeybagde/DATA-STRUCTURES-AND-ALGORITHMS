

public class Sringkobuildkaro {
    
    /*
     * String builder bhi string ki tarah hi  1 aur datastructure hota hai
     * bas isme ye difference hota hai ki aap isi me aur changes ya modification kar sakte hai
     * 
     */

      // class ka naam change kiya
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();  // Correct spelling

        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);   // no need for extra ()
        }

        System.out.println(sb);
    }
}

     


