package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() == 0) {

            OutsourcedPart whiskey = new OutsourcedPart();
            whiskey.setCompanyName("Basil Hayden");
            whiskey.setName("Basil Hayden Bourbon");
            whiskey.setInv(100);
            whiskey.setMinInv(1);
            whiskey.setMaxInv(100);
            whiskey.setPrice(18.0);
            whiskey.setId(1);

            outsourcedPartRepository.save(whiskey);



            OutsourcedPart gin = new OutsourcedPart();
            gin.setCompanyName("Hendricks");
            gin.setName("Hendricks Gin");
            gin.setInv(100);
            gin.setMinInv(1);
            gin.setMaxInv(100);
            gin.setPrice(16.0);
            gin.setId(2);

            outsourcedPartRepository.save(gin);

            OutsourcedPart vodka = new OutsourcedPart();
            vodka.setCompanyName("Belvedere");
            vodka.setName("Belvedere Vodka");
            vodka.setInv(100);
            vodka.setMinInv(1);
            vodka.setMaxInv(100);
            vodka.setPrice(15.0);
            vodka.setId(3);

            outsourcedPartRepository.save(vodka);

            OutsourcedPart tequila = new OutsourcedPart();
            tequila.setCompanyName("Fortaleza");
            tequila.setName("Fortaleza Tequila Blanco");
            tequila.setInv(100);
            tequila.setMinInv(1);
            tequila.setMaxInv(100);
            tequila.setPrice(24.0);
            tequila.setId(4);

            outsourcedPartRepository.save(tequila);

            OutsourcedPart rum = new OutsourcedPart();
            rum.setCompanyName("Appleton");
            rum.setName("Appleton Aged Rum");
            rum.setInv(100);
            rum.setMinInv(1);
            rum.setMaxInv(100);
            rum.setPrice(17.0);
            rum.setId(5);

            outsourcedPartRepository.save(rum);


        }

        if (productRepository.count() == 0) {

        Product oldFashioned = new Product("Old Fashioned",20.0,0);
        Product gimlet = new Product("Gimlet",18.0,0);
        Product margarita = new Product("Margarita",17.0,0);
        Product daquiri = new Product("Daquiri",18.0,0);
        Product martini = new Product("Martini",20.0,0);
        productRepository.save(oldFashioned);
        productRepository.save(gimlet);
        productRepository.save(margarita);
        productRepository.save(daquiri);
        productRepository.save(martini);


        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
