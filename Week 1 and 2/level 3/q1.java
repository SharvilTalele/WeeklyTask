import java.util.Scanner;

public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Temperature:");
    double celsius = sc.nextDouble();
    double fahrenheitResult = (celsius * 9/5) + 32;
    System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");


}
