import java.util.*;

class digits {
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                long num=scan.nextLong();
                int count=0;
                scan.close();
                while(num>0){
                    num=num/10;
                    count++;
                }System.out.println(count);
                
                
    }
}