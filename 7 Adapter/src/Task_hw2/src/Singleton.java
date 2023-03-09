public class Singleton {
    private Singleton(){}
    private static final Singleton singleton = new Singleton();
    public static Singleton getInstance() {
        return singleton;
    }
    public float getExchangeRate(){
        //can be modified
        return 36.5F;
    }
}
