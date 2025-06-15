package homework22.ui;

import homework22.ShopConfiguration;
import homework22.entity.Product;
import homework22.service.ProductService;

import java.util.Scanner;

public class UI {
  private ProductService productService;
  Scanner input = new Scanner(System.in);

    public UI(ProductService productService) {
        this.productService = productService;
    }

    public void createProduct() {
        System.out.println("Enter how many cars you want to add to the database");
        int productscounter = input.nextInt();
        input.nextLine();
        int count = productService.getProductsCounter();
     //   int maxcount = productService.getRepository().getMaxCapacity();
        int maxcount = ShopConfiguration.MAXPRODUCT;
        int freecount = maxcount - count;

        if (productscounter >freecount) {
            System.out.println("You can't add so many products. Exceeds the total number of available spaces.");
            System.out.println("Max Slots : " + freecount);
        }else {
            for (int i = 0; i < productscounter; i++) {
                count = productService.getProductsCounter();
                maxcount = ShopConfiguration.MAXPRODUCT;
                freecount = maxcount - count;

                if (freecount <= 0) {
                    System.out.println("The storage is full !");
                    break;
                }
                System.out.println("Free Slots " +  freecount);
                System.out.println("Enter product producer");
                String producer = input.nextLine();
                System.out.println("Enter product name");
                String productName = input.nextLine();
                System.out.println("Enter product ID/OnlyINT");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Enter product Price/OnlyDouble");
                double price = input.nextDouble();
                input.nextLine();


                Product[] savedProduct = productService.addProduct(producer,price,id,productName);
                if(savedProduct != null){
                    System.out.println("Product added successfully" );
                } else  {
                    System.out.println("Product not added successfully");
                }

            }
        }


    }

    private void printInfoforFindtoId(){
        System.out.println("Enter the ID by which you want to find the product");
        int id = input.nextInt();
        input.nextLine();
        Product foundIdProduct = productService.findProductById(id);
        if(foundIdProduct != null){
            System.out.println("Your Product " + foundIdProduct);
        } else   {
            System.out.println("Your Product not found");
        }
    }





    private void printInfoforFindbyProductsProducer(){
        System.out.println("Enter the producer by which you want to find the product");
        String producer = input.nextLine();
        Product[] foundProducer = productService.findAllProductByProducer(producer);
        if(foundProducer.length == 0){
            System.out.println("Product by producer " +  producer  + " not found");
        } else {
            System.out.println("Product by producer " +  producer  +  " : " );
            for (int i = 0; i < foundProducer.length ; i++) {
                System.out.println(" - " + foundProducer[i]);
            }
        }
    }

    private void printInfoforFindbyProductName(){
        System.out.println("Enter the Product name by which you want to find the product");
        String productname = input.nextLine();
        Product[] foundproductname = productService.findAllProductsByProductName(productname);
        if(foundproductname.length == 0){
            System.out.println("Product with this product name  " +  productname  + " not found ");
        } else {
            System.out.println("Product with this product name " +
                    " " +  productname  +  " : " );
            for (int i = 0; i < foundproductname.length ; i++) {
                System.out.println(" - " + foundproductname[i]);
            }
        }
    }
    private void printInfoforFindbyProductNameandProducer(){
        System.out.println("Enter the Product name and Producer by which you want to find the product");
        System.out.println("Product name");
        String productname = input.nextLine();
        System.out.println("Producer");
        String producer = input.nextLine();
        Product[] foundproduct = productService.findProductsByProductNameandProducer(productname, producer);
        if(foundproduct.length == 0){
            System.out.println("Product with this product name and producer " +  productname + producer + " not found ");
        } else {
            System.out.println("Product with this product name " + productname + " and " +  producer  +  " : " );
            for (int i = 0; i < foundproduct.length; i++) {
                System.out.println(" - " + foundproduct[i]);
            }
        }
    }
    public void printInfo() {
        Product[] products = productService.getAllProducts();
        if ( products.length == 0) {
            System.out.println("Products not added to the catalog yet ");
            return;
        }
        System.out.println(" Info : ") ;
        for (int i = 0; i < products.length ; i++) {
            if (products[i] == null) {
                return;
            }
            System.out.println( " \n---- " + "\nProducer product : " + products[i].getProducer() + "  " + "\nProduct Name : " + products[i].getProductName() + "\nID : " + products[i].getId() + "\nProduct Price " + products[i].getPrice() + "Euro");
        }
    }

    private void findByPrice(){
        System.out.println(" Min Price : ") ;
        double minPrice = input.nextDouble();
        input.nextLine();
        System.out.println(" Max Price : ") ;
        double maxPrice = input.nextDouble();
        input.nextLine();
        Product[] products = productService.findProductsByPrice(minPrice, maxPrice);
        if(products.length == 0){
            System.out.println("This Price not Found");
        } else  {
            System.out.println(" This Price Found : ");
            for (int i = 0; i < products.length ; i++) {
                System.out.println(" \n---- " + "\nProducer product : " + products[i].getProducer() + "  " + "\nProduct Name : " + products[i].getProductName() + "\nID : " + products[i].getId() + "\nProduct Prise" + products[i].getPrice());
            }
        }
    }
    public void UserMenu(){
        while(true){
            System.out.println(" ===*Menu*=== ");
            System.out.println("1. Add product/products to the database.");
            System.out.println("2. Find a product in the database. ");
            System.out.println("3. Info about all products.");
            System.out.println("0. Exit.");

            String userChoice = input.nextLine();
            switch (userChoice) {
                case "1":
                    createProduct();
                    break;

                case "2":
                    while (true) {
                        System.out.println("\n===*Search Products*===");
                        System.out.println("1. Find by ID");
                        System.out.println("2. Find by producer");
                        System.out.println("3. Find by product name");
                        System.out.println("4. Find by price");
                        System.out.println("5. Find by producer and product name");
                        System.out.println("0. Exit in main menu");
                        String userСhoiceExtra = input.nextLine();
                        switch (userСhoiceExtra) {
                            case "1":
                                printInfoforFindtoId();
                                break;
                            case "2":
                                printInfoforFindbyProductsProducer();
                                break;
                            case "3":
                                printInfoforFindbyProductName();
                                break;
                            case "4":
                                findByPrice();
                                break;
                                case "5":
                                    printInfoforFindbyProductNameandProducer();
                            case "0":
                                System.out.println("Back to the main menu");
                                break;
                            default:
                                System.out.println("Error");
                        }
                        if (userСhoiceExtra.equals("0")) {
                            break;
                        }
                    }
                    break;


                case "3":
                    printInfo();
                    break;
                case "0":
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Error");
            }

        }
    }
    }



