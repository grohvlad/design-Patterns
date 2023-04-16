public class AdminHandler extends BaseHandler{
    private final Singleton dataBase = Singleton.getInstance();
    @Override
    public void handle(Account account) {
        if (account.getAccessType() == Account.AccessType.Administrator) {
            String adminLogin = account.getLogin();

            if (dataBase.isAdminsPassword(adminLogin, account.getPassword())) {
                System.out.println("Admin access provided: " + adminLogin);
            } else {
                System.out.println("Access denied: " + adminLogin);
            }
        } else {
            super.handle(account);
        }
    }
}
