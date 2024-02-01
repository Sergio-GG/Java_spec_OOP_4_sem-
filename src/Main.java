import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        OrderPresentation op = new OrderPresentation();
        Order[] orders = new Order[6];

        try {
            orders[0] = op.getOrder("John", "Towel", 5);
            orders[1] = op.getOrder("Ellie", "Skirt", 1);
            orders[2] = op.getOrder("Ben", "Boots", 1);
            orders[3] = op.getOrder("Jackob", "Boots", 1);
            orders[4] = op.getOrder("Ben", "Ball", 1);
            orders[5] = op.getOrder("Ben", "Boots", 1);
        }catch (MyException ex){
            System.out.println("Ошибка ввода: " + ex.getMessage());
        }
        System.out.println();

        try{
            FileWriter fw = new FileWriter("orders.txt", false);
            System.out.println("Массив заказов: ");
            for (Order or: orders) {
                if (or != null) {
                    System.out.println(or);
                    String s = or.toString();
                    fw.write(s +"\n");

                }
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}