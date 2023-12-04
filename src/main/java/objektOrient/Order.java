package objektOrient;

import java.util.List;

public record Order(int orderNum, String customer, String orderName, String address, List<Product> productList) {


}
