public class User {
    private Singleton fileUser;
    private String nameOfUser;
    public User(String name){
        this.fileUser = Singleton.getInstance();
        this.nameOfUser = name;
    }

    public void interactWithFile(String path){
        this.fileUser = Singleton.getInstance();
        for(int i=0; i<10; i++){
            fileUser.writeFile("./src\\Task_hw1\\src\\files\\f1.txt","User " + this.nameOfUser + " Send message: " + i + "\n",true);
        }
    }
}
