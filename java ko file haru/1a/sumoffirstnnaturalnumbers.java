import java.util.Scanner;
class sumoffirstnnaturalnumbers{
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int n=a.nextInt();
        int b=a.nextInt();
        int i,sum=0;
     for(i=1;i<=n;i++){
         sum=sum+i;
         
         System.out.println(sum+"\t"+b);
     }
    }
}