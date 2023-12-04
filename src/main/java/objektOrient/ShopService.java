package objektOrient;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();

    public ShopService() {
        productRepo.addProd(new Product("180", "23", "tastatur", "12", 43434));
    }

    List<ShopService> shopServiceList = new ArrayList<>();

    OrderListRepo orderListRepo = new OrderListRepo();
    public void addOrder(Order order) {


        if (doesProdExist(order.productList())) {
            orderListRepo.addOrder(order);
        } else {
            System.out.println(" Product not available. ");
        }
    }

    public boolean doesProdExist(List<Product> productList) {
        for (Product product:productList) {
            if (!productRepo.productList.contains(product)) {
                return false;
            }

        }
        return true;
    }




}
