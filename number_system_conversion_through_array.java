import java.util.Scanner;
public class number_system_conversion_through_array
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
                System.out.println("Type Decimal");
                int a=read.nextInt();
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
                int [] binary=new int [index];
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
                index--;
                System.out.print("binary no is = (");
                for(int i=index; i>=0; i--)
                {
                    System.out.print(binary[i]);
                }
                System.out.println(")2");
                read.nextLine();
                System.out.println();
                System.out.println("Type exit If you want to leave");
                String s=read.nextLine();
                if(s.equalsIgnoreCase("exit"))
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
}