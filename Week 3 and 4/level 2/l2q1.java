import java.util.Scanner;

public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int n = sc.nextInt();
    if(n>0){
    for(int i =0; i<n;i++){
        if(i%2==0){
            System.out.println(i + " - Even");
        }
        else{
            System.out.println(i + " - Odd");
        }
    }
    }
}