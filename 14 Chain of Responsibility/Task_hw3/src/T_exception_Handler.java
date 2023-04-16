public class T_exception_Handler extends BaseHandler{
    @Override
    public float handle(float a, float b, String operation) {
        throw new RuntimeException("Не реалізовано операцію" + operation);
    }
}
