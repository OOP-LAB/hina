import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Bill {
    void prepareBill(int orderNo, Date date, int[] productIds, String[] names, int[] quantities, double[] unitPrices);
}

class BillGenerator implements Bill {
    @Override
    public void prepareBill(int orderNo, Date date, int[] productIds, String[] names, int[] quantities, double[] unitPrices) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(date);

        System.out.println("Order No: " + orderNo);
        System.out.println("Date: " + formattedDate);
        System.out.println("-------------------------");
        System.out.println("Product ID\tName\tQuantity\tUnit Price\tTotal");

        double netAmount = 0;
        for (int i = 0; i < productIds.length; i++) {
            int productId = productIds[i];
            String name = names[i];
            int quantity = quantities[i];
            double unitPrice = unitPrices[i];
            double total = quantity * unitPrice;

            System.out.printf("%d\t\t%s\t%d\t\t%.2f\t\t%.2f\n", productId, name, quantity, unitPrice, total);
            netAmount += total;
        }

        System.out.println("-------------------------");
        System.out.println("Net Amount: " + netAmount);
    }
}

public class main {
    public static void main(String[] args) {
        int orderNo = 123;
        Date date = new Date();

        int[] productIds = {101, 102};
        String[] names = {"a", "b"};
        int[] quantities = {2, 1};
        double[] unitPrices = {25.0, 100.0};

        Bill billGenerator = new BillGenerator();
        billGenerator.prepareBill(orderNo, date, productIds, names, quantities, unitPrices);
    }
}


