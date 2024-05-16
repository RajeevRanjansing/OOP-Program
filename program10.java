import java.util.Scanner;
class program10{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int row=sc.nextInt();

        System.out.println("Enter the column:");
        int col=sc.nextInt();

        int a[][]=new int[row][col];

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.println(a[i][j]);
            }
        }

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(i==j || (i+j)%2==0){
                    System.out.print(a[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }
                //  System.out.print(" ");
            }

        }
    }
}