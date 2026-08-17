public class Constructorchaining {


    public static void main(String[] args){

        ProductDetails product1 = new ProductDetails("Doms");
        ProductDetails product2 = new ProductDetails("Doms Pen",10);
        ProductDetails product3 = new ProductDetails("Doms", 10, 20);

        System.out.println("product1: " +"product Name :" +  product1.productName);
        System.out.println("Product1: " +"product Price :" + product1.productPrice);
        System.out.println("Product1: " +"product Stock :" + product1.productAvailableStock);
        System.out.println("  ");
        System.out.println("product2: " +"product Name :" +  product2.productName);
        System.out.println("Product2: " +"product Price :" + product2.productPrice);
        System.out.println("Product2: " +"product Stock :" + product2.productAvailableStock);
        System.out.println("  ");
        System.out.println("product3: " +"product Name :" +  product3.productName);
        System.out.println("Product3: " +"product Price :" + product3.productPrice);
        System.out.println("Product3: " +"product Stock :" + product3.productAvailableStock);

    }
}

class ProductDetails{

    String productName;
    int productPrice;
    int productAvailableStock;

    ProductDetails(String productName){
        this(productName,0);
    };
    ProductDetails(String productName, int productPrice){
        this(productName,productPrice,0);
    };
    ProductDetails(String productName, int productPrice, int productAvailableStock){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailableStock = productAvailableStock;
    };
}
