public class BaseHandler implements Handler{
    private Handler next = null;
    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public float handle(float a, float b, String operation) {
        if(next != null){
            return next.handle(a, b, operation);
        } else {
            throw new RuntimeException("Запит не оброблений");
        }
    }
}
