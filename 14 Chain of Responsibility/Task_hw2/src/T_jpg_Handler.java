public class T_jpg_Handler extends BaseHandler{
    @Override
    public void handle(String fileName) {
        if(ClassHelper.getFileFormat(fileName).equals("jpg")){
            System.out.println(fileName + " opened with jpg-reader");
        } else {
            super.handle(fileName);
        }
    }
}
