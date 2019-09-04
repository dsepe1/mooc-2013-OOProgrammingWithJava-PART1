
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account myAccount = new Account("My account", 100.00);
        myAccount.deposit(20.00);
//        System.out.println("My account balance is now: " + myAccount.balance());
        System.out.println(myAccount);
    }

}
