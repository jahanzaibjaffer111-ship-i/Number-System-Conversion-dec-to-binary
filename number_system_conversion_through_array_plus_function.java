import java.util.Scanner;
public class number_system_conversion_through_array_plus_function
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
                System.out.println("Type Decimal value");
                int a=read.nextInt();
                read.nextLine();
                System.out.println();
                int b=a;
                int index=0;
                while(b>0)
                {
                    if(b%2==0)
                    {
                        b=b/2;
                        index++;
                    }
                    else if(b%2!=0)
                    {
                        b--;
                    }
                    if(b==1)
                    {
                        index++;
                        break;
                    }
                } 
                int no=0;
                int[] binary=new int [index];

                noSystemConversion (binary,a,no);
            
                index--;
                System.out.print("binary no is (");
                for(int i=index; i>=0; i--)
                {
                    System.out.print(binary[i]);
                }
                System.out.print(")2");
                System.out.println();
                System.out.println();
                System.out.println("Type exit if u want to close calculator");
                String response=read.nextLine();
                if(response.equalsIgnoreCase("exit"))
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
    public static int[] noSystemConversion (int [] binary, int a, int no)
    {
        while(a>=1)
        {
            if(a%2==0)
            {
                a=a/2;
                binary [no]=0;
                no++;
            }
            else if(a%2!=0)
            {
                a--;
                a=a/2;
                binary [no]=1;
                no++;
            }
            if(a==1)
            {
                binary [no]=1;
                break;
            }
        }
        return binary;
    }
}