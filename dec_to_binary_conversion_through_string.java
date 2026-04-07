import java.util.Scanner;
public class dec_to_binary_conversion_through_string
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        try
        {
            System.out.println("Hello");
            System.out.println("Welcome to Decimal to Binary Conversion");
            while(true)
            {
                System.out.println();
                System.out.println("Type Decimal Number");
                int a=read.nextInt();
                String ans=new String();
                while(a>=1)
                {
                    if(a%2==0)
                    {
                        a=a/2;
                        ans=ans.concat("0");
                    }
                    else if(a%2!=0)
                    {
                        a--;
                        a=a/2;
                        ans=ans.concat("1");
                    }
                    if(a==1)
                    {
                        ans=ans.concat("1");
                        break;
                    }
                }
                System.out.println();
                System.out.println("Binary Number is = ("+new StringBuilder(ans).reverse()+")2");
                System.out.println();
                read.nextLine();
                System.out.println("Type exit if you want to leave");
                String s=read.nextLine();
                if(s.equalsIgnoreCase("exit"))
                {
                    System.out.println();
                    System.out.println("Thank you");
                    System.out.println("Bye");
                    break;
                }    
            }
        }
        catch(Exception e)
        {
            System.out.println("Error occured");
        }
    }
}