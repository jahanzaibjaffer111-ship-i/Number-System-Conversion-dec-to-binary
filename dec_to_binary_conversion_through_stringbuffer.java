import java.util.Scanner;
public class dec_to_binary_conversion_through_stringbuffer
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        try
        {

            System.out.println("Hello");
            System.out.println("Welcome to Decimal to Binary conversion");
            while(true)
            {
                System.out.println();
                System.out.println("Type Decimal No");
                int a=read.nextInt();
                StringBuffer ans = new StringBuffer();
                while(a>=1)
                {
                    if(a%2==0)
                    {
                        a=a/2;
                        ans.append("0");
                    }
                    else if(a%2!=0)
                    {
                        a--;
                        a=a/2;
                        ans.append("1");
                    }
                    if(a==1)
                    {
                        ans.append("1");
                        break;
                    }
                }
                System.out.println();
                System.out.println("Binary Number is = ("+ans.reverse()+")2");
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
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.out.println("error occured Type again");
        }
    }
}