package lab8.java;

import java.util.*;

public class lab_19923696 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String grammar = sc.nextLine();
        // leftRec(grammar); Exercise One
        convert(grammar); // Exercise Two
    }

    public static boolean leftRec(String s) {
        boolean check = false;
        String[] tosplit = s.split("-");
        String A = tosplit[0];
        A = A.replaceAll("\\s", "");

        for (int i = 0; i < tosplit[1].length(); i++) {
            if (A.equals(tosplit[1].charAt(i) + "")) {
                check = true;
            }
        }

        if (check) {
            System.out.println("Left recursion can be applied");
            return true;
        } else {
            System.out.println("-1");
            return false;
        }
    }

    public static void convert(String s) {

        if (leftRec(s)) {
            System.out.println();
            String[] arr = s.split("-");
            String[] arr2 = arr[1].split("\\|");

            String r1 = arr[0].replaceAll("\\s", "");
            String alpha = arr2[0].substring(1);
            alpha.replaceAll("\\s", "");
            String beta = arr2[1];

            String r2 = arr[0] + "'";
            r2 = r2.replaceAll("\\s", "");

            System.out.println(r1 + "-" + beta + r2);
            System.out.println(r2 + "-" + alpha + r2 + "|" + "empty");
        }
    }

}