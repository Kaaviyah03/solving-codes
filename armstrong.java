import java.util.*;
import java.lang.Math; 

class armstrong{
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int num=scan.nextInt();
                scan.close();
                int temp=num;
                int power=0;
                while(temp>0){
                    temp=temp/10;
                    power++;
                }
                int num1=num;
                int rem=0,arm=0;
                while(num1>0){
                   
                    rem=num1%10;
                    arm+=(Math.pow(rem,power));
                    num1=num1/10; 
                }if(num==arm){
                    System.out.println("armstrong");
                }else{
                    System.out.println("not a armstrong");
                }
    }
}