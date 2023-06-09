package Contest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CypherShifer{

    public static String decrypt(String s,int n){
        String a = "";
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            i++;
            while(i<s.length() && s.charAt(i)!=curr)
                i++;
            a+=curr;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            ans.add(decrypt(sc.next(),n));
        }
        for(int i=0;i<ans.size();i++)
            System.out.println(ans.get(i));
        sc.close();
    }
}