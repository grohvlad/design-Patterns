public class UserHandler extends BaseHandler{
    private final Singleton dataBase = Singleton.getInstance();
    @Override
    public void handle(Account account) {
        if (account.getAccessType() == Account.AccessType.User) {
            String userLogin = account.getLogin();

            if (dataBase.isUsersPassword(userLogin, account.getPassword())) {
                System.out.println("User access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        } else {
            super.handle(account);
        }
    }
}
