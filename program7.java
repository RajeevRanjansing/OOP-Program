class program7{
    public static void area(double r){
        System.out.println("Area of circle is "+(3.14*r*r));
    }

    public static void area(double l,double w){
    System.out.println("Area of rectangle is "+(l*w));
    }

    public static void area(double a,double b,double c){
     double s=(a+b+c)/2;
    double ans=java.lang.Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area is "+ans);
    }

    public static void main(String args[]){
        int r=5;
        area(5);

        int l=2,w=3;
        area(2,3);

        int a=1,b=2,c=3;
        area(1,2,3);
    }
}