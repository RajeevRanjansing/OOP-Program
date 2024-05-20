import java.util.*;
class program15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i;
        for(i=0;i<=9;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse number is ");
        for(i=9;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}