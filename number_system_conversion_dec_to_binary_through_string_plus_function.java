import java.util.Scanner;
public class number_system_conversion_through_string_plus_function
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        try
        {
            System.out.println("Hello");
            System.out.println("Welcome to Decimal to Binary Conversion");
            while(true)
            {
                System.out.println();
                System.out.println("Type Decimal Number");
                int a=read.nextInt();
                StringBuffer ans = new StringBuffer();

                noSystemConversion (ans, a);

                System.out.println();
                System.out.println("Binary Value is = ("+ans.reverse()+")2");
                System.out.println();
                System.out.println("If you want to close No Conversion Calculator type exit");
                read.nextLine();
                String outcome=read.nextLine();
                if(outcome.equalsIgnoreCase("exit"))
                {
                    System.out.println();
                    System.out.println("Thank you");
                    System.out.println("bye");
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
    public static StringBuffer noSystemConversion(StringBuffer ans , int a)
    {
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
        return ans;
    }
}
