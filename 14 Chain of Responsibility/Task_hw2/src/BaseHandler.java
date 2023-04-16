public class BaseHandler implements Handler{
    private Handler next = null;
    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handle(String fileName) {
        if(next != null){
            next.handle(fileName);
        } else {
            throw new RuntimeException("Запит не оброблений");
        }
    }
}
