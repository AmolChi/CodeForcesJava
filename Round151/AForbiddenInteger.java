package Round151;

import java.util.*;

public class AForbiddenInteger{
    static List<Integer> solve(int n,int k,int x,int currSum){
        if(currSum == n)
            return new ArrayList<>();
        else if(currSum>n)
            return null;
        List<Integer> current = null;
        for(int i=k;i>0;i--){
            if(i==x)
                continue;
            else{
                current = solve(n,k,x,currSum+i);
                if(current == null)
                    continue;
                else    
                    current.add(i);
            }
                
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            res.add(solve(n,k,x,0));
        }
        for(List<Integer> temp:res){
            if(temp==null)
                System.out.println("NO");
            else{
                System.out.println(temp.size());
                for(int x:temp)
                    System.out.print(x + " ");
                System.out.println();
            }    
        }
        sc.close();
        
    }
}