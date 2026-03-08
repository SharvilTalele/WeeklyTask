import java.util.Scanner;

public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Salary:");
    double salary = sc.nextDouble();
    System.out.println("Enter Years of service: ");
    int year = sc.nextInt();
    double bonus;
    if(year>5){
         bonus = salary*5/10;
    }
    else{
        bonus = 0;
    }
    System.out.println(bonus);
}