/**
 * Created by PierreM on 23/11/2014.
 */
import java.util.*;

public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your sentence: ");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");//" " is the delimiter here.
        while (sc.hasNext())
        {
            String s1 = sc.next();
            System.out.println(s1);
            System.out.print("Enter your sentence: ");
        }

        System.out.println("The loop has been ended");

    }
}