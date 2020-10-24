
import java.util.Scanner;

public class B_1433 {
    public static void main(String[] args) {
        int testCase = 0;
        
        Scanner input = new Scanner(System.in);
        
        testCase = input.nextInt();
        
        for(int step=0; step<testCase; step++){
            int n;
            
            n = input.nextInt();
            
            int[] arr = new int[n+1];
            
            for(int i=0; i<n; i++){
                arr[i] = input.nextInt();
            }
            
            int gap = 0, ans = 0, ck1 = 0, ck2 = 0;
            
            for(int i=0; i<n; i++){
                if(arr[i] == 1 && ck1 == 0){
                    ck1 = 1;
                }
                else if(ck1 == 1 && arr[i] == 0){
                    gap++;
                }
                else if(ck1 == 1 && arr[i] == 1){
                    ans += gap;
                    gap = 0;
                }
            }
            System.out.println(ans);
        }
    }
}

