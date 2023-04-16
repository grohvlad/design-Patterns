public class T_minus_Handler extends BaseHandler{
    @Override
    public float handle(float a, float b, String operation) {
        if(operation.equals("-")){
            return a-b;
        } else {
            return super.handle(a, b, operation);
        }
    }
}

