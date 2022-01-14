import java.util.*;

class Test {
    public static void main(String[] args)
    {
       int arr[]=new int[10];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter an element :");
        int fin=s.nextInt();
        int temp=0;
       for(int i=0;i<arr.length;i++)
       {
           if(fin==arr[i])
           {
               temp=1;
               break;
           }
           else
           {
               temp=0;
           }
       }
        if(temp==1)
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
    }
}
