package com.koby5i.wh01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductController {

    private static final Logger log = LogManager.getLogger(ProductController.class);

    private ProductService productService;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/product/inventoryAdjustment/{itemId}")
    public String indexProduct(@PathVariable String itemId){
        productService.sendProductMessage(itemId);
        return "message sent itemId="+itemId;
    }
}
