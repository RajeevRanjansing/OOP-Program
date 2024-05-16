import java.util.*;
class program2{
    public static void main(String args[]){
        double a,b,c,d,e,f,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=sc.nextDouble();

        System.out.println("enter the value of b:");
        b=sc.nextDouble();

        System.out.println("enter the value of c:");
        c=sc.nextDouble();

        System.out.println("enter the value of d:");
        d=sc.nextDouble();

        System.out.println("enter the value of e:");
        e=sc.nextDouble();

        System.out.println("enter the value of f:");
        f=sc.nextDouble();

        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("value of x is "+x);
        System.out.println("value of x is "+y);
    }
} 