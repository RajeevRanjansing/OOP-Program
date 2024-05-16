import java.util.*;
class program4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weight in pounds:");
        double pound=sc.nextDouble();

        System.out.println("enter the height in inches:");
        double inch=sc.nextDouble();

        double kg=0.45359237*pound;
        double meter=0.0254*inch;

        double BMI=kg/(meter*meter);

        System.out.println(BMI);

    }
}