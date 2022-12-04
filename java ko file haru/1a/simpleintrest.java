import java.util.Scanner;
class simpleintrest{
    public static void main(String[]args){
        Scanner a= new Scanner(System.in);
        int p=a.nextInt();
        int t=a.nextInt();
        int r=a.nextInt();
        int simpleintrest=0;
        simpleintrest=(p*t*r)/100;
        System.out.println(simpleintrest);
        
        
        
    }
}
