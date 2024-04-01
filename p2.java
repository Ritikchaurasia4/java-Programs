import java.util.*;
class p2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a = sc.nextInt();
        System.out.println("Enter the second no:");
        int b = sc.nextInt();
        System.out.println("Enter your choice\n1.addition\n2.substraction");
        int c =sc.nextInt();
        switch(c){
            case 1:
                System.out.println("sum is:" + (a+b));
                break;
            case 2:
                System.out.println("difference is:"+ (a-b));
                break;
                default:
                 System.out.println("Invalid input");
        }
         System.out.println("Hello, World!");
    }
}