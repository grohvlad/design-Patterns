public class T_exception_Handler extends BaseHandler{
    @Override
    public void handle(String fileName) {
        System.out.println(fileName + " can not be opened without " + ClassHelper.getFileFormat(fileName) + "-reader");
    }
}
