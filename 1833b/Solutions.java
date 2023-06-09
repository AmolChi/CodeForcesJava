import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solutions{

    public static List<Integer> find(int n,int k,int[][]a,int[] b){
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        Arrays.sort(b);
        int[]res = new int[b.length];
        for(int i=0;i<b.length;i++){
            res[a[i][1]] = b[i];
        }
        for(int i=0;i<res.length;i++)
            ans.add(res[i]);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[n][2];
            int[] b = new int[n];
            for(int j=0;j<n;j++){
                a[j][0] = sc.nextInt();
                a[j][1] = j;
            }
            for(int j =0;j<n;j++)
                b[j] = sc.nextInt();
            res.add(find(n,k,a,b));
        }

        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+" ");
            System.out.println();
        }
        sc.close();
    }
}