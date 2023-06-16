package Contest150Div2;

import java.util.ArrayList;
import java.util.Scanner;

public class KeepItBeautiful {

    static String solve(int q,Scanner sc){
        String res="";

        int first = sc.nextInt();
        int min = first;
        int max = (int)10e9;
        res +="1";
        boolean foundMin = false;
        for(int i=0;i<q-1;i++){  
            int x = sc.nextInt();
            
            if(x>=min && x<=max){
                res+="1";
                min = x;
            }
            else if(!foundMin && x<=first){
                min = x;
                foundMin = true;
                res+="1";
                max = first;
            }
            else{
                res+="0";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        while(t>0){
            t--;
            int q = sc.nextInt();
            res.add(solve(q,sc));
        }
        System.out.println(res);
    }
}
