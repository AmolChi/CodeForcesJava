package CodeTONRound5;

import java.util.ArrayList;
import java.util.Scanner;

public class TenzingAndTsondu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int tsondu = 0;
            int tenzing = 0;
            for(int i=0;i<n;i++)
                tsondu+=sc.nextInt();
            for(int i=0;i<m;i++)
                tenzing+=sc.nextInt();
            
            if(tsondu>tenzing)
                res.add("Tsondu");
            else if(tenzing>tsondu)
                res.add("Tenzing");
            else
                res.add("Draw");
            t--;
        }
        for(String s: res)
            System.out.println(s);
        sc.close();
    }
}
