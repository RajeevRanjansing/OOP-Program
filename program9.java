import java.util.Scanner;

class program9{
    public static void main(String args[]){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int a[]=new int[size];

        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        int max=a[0];
        int min=a[0];

        for(i=0;i<size;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("maximum number is: "+max);
        System.out.println("minimum number is: "+min);

    }
}