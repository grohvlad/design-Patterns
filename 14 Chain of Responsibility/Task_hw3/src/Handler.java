public interface Handler {
    void setNext(Handler handler);
    float handle(float a, float b, String operation);
}
