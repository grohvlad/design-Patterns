public interface Handler {
    void setNext(Handler handler);
    void handle(String fileName);
}
