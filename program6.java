import java.util.Scanner;
class program6{
    public static void main(String args[]){
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=sc.nextInt();

        System.out.println("enter 2nd number:");
        int b=sc.nextInt();

        System.out.println("enter 3rd number:");
        int c=sc.nextInt();
        
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }

        if(c>b){
            if(c>a){
                temp=c;
                c=b;
                b=a;
                a=temp;
            }

            else{
                temp=c;
                c=b;
                b=temp;
            }
        }

        System.out.println("Decreasing order: " a + " "+b+" "+ c);
    }
}