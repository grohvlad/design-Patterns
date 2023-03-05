public class StringBuild {
    private String ourString = "";

    public StringBuild pasteSome(String textToPut, int placeToPut){
        String s1 = ourString.substring(0,placeToPut);
        String s2 = ourString.substring(placeToPut);
        ourString = s1+textToPut+s2;
        return this;
    }
    public StringBuild addSome(String textToPut){
        ourString += textToPut;
        return this;
    }

    public OurString build(){
        return new OurString(ourString );
    }
}
