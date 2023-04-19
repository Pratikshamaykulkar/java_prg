import java.util.Scanner;

public class Arrayreverse {

        public static void main(String args[]) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the range:");
            int r= sc.nextInt();
            int a[]= new int[r];
          System.out.println("Enter the array element:");
          for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
          }
    
          System.out.println("Array elements are:");
          for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
          }
          System.out.println("Reverse array elements are:");
          for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]+"");
          }
            }
        }

