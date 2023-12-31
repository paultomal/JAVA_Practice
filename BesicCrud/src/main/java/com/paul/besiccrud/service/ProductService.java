package com.paul.besiccrud.service;

import com.paul.besiccrud.entity.Product;
import com.paul.besiccrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> product){
        return repository.saveAll(product);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null) ;
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product removed !!" +id;
    }
    public Product updateProduct(Product product){
        Product exsitingProduct = repository.findById(product.getId()).orElse(null);
        exsitingProduct.setName(product.getName());
        exsitingProduct.setQuantity(product.getQuantity());
        exsitingProduct.setPrice(product.getPrice());
        return repository.save(exsitingProduct);

    }

}
