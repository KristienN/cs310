import java.util.Scanner;
import java.util.ArrayList;

public class lab_19923696{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> firsts = new ArrayList<String>();

        while(true){
            String input = sc.nextLine();
            if(input == "") break;
            firsts.add(first(input));
            // print(firsts);
        }

        compute(firsts);
    }

    public static String first(String s){
        String [] sides = s.split("-");
        String lhs = sides[0];
        String rhs = sides[1];
        String output = "{";
        int count = 0;

        String[] split = rhs.split("\\|");

        for(int i = 0; i < split.length; i++){
            for(int j = 0; j < split[i].length(); j++){
                if(Character.isLowerCase(split[i].charAt(j)) && count == 0){
                    if(i==0){
                        output = output + (split[i].charAt(j)+"");
                        count++;
                    }
                    else {
                        output = output + "," + (split[i].charAt(j)+"");
                        count++;
                    } 
                }
            }

            count = 0;
        }

        return output + "}";
    }

    public static void print(ArrayList<String> a){
        String[] arr = a.toArray(new String[0]);
        for(String s : arr){
            System.out.println(s);
        }
    }

    public static void compute(ArrayList<String> a){
        Boolean empty = false;
        String output = "{";
        String[] arr = a.toArray(new String[0]);
        for(String s : arr){
            for(int i = 0; i < s.length(); i++){
                if(i==0){
                    if(Character.isLowerCase(s.charAt(i))){
                        
                        if(s.charAt(i) == 'e' && empty == false) {
                            empty = true;
                            output = output + s.charAt(i);
                        }
                        if(s.charAt(i)!='e'){
                        output = output + s.charAt(i); 
                        }
                    }
                } else {

                    if(Character.isLowerCase(s.charAt(i))){
                        if(s.charAt(i) == 'e' && empty == false) {
                            empty = true;
                            output = output + "," + s.charAt(i);
                        }
                        if(s.charAt(i)!='e'){
                        output = output + "," + s.charAt(i); 
                        }
                    }
                }
            }
        }

        System.out.println(output + "}");
    }
}