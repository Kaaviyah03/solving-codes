import java.util.*;


class Alternate{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        System.out.print("The alternate prime numbers of "+num+" are : ");
        checkAlternate(num);
       
}

    static int checkPrime(int number){
        int count=0;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                count=1;
                break;
            }
        }
            if(count==0){
                return 1;

            }else{
                return 0;
            }
        }
    static void checkAlternate(int n){
        int temp=2;
        for(int i=2;i<=n-1;i++){
            if(checkPrime(i)==1){
                if(temp%2==0){
                    System.out.print(i+" ");
                    temp++;
            }
        
        }
        }
    }
}
