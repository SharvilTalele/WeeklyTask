import java.util.Scanner;

public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Temperature:");
    double fahrenheit = sc.nextDouble();
    double celsiusResult = (fahrenheit-32) * 5/9;
    System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");


}
