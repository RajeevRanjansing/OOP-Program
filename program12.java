import java.util.*;
class program12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int x=2;
        while(a>1){
            if(a%x==0){
                System.out.print(x + " ");
                a=a/x;
            }
            else{
                x++;
            }
        }
    }
}