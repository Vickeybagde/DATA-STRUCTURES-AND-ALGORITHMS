public class passingArguments {
    public static void update(int marks[]){
        for(int i=0; i< marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    
    public static void main (String args[]){
        int  marks [] = {95,96,97};

        update(marks);
        for(int mark : marks){
            System.out.println(mark);
        }
    }
}
