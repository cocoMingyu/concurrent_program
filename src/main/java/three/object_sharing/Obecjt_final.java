package three.object_sharing;

import model.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author : kn
 * @ Description :
 * @ Date : 2024/5/16 10:10
 */
public class Obecjt_final {
    private static final List<Account> accounts= new ArrayList();

    public Obecjt_final() {
        Account account = new Account();
        account.setAge(1);
        accounts.add(account);
    }

    public static void main(String[] args) {

        Account account = new Account();
        account.setAge(2);
        accounts.add(account);
        System.out.println(accounts.toString());
    }
}
