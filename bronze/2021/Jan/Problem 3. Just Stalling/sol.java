/**
 * by qinyihao on 2021.1.24
 */

import java.util.*;

public class usaco_21_jan_just_stalling {
    static Scanner input;
    static int a[], b[], c[], flag;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        init();
        solve();
        input.close();
    }

    static void init() {
        flag = input.nextInt();
        a = new int[flag];
        b = new int[flag];
        c = new int[flag];
        for(int i = 0; i < flag; i++)
            a[i] = input.nextInt();
        for(int i = 0; i < flag; i++)
            b[i] = input.nextInt();
    }

    static void solve() {
        Arrays.sort(a);
        for(int i = 0; i < flag; i++) {
            for(int j = 0; j < flag; j++) {
                if(a[i] <= b[j])
                    c[i]++;
            }
        }
        long ans = c[flag-1];
        for(int i = flag - 2; i >= 0; i--)
            ans *= c[i] - (flag - 1 - i);
        System.out.println(ans);
    }
}
