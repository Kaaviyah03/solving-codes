import java.util.*;
import java.lang.Math;

class Automorphic{
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                System.out.print("Enter the number to be checked : ");
                int num=scan.nextInt();
                scan.close();
                int temp=num;
                int square=num*num;
                int c=0;
                while(temp>0){
                    c++;
                    temp=temp/10;
                }
                int x=(int)Math.pow(10,c);
                System.out.println(x);
                if(num==(square%x)){
                    System.out.println("The given number is an Automorphic number");
                }else{
                    System.out.println("The given number is not an automorphic number");
                }
    }
}