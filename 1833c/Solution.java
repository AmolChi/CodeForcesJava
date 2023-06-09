import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Solution{

    public static boolean check(List<Integer> list){

        int small = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
            if(small>list.get(i))
                small = list.get(i);
        
        boolean isOdd = small%2!=0;
        if(isOdd)
            return true;
        else{
            for(int i=0;i<list.size();i++){
                if(list.get(i)%2!=0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        List<List<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            List<Integer>temp = new ArrayList<>();
            int m = sc.nextInt();
            for(int j=0;j<m;j++)
                temp.add(sc.nextInt());
            list.add(temp);
        }

        for(int i =0;i<n;i++){
            if(check(list.get(i)))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}