public class upper {
    public static String phlaworduppercasemekaro(String str){
        StringBuilder sb = new StringBuilder();

        // Pehla character uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Loop ko 1 se start karo
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i)); // space add karo
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // next word ka first letter uppercase
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am vickey";
        System.out.println(phlaworduppercasemekaro(str));
    }
}

