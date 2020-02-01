
import java.util.Scanner;

public class A_1271 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;

        Scanner input = new Scanner(System.in);

        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        f=input.nextInt();

        int ans=0;

        if(f>=e){
            if(b<=c && b<=d){
                ans=(b*f);
                if(a>=(d-b)){
                    ans+=((d-b)*e);
                }
                else{
                    ans+=((a*e));
                }
            }
            else if(c<=b && c<=d){
                ans=(c*f);
                if(a>=(d-c)){
                    ans+=((d-c)*e);
                }
                else{
                    ans+=((a*e));
                }
            }
            else{
                ans=(d*f);
            }
        }
        else{
            if(a>=d){
                ans=(d*e);
            }
            else{
                ans=(a*e);
                int mn=Math.min(b,Math.min(c,(d-a)));
                ans+=(mn*f);
            }
        }

        System.out.println(ans);
    }
}
