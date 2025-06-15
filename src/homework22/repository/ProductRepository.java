package homework22.repository;

import homework22.ShopConfiguration;
import homework22.entity.Product;

import java.util.Arrays;

public class ProductRepository {
    private Product[] products;
    private int productsCounter;

    public ProductRepository() {
        this.products = new Product[ShopConfiguration.MAXPRODUCT];
        this.productsCounter = 0;
    }

    public int getProductsCounter() {
        return productsCounter;
    }

    public Product[] getProducts() {
        return products;
    }

    public boolean save(Product product) {
        if (productsCounter < products.length && products != null) {
            products[productsCounter++] = product;
            return true;
        }
        return false;
    }
    public Product findById(int IdForSearch){
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getId() == IdForSearch) {
                return products[i];
            }
        }
        return null;
    }
    public Product[] findAllCars(){
        return Arrays.copyOf(products,productsCounter);
    }



    public Product[] findProductsByProducer(String Producer) {
        int productsCounterfindProductsbyProducer = 0;
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getProducer().equalsIgnoreCase(Producer)) {
                productsCounterfindProductsbyProducer++;
            }
        }
        if (productsCounterfindProductsbyProducer == 0) {
            return new Product[0] ;
        }
        Product[] result = new Product[productsCounterfindProductsbyProducer];
        int index = 0;
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getProducer().equalsIgnoreCase(Producer)) {
                result[index++] = products[i];
            }
        }
        return result;
    }



    public Product[] findProductsByProductName(String productName) {
        int productsCounterfindProductsByProductName = 0 ;
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                productsCounterfindProductsByProductName++;
            }
        }
        if (productsCounterfindProductsByProductName == 0) {
            return new Product[0];
        }
        Product[] result = new Product[productsCounterfindProductsByProductName];
        int index = 0;
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                result[index++] = products[i];
            }
        }
        return result;
    }
    public Product[] findProductsByProductNameandProducer(String productName,String producer) {
        int productsCounterfindProductsByPNandP = 0 ;
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName) && products[i].getProducer().equalsIgnoreCase(producer)) {
                productsCounterfindProductsByPNandP++;
            }
        }
        if (productsCounterfindProductsByPNandP == 0) {
            return new Product[0];
        }
        Product[] result = new Product[productsCounterfindProductsByPNandP];
        int index = 0;
        for (int i = 0; i < productsCounter; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName) && products[i].getProducer().equalsIgnoreCase(producer)) {
                result[index++] = products[i];
            }
        }
        return result;
    }

    public Product[] findProductsByPrice(double minPrice, double maxPrice) {
        int count = 0 ;
        for (int i = 0; i < productsCounter; i++) {
            double price = products[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                count++;
            }

        }
        if (count == 0) {
            return new Product[0];
        }
        Product[] result = new Product[count];
        int index = 0;
        for (int i = 0; i < productsCounter; i++) {
            double price = products[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                result[index++] = products[i];
            }
        }
        return result;
    }

    public int getMaxCapacity(){
        return products.length;
    }





}
