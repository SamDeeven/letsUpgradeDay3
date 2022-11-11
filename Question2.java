import java.util.Scanner;

class Palindrome {
    public static void main(String a[]){
     int reverse=0;
     Scanner readInput = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int x = readInput.nextInt();
     int num=x;
     if(x % 2 == 0){
        while(x!=0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        System.out.println(reverse);
        if(num == reverse){
            System.out.println("The number is even and palindrome");
        }
        else{
            System.out.println("The number is even but not palindrome");
        }
     } 
     else{
        System.out.println("Not an Even number");
     }  
    }
}
