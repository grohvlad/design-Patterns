public class T_doc_Handler extends BaseHandler{
    @Override
    public void handle(String fileName) {
        if(ClassHelper.getFileFormat(fileName).equals("doc")){
            System.out.println(fileName + " opened with doc-reader");
        } else {
            super.handle(fileName);
        }
    }
}
