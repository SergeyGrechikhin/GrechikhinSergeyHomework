package homework22.service;

import homework22.entity.Product;
import homework22.repository.ProductRepository;

public class ProductService {
 private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product[] addCar(String producer, double price, int id, String productName) {

        if (productRepository.findById(id) != null) {
            System.out.println("Product with this ID already exists!");
            return null;
        }
        Product product = new Product(producer, price, id, productName);
        productRepository.save(product);
        return new Product[]{product};
    }
    public Product findProductById(int id) {
        return productRepository.findById(id);
    }
    public Product[] getAllProducts() {
        if (productRepository.getProductsCounter() == 0) {
            return new Product[0];
        }
        return productRepository.findAllCars();
    }



    public Product[] findAllProductByProducer(String producer) {
        return productRepository.findProductsByProducer(producer);
    }

    public Product[] findAllProductsByProductName(String ProductName) {
        return productRepository.findProductsByProductName(ProductName);
    }

    public Product[] findProductsByPrice(double minPrice, double maxPrice) {
        return productRepository.findProductsByPrice(minPrice, maxPrice);
    }
    public Product[] findProductsByProductNameandProducer(String productName, String producer) {
        return productRepository.findProductsByProductNameandProducer(productName, producer);
    }

  /*  public ProductRepository getRepository() {
        return productRepository;
    }*/
    public int getProductsCounter() {
        return productRepository.getProductsCounter();
    }


}
