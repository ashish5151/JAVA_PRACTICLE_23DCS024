import java.util.Scanner;

public class prac_2{
    public static void main(String[] args) {
        int balance = 20;
        int no = 1;
        System.out.print("Enter your account number : ");
        Scanner s = new Scanner(System.in);
        no =s.nextInt();

        if(no==1)

    {
        System.out.print("Your curent balance is : "+ balance+"$");

    }
        else {System.out.print("Enter valid account number");}

        System.out.print("\nName : AASHISH DODIYA \nID : 23DCS024 ");
    }
    
}
