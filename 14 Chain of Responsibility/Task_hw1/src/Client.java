import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        final Singleton dataBase = Singleton.getInstance();

        dataBase.addAdminAccount("admin", "123qweASD");
        dataBase.addAdminAccount("administrator", "1234");

        dataBase.addUserAccount("andrii", "1234");
        dataBase.addUserAccount("black_knight", "S@ruman1");
        dataBase.addUserAccount("white_knight", "ruman1");

        Account[] users = {
            Account.createAdmin("admin", "123qweASD"),
            Account.createAdmin("administrator", "1234"),
            Account.createUser("andrii", "1234"),
            Account.createGuest(),
            Account.createUser("black_knight", "S@ruman1"),
            Account.createUser("white_knight", "S111"),
            Account.createGuest(),
        };

        Handler handler1 = new GuestHandler();
        Handler handler2 = new UserHandler();
        Handler handler3 = new AdminHandler();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        for (Account user : users) {
            System.out.println("==============");
            handler1.handle(user);

        }
    }
}
