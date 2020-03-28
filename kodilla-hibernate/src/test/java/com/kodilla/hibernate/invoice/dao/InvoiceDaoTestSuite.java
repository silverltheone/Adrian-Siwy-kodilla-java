package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("001");

        Item item1 = new Item(new BigDecimal(50), 2, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(25), 2, new BigDecimal(50));
        Item item3 = new Item(new BigDecimal(50), 3, new BigDecimal(150));

        Product product1 = new Product("Cellphone Cover #1");
        Product product2 = new Product("Cellphone Cable #1");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product1);

        product1.getItems().add(item1);
        product1.getItems().add(item3);
        product2.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
