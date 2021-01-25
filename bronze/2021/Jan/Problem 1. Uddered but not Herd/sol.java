/**
 * by qinyihao on 2021.1.24
 */

import java.util.*;

public class usaco_21_jan_uttered_but_not_hard {
    static Scanner inp;
    static String a, b;
    static int solution, n, x, y;

    public static void main(String[] args){
        inp = new Scanner(System.in);
        init();
        output();
        inp.close();
    }

    static void init() {
        a = inp.next().toLowerCase();
        b = inp.next().toLowerCase();

        n = b.length();
        solution = 1;
    }

    static void output() {
        x = a.indexOf(b.charAt(0));
        for(int i=1; i<n; i++) {
            y = a.indexOf(b.charAt(i));
            if(x >= y) solution++;
            x = y;
        }
        System.out.println(solution);
    }
}
