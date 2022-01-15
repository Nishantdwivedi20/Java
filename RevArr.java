import java.util.*;
class Test3 {
 public static void main(String[] args)
 {
     int arr[]=new int[10];
     int arr2[]=new int[10];
     Scanner s=new Scanner(System.in);
     for(int i=0;i<arr.length;i++)
     {
         arr[i]=s.nextInt();
     }
     int j=0;
     for(int i=arr2.length-1;i>=0;i--)
     {
         arr2[i]=arr[j];
         j++;
     }
      for(int i=0;i<arr2.length;i++)
     {
          System.out.print(" "+arr2[i]);
     }             
  }
}
