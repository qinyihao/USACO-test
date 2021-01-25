/**
 * by qinyihao on 2021.1.24
 */

import java.util.*;

public class usaco_21_jan_even_more_odd_photos {
    static Scanner input;
    static int n, e, o, solution;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        init();
        solve();
        input.close();
    }

    static void init() {
        n = input.nextInt();
        e = 0;
        o = 0;
        for(int i = 0; i < n; i++) {
            if(input.nextInt()%2==0) e++;
            else o++;
        }
    }

    static void solve() {
        solution = 0;
        if(e == o)
            solution = e + o;
        else if(e > o)
            solution = o * 2 + 1;
        else {
            solution = e * 2;
            int x = o - e;
            int y = x / 3;
            if(x % 3 == 1)
                solution += y*2-1;
            if(x % 3 == 2)
                solution += (y+1)*2-1;
            if(x % 3 == 0)
                solution += y*2;
        }
        if(solution < 0)
            solution = 1;
        System.out.println(solution);
    }
}
