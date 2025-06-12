package homework22;

import homework22.repository.ProductRepository;
import homework22.service.ProductService;
import homework22.ui.UI;

public class ProductDemo {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        UI ui = new UI(productService);
        ui.UserMenu();
    }

}
