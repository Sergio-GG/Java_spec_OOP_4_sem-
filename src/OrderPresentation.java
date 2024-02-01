import java.io.IOException;

public class OrderPresentation {

    public Product[] products = new Product[4];
    public Customer[] customers = new Customer[3];

    public Product[] loadProducts(){
        Product p1 = new Product("Pillow", 100);
        Product p2 = new Product("Towel", 80);
        Product p3 = new Product("Skirt", 150);
        Product p4 = new Product("Boots", 50);
        products[0] = p1;
        products[1] = p2;
        products[2] = p3;
        products[3] = p4;
        return products;
    }

    public Customer[] loadCustomers(){
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Ellie");
        Customer c3 = new Customer("Ben");
        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;
        return customers;
    }

    public Order getOrder(String customerName, String prodName, int amount) throws MyException{
        for (Customer c: loadCustomers()) {
            for (Product p: loadProducts()) {
                if (c.getName().equals(customerName) && p.getName().equals(prodName)){
                    System.out.println("Success");
                    return new Order(c.getName(), p.getName(), amount);
                }
            }
        }
        throw new MyException("Имя или название продукта невалидны");
    }
}
