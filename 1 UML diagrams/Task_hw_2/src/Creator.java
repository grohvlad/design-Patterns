public class Creator {

    public static void main(String[] args) {
        Creator creator = new Creator();
        Product p = creator.createProduct();
        System.out.println(p.doSomething());

        //Let`s change number of product creator will make.
        creator.someOperation();
        p = creator.createProduct();
        System.out.println(p.doSomething());
    }
    private int whitchProduct = 0;

    public void someOperation(){
        whitchProduct = 1 - whitchProduct;
    }
    public Product createProduct(){
        return whitchProduct == 0 ? new Product1() : new Product2();
    }
}
