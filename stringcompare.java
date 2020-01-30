import java.util.Scanner;
public class stringcompare
{    
    public static int equal(String s1, String s2){
        int length = 0;
        int length1=s1.length();
        int length2=s2.length();
        
        if(length1<=length2) 
            {
                length=length1;
            }
        else
            {
                length=length2;
            }
        
        for(int i=0;i<length;i++)
        {
            int a=s1.charAt(i);
            
            if((a>=65) && (a<=90)) 
                {
                    a+=32;
                }
            int b=s2.charAt(i);
            
            if((b>=65) && (b<=90)) 
                {
                    b+=32;
                }
            if(a-b>0) 
                 {
                    return 1;
                }
            if(a-b<0) 
                 {
                    return -1;
                }
    }
        return 0;
        }
    public static void main(String args[])
    {
        System.out.println("enter first string");
        String s1=new Scanner(System.in).nextLine();
        System.out.println("enter second string");
        String s2=new Scanner(System.in).nextLine();
        int n=equal(s1,s2);
        System.out.println(n);
    }
    
    

 

}