package task2.vistula.secondspringtask2.product.support;

import org.springframework.stereotype.Component;
import task2.vistula.secondspringtask2.product.api.request.ProductRequest;
import task2.vistula.secondspringtask2.product.api.response.ProductResponse;
import task2.vistula.secondspringtask2.product.domain.Product;


@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest){

        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(), product.getName());
    }
}
