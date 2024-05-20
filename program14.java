class program14{
    public static void main(String args[]){
        int a1,a2,a3,a4,n1,n2,n3,n4,n5,n6;

        a1=65+(int)(Math.random())*('Z'-'A');
        a2=65+(int)(Math.random())*('Z'-'A');
        a3=65+(int)(Math.random())*('Z'-'A');
        a4=65+(int)(Math.random())*('Z'-'A');

        n1=(int)(Math.random()*10);
        n2=(int)(Math.random()*10);
        n3=(int)(Math.random()*10);
        n4=(int)(Math.random()*10);
        n5=(int)(Math.random()*10);
        n6=(int)(Math.random()*10);

        System.out.println(" "+(char)(a1)+ (char)(a2)+" "+n1+n2+" "+ (char)(a3)+(char)(a4)+" "+n3+n4+n5+n6);
    }
}