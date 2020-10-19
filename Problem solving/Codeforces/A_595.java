
import java.util.Scanner;

public class A_595 {
    public static void main(String[] args) {
        int n,m;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        m = input.nextInt();
        
        int[][] arr = new int[n+1][2*m+1];
        
        int countFlat = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<2*m; j++){
                arr[i][j] = input.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][2*j] == 1 || arr[i][2*j+1] == 1){
                    countFlat++;
                }
            }
        }
        
        System.out.println(countFlat);
    }
}

