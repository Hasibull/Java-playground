
import java.util.Scanner;


public class DSFirstProblem {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                arr[i][j] = input.nextInt();
            }
        }
        
        int maxSum = -10000;
        
        for(int k=0; k<4; k++){
            for(int i=0; i<4; i++){
                int sum = 0;
                for(int j=0; j<3; j++){
                    sum += arr[k][i+j];
                }
                sum += arr[k+1][i+1];
                for(int j=0; j<3; j++){ 
                    sum += arr[k+2][i+j];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        System.out.println(maxSum);
    }
}

