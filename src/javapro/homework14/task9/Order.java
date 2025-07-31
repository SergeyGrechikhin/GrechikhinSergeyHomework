package javapro.homework14.task9;

public class Order {
private String name;
private String info;
private int id ;
private String date;
private double price;
private String status;

    public Order(String name, String status, int id, String date, double price, String info) {
        this.name = name;
        this.status = status;
        this.id = id;
        this.date = date;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}

//Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
//   Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.
