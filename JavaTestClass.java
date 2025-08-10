import java.util.Scanner;


public class JavaTestClass {
    public static void main (String [] arguments) {
        int number;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int reversednumber = 0, temp = number;
        while(temp > 0) {
            int remainder =temp % 10;
            reversednumber = reversednumber * 10 + remainder;
            temp = temp / 10;
        }
        if(number == reversednumber)
        System.out.println("number is palindrome");
        else
        System.out.println("number is nnot palindrome");
    }
    
}
