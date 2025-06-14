package homework22.repository;

import homework22.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository ;
    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }
    @Test
    void testSaveProducts() {
        Product p = new Product("Iphone",4000,1,"Phone");
        boolean saved = productRepository.save(p);

        assertTrue(saved);
        assertEquals(1,productRepository.getProductsCounter());
    }
    @Test
    void findById() {
        Product p = new Product("Iphone" , 1000,2,"X5");
        boolean saved =  productRepository.save(p);
        assertTrue(saved);
        Product found = productRepository.findById(2);
        assertNotNull(found);
        assertEquals(found.getId(), p.getId());
    }
    @Test
    void findByProducer() {
        Product p = new Product("Iphone" , 1000,2,"X5");
        boolean saved =  productRepository.save(p);
        assertTrue(saved);
        Product[] found = productRepository.findProductsByProducer("Iphone");
        assertNotNull(found);
        assertEquals(found[0].getProducer(), p.getProducer());
    }
    @Test
    void findByProductName() {
        Product p = new Product("Iphone" , 1000,2,"X5");
        boolean saved =  productRepository.save(p);
        assertTrue(saved);
        Product[] found = productRepository.findProductsByProductName("X5");
        assertNotNull(found);
        assertEquals(found[0].getProductName(), p.getProductName());
    }

    @Test
    void findByPrice() {
        Product p = new Product("Iphone" , 1000,2,"X5");
        boolean saved =  productRepository.save(p);
        assertTrue(saved);
        Product[] found = productRepository.findProductsByPrice(900,1000);
        assertNotNull(found);
        assertEquals(found[0].getPrice(), p.getPrice());
    }
    @Test
    void findByProducerandProductName() {
        Product p = new Product("Iphone" , 1000,2,"X5");
        boolean saved =  productRepository.save(p);
        assertTrue(saved);
        Product[] found = productRepository.findProductsByProductNameandProducer("X5","Iphone");
        assertNotNull(found);
        assertEquals(found[0].getProductName(), p.getProductName());
        assertEquals(found[0].getProducer(), p.getProducer());
    }


}


