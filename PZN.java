import java.util.Scanner;
public class PZN
{
    public static void main(String[] args) 
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = sc.nextInt();
        
        if(no > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(no < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is Zero");
        }
    }
}
