import java.util.*;

public class SumInBinaryTree{
    public static long solve(long n){
        if(n==1)
            return 1;
        return n + solve(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res[] = new long[t];
        int itr = 0;
        while(t>0){
            long n = sc.nextLong();
            res[itr++] = solve(n);
            t--;
        }
        for(long x:res)
            System.out.println(x);
        sc.close();
    }
}