import java.util.Scanner;

public class stack {

    int max=100;

    int[] array= new int[max];
    int top=0,ct=0;

    void push(int val){
        if(top<max){
            array[top++]=val;
        }
    }
    void pop(){
        if(top>=0){
            top--;
        }
    }
    void print_stack(){
        for(int i=0; i<top; i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    void execution(){
        int ck,val;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Press 1 to insert value !\nPress 2 to delete value !\nPress 3 to print all elements in the stack !\nPress 4 to break the process !!! :):):)\n");
            System.out.print("Choose an option by entering value: ");
            ck=input.nextInt();

            if(ck==1){
                System.out.print("Enter the value want to insert : ");
                val=input.nextInt();
                System.out.println();
                push(val);
            }
            else if(ck==2){
                pop();
            }
            else if(ck==3){
                print_stack();
            }
            else if(ck==4){
                break;
            }
        }
    }

    public static void main(String[] args) {
        stack cn= new stack();

        cn.execution();
    }
}
