package lab3.java;
public class lab3{
    public static void main(String [] args){

        // To create set L1 {A-Z}
        var caps = new set(65, 90);

        // To create set L2 {a-z}
        var lowers = new set(97,122);

        // to create set D
        var digits = new set(48, 57);

        // To create L by adding the two
        char[] L = union(caps.members, lowers.members);

        // printArr(L);

        // Creating the set L U D
        char[] LUD =  union(L, digits.members);

        printArr(LUD);


    }

    public static char[] union(char[] a, char [] b){
        char[] c = new char[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = a.length; i < b.length; i++){
            c[i] = b[i];
        }

        return c;

    }

    public static char[] star(char[] a, char[] b){

    }

    public static void printArr(char[] c){
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}

class set{
    int lower_bound, upper_bound;
    char[] members;
    String[] array;
    public set(int lower_bound, int upper_bound){
        this.lower_bound = lower_bound;
        this.upper_bound = upper_bound;
        this.members = new char[upper_bound-lower_bound+1];
        this.members = addMembers(members, lower_bound, upper_bound);
    }

    public static char[] addMembers(char[] members, int l, int u){
        int count = 0;
        for(int i = l; i <= u; i++){
            members[count] = (char) i;
            count++;
        }

        return members;
    }

    public static String[] charToString(char[] x){
        String[] y = new String[x.length];
        for(int i = 0; i < x.length; i++){
            System.out.print("Add some more here");
        }     
    }
}

class pair{
    int a, b;
    String members;
    pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}