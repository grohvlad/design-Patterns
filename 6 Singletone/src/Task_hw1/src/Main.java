import java.io.File;
// ./Task_hw2\\src\\files

public class Main {
    public static void main(String[] args) {
        String path = "./src\\Task_hw1\\src\\files\\f1.txt";

        Singleton.getInstance().writeFile(path,"",false); //clear file

        User user1 = new User("Ivan");
        User user2 = new User("Taras");
        User user3 = new User("Fedir");

        Thread thread1 = new Thread(() -> {
            user1.interactWithFile(path);
        });

        Thread thread2 = new Thread(() -> {
            user2.interactWithFile(path);
        });
        Thread thread3 = new Thread(() -> {
            user3.interactWithFile(path);
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Singleton.getInstance().readFile("./src\\Task_hw1\\src\\files\\f1.txt"));

    }
}