public class ClassHelper {
    static String getFileFormat(String fileName){
        int lastIndex = fileName.lastIndexOf('.');
        if (lastIndex >= 0 && lastIndex < fileName.length() - 1) {
            return fileName.substring(lastIndex+1);
        }
        return "";
    }

    static Handler getHandlers(){
        Handler handler1 = new T_pdf_Handler();
        Handler handler2 = new T_doc_Handler();
        Handler handler3 = new T_jpg_Handler();
        Handler handler4 = new T_png_Handler();
        Handler handler_end = new T_exception_Handler();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);
        handler4.setNext(handler_end);

        return handler1;
    }
}
