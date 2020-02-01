import java.util.Scanner;

public class A_1295 {

    public static void main(String[] args) {
        int tc;

        Scanner input = new Scanner(System.in);

        tc=input.nextInt();

        int i=1;

        while(i<=tc){
            String ch="";

            int n;

            n=input.nextInt();

            if(n%2==0){
                for(int j=0; j<(n/2); j++){
                    ch+="1";
                }
                System.out.println(ch);
            }
            else{
                ch+="7";
                n-=3;

                for(int j=0; j<(n/2); j++){
                    ch+="1";
                }
                System.out.println(ch);
            }
            i++;
        }
    }
}

