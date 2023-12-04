package objektOrient;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class ProductRepo {


    List<Product> productList = new ArrayList<>();


    public void addProd(Product product) {
        productList.add(product);
    }

    public void remProd(Product product) {
        productList.remove(product);
    }
    public void getProd(Product product) {
        productList.get(product.prodNum());
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
