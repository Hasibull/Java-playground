import java.util.Scanner;

public class A_1289 {
    public static void main(String[] args) {
        long r,g,b,tc;

        Scanner input = new Scanner(System.in);
        tc=input.nextInt();

        int i=0;

        while (i<tc){
            r=input.nextInt();
            g=input.nextInt();
            b=input.nextInt();
            if(r>=g && r>=b){
                if((r-1)<=((g+b))) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else if(g>=r && g>=b){
                if((g-1)<=((r+b))){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                if((b-1)<=((r+g))){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            i++;
        }

    }
}
