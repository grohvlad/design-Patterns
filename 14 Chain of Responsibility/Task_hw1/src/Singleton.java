import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private Map<String, String> adminsAccounts;
    private Map<String, String> usersAccounts;

    private Singleton(){
        // Login and passwords for administrators
        adminsAccounts = new HashMap<>();
        // Login and passwords for users
        usersAccounts = new HashMap<>();
    }

    final private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }

    public void addUserAccount(String login, String password){
        usersAccounts.put(login,password);
    }
    public void addAdminAccount(String login, String password){
        adminsAccounts.put(login, password);
    }

    public boolean isAdminsPassword(String login, String enteredPassword){
        if(adminsAccounts.containsKey(login)){
            if(enteredPassword.length() >= 8){
                if(enteredPassword.equals(adminsAccounts.get(login))){
                    System.out.println("Password is correct");
                } else {
                    System.out.println("Password is incorrect");
                }
                return enteredPassword.equals(adminsAccounts.get(login));
            }
            System.out.println("Too short password");
        } else {
            System.out.println("No such login");
        }
        return false;
    }

    public boolean isUsersPassword(String login, String enteredPassword){
        if(usersAccounts.containsKey(login)){
            if(enteredPassword.equals(usersAccounts.get(login))){
                System.out.println("Password is correct");
            } else {
                System.out.println("Password is incorrect");
            }
            return enteredPassword.equals(usersAccounts.get(login));
        } else {
            System.out.println("No such login");
            return false;
        }
    }
}