//Ben Kuhlman
//recursion program for CS2300
import java.util.Scanner;
public class bsk57080a10recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num1 = input.nextInt();
        System.out.println(num1 + "! is: "+ factorial(num1));

    }
    public static int factorial(int num){
        if (num >= 1)
            return num * (factorial(num - 1));
        else
            return 1;
    }
}