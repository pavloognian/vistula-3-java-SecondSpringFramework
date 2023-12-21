package task2.vistula.secondspringtask2.product.service;

import org.springframework.stereotype.Service;
import task2.vistula.secondspringtask2.product.api.request.ProductRequest;
import task2.vistula.secondspringtask2.product.api.response.ProductResponse;
import task2.vistula.secondspringtask2.product.domain.Product;
import task2.vistula.secondspringtask2.product.repository.ProductRepository;
import task2.vistula.secondspringtask2.product.support.ProductMapper;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper){
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest){
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}
