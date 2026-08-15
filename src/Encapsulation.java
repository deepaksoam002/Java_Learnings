public class Encapsulation {


    public static void main(String[] args){

        Product pen = new Product();
        pen.setProductDetails("Doms Inxify Plus", 6,20);
        pen.getProductDetails();
        pen.addToCart(6);

        pen.getProductDetails();
        pen.updateProductStock(20);

        pen.getProductDetails();


    }
}

class Product{
    private String productName;
    private int productPrice;
    private int productAvailableStock;

    public void setProductDetails(String name, int price, int stock){

        if(name == null || price<0 || stock <= 0 ){

            System.out.println("All field are required");
        }else {
            productName = name;
            productPrice = price;
            productAvailableStock = stock;
        }
    };

    public void getProductDetails(){
        System.out.println("Product Name :" + productName);
        System.out.println("Product Price :" + productPrice);
        System.out.println("Available Stock :"+ productAvailableStock);
    };

    public void updateProductName(String name){
        if(name == null){
            System.out.println("Product name required");
        }else{
            productName = name;
        }
    }

    public void updateProductPrice(int price){
        if(price<0){
            System.out.println("Product price invalid");
        }else{
            productPrice = price;
        }
    }

    public void updateProductStock(int stock){
        if(stock <= 0){
            System.out.println("Product stock invalid");
        }else{
            productAvailableStock += stock;
            System.out.println("Product current stock :" + productAvailableStock);
        }
    }

    public void addToCart(int itemNumber) {
        if(itemNumber <= 0){

              System.out.println("Enter number of item more then 0");

        }
        else if(itemNumber > productAvailableStock){

              System.out.println("Cannot process your order! Currently Available stock :" + productAvailableStock);

        }
        else{

             productAvailableStock -= itemNumber;
             System.out.println(itemNumber+" "+ productName + "successfully added in cart");

       }
    }

}
