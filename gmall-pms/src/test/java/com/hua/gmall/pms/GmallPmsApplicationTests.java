package com.hua.gmall.pms;

import com.hua.gmall.pms.entity.Product;
import com.hua.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());
    }

}
