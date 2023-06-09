package b1832;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long []res = new long[t];
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[]arr = new long[n];
            for(int j=0;j<n;j++)
                arr[j] = sc.nextLong();
            Arrays.sort(arr);
            long []pre = new long[n+1];
            Arrays.fill(pre,0);
            for(int j=0;j<n;j++){
                pre[j+1] = pre[j] + arr[j];
            }
            long max = 0;
            for(int j=0;j<=k;j++){
                max = Math.max(max,pre[n-j]-pre[2*(k-j)]);
            }
            res[i]= max;
        }
        for(long l:res)
            System.out.println(l);
    }
}
