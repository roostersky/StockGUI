
package data;

/**
 * @author mario
 */
 
public class Product {
    
    //Instance variables
    private static int productIDNum = 1; //Unique number assigned to each Product
    private String productName; //Name of the Product instance;
    private String productID; //Product instance unique number combined with three first letters of name;
    private int productQTY; //Products quantity;
    
    
    //Constructors
    
    public Product(String aName, int aQTY){
        this.setProductName(aName);
        this.setProductQTY(aQTY);
        this.setProductID();
        Product.productIDNum++;
    }
    
    public Product(String aName){
        this.setProductName(aName);
        this.setProductQTY(1);
        this.setProductID();
        Product.productIDNum++;
    }
    
    public Product(int aQTY){
        this.setProductName("UNKNOWN");
        this.setProductQTY(aQTY);
        this.setProductID();
        Product.productIDNum++;
    }
    
    //Getters and setter methods

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID() {
        if (this.getProductName().length() >= 3){
            this.productID = this.getProductName().substring(0, 2) + productIDNum;
        } else {
            this.productID = this.getProductName() + productIDNum;
        }
    }

    /**
     * @return the productQTY
     */
    public int getProductQTY() {
        return productQTY;
    }

    /**
     * @param productQTY the productQTY to set
     */
    public void setProductQTY(int productQTY) {
        this.productQTY = productQTY;
    }
    
}
