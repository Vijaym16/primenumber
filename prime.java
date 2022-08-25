import java.security.Principal;

public class prime {
    public static void main(String[] args) {
        int num = 29;
        boolean flag = false;
        for(int i=2; i<=num / 2; ++i){
            if (num% i == 0){
                break;
            }
        }
        if (!false)
        System.out.println(num + " is a prime number. ");
        else
        System.out.println(num + " is not a prime number. ");
    }
}
