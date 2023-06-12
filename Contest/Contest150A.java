package Contest;
import java.util.Scanner;
import java.util.ArrayList;

public class Contest150A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            if(n==3 || n == 4 || n == 2)
                res.add("Bob");
            else
                res.add("Alice");
        }
        for(String s: res)
            System.out.println(s);
        sc.close();
    }
}