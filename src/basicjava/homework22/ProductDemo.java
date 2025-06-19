package basicjava.homework22;

import basicjava.homework22.repository.ProductRepository;
import basicjava.homework22.service.ProductService;
import basicjava.homework22.ui.UI;

public class ProductDemo {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        UI ui = new UI(productService);
        ui.UserMenu();
    }

}
