import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import java.io.File;

public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = null;
    private static final Lock lock = new ReentrantLock();

    public static Singleton getInstance() {

        if (instance == null){
            lock.lock();
            if (instance == null) {
                instance = new Singleton();
            }
            lock.unlock();
        }

        return instance;
    }

    public String readFile(String path) {
        String fileText = "";
        try {
            fileText = new Scanner(new File(path)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            System.out.println("There is no file with path" + path);
            throw new RuntimeException(e);
        }
        return fileText;
    }

    public void writeFile(String path, String text, boolean append) {
        String fileText = "";
        try {
            File file = new File(path);
            if(!file.exists())  file.createNewFile();
            FileWriter fileWrite = new FileWriter(file,append);
            fileWrite.write(text);
            fileWrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}