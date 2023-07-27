import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();

        while(t>0){
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==1)
                res.add(a+b);
            else
                res.add(1);
        }
        for(int x:res)
            System.out.println(x);
    }
}
