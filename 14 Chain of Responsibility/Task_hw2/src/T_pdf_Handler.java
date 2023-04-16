public class T_pdf_Handler extends BaseHandler{
    @Override
    public void handle(String fileName) {
        if(ClassHelper.getFileFormat(fileName).equals("pdf")){
            System.out.println(fileName + " opened with pdf-reader");
        }
        else {
            super.handle(fileName);
        }
    }
}
