package basicjava.homework6.task1;

public class Shop {
    int y ;
    int x;
    int discount ;
    int doubleprice1;
    int doubleprice2;

    public Shop(int y, int x, int discount) {
        this.y = y;
        this.x = x;
        this.discount = discount;
    }

    public void x() {
        System.out.println(" Цена первого товара : " + x);
    }
    public void y() {
        System.out.println(" Цена первого товара : " + y);
    }


    public void doubleprice() {
        doubleprice1 = x + y ;
        System.out.println("  Общая цена двух товаров : " + doubleprice1);
    }

    public void setDoubleprice2() {
        doubleprice2 = doubleprice1 - discount ;
        System.out.println(" Общая цена  двух товаров со скидкой : " + doubleprice2 );

    }

    public void discount() {
        System.out.println(" Общая скидка на два товара : " + discount);
    }

}
