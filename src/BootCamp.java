import java.util.Scanner;

public class BootCamp {
    public void largest(int a,int b,int c){
        System.out.println("enter three numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b && a>=c) {
            System.out.println("the largest number is" +a);
            if (b>=a && b>=c) {
                System.out.println("the largest number is"+b);
            }
        }
        else{
            System.out.println("the largest number is"+c);
        }
    }
    public void smallest(int a,int b,int c){
        System.out.println("enter three numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<=b && a<=c) {
            System.out.println("the smallest number is" +a);
            if (b<=a && b<=c) {
                System.out.println("the largest number is"+b);
            }
        }
        else{
            System.out.println("the smallest number is"+c);
        }
    }
    public void prime(int a){
        int num=0;
        boolean flag=false;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a<num/2){
            if(num % a==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(a+"is a prime number");
        }
        else {
            System.out.println(a+"is not a prime number");
        }
    }
}
