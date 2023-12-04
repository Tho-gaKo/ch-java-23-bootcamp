package objektOrient;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class OrderListRepo {

    List<Order> orderList = new ArrayList<>() ;

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void remOrder(Order order) {
        orderList.remove(order);
    }

    public void getOrder(Order order) {
        orderList.get(order.orderNum());
    }


    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}


