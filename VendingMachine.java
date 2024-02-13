import java.util.*;
import java.util.Scanner;

public class VendingMachine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello Welcome To Drinks Vending Machine");
        System.err.println("Please Enter Your Age");
        int age=sc.nextInt();
        int i=age;
        //System.out.println(age);
        if(age<100)
        {
        if(i<19){
            System.out.println("Under age drinks are below");
            {
                System.out.println("1.Cococola\n2.Fanta\n3.Redbull\n4.Mango Juice\n5.Vitamin Water");
            }
        }
        else{
            System.out.println("Welcome to bar and Restuarant");
            {
                System.out.println("Select The drink");
                System.out.println("1.Black label\n2.Red Label\n3.Red Wine\4.Corona Beer\n5.Taquila");
            }   
        }
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }
}
