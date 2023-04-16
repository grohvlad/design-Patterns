public class ClassHelper {
    static Handler getHandlers(){
        Handler handler1 = new T_plus_Handler();
        Handler handler2 = new T_minus_Handler();
        Handler handler3 = new T_multiply_Handler();
        Handler handler4 = new T_divide_Handler();
        Handler handler_end = new T_exception_Handler();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);
        handler4.setNext(handler_end);

        return handler1;
    }
}
