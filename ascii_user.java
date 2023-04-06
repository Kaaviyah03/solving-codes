import java.util.*;

class Ascii_user {
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                System.out.print("Enter the string : ");
                char character=scan.next().charAt(0);
                scan.close();
                int asciivalue=character;
                System.out.println(asciivalue);

                
    }
}