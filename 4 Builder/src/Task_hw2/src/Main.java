public class Main {
    public static void main(String[] args) {
        StringBuild builder = new StringBuild();
        OurString ourstr1 = builder
                .addSome("Yo, ")
                .addSome("here's a story ")
                .pasteSome("listen up ",4)
                .addSome("\nAbout a little guy")
                .addSome("...")
                .build();
        ourstr1.showString();
    }
}