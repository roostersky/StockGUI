

package data;

import java.util.ArrayList;
import java.util.List;

/**
 *Container class instance contains Product class instances. There is going to be finite number of possible instances to be stored.
 * @author mario
 */
public class Container {
    
    private static int containerCounter = 1; //Unique number of each container.
    private int containerNumber;
    private List<Product> listOfProducts;
    
    //Constructors
    public Container(){
        this.containerNumber = containerCounter;
        containerCounter++;
    }
    
    //Getters and setters

    /**
     * @return the containerNumber
     */
    public int getContainerNumber() {
        return containerNumber;
    }

    /**
     * @param containerNumber the containerNumber to set
     */
    public void setContainerNumber() {
        this.containerNumber = containerCounter;
    }

    /**
     * @return the listOfProducts
     */
    public List<Product> getListOfProducts() {
        List<Product> copyListOfProducts = new ArrayList<>(this.listOfProducts);
        return copyListOfProducts;
    }
    
    public void addProduct(Product aProduct){
        this.listOfProducts.add(aProduct);
    }
    
    public void removeProduct(Product aProduct){
        this.listOfProducts.remove(aProduct);
    }
    
    @Override
    public String toString(){
        String result = "\nContainer " + this.getContainerNumber() + ": \n";
        for (Product product : this.getListOfProducts()){
            result += product.toString();
        }
        result += "-----------------------------------";
        return result;
    }
    
}
