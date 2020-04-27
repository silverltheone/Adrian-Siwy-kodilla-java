package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManytoManyFacadeTest extends TestCase {

    @Autowired
    private ManytoManyFacade manytoManyFacade;

    @Test
    public void shouldGetEmployees() {
        //Given
        Company company1 = new Company("Mechanics");
        Company company2 = new Company("Electronics");
        Company company3 = new Company("Develompent");

        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Andrzej", "Nowak");
        Employee employee3 = new Employee("Marian", "Kania");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee3);

        company2.getEmployees().add(employee2);

        company3.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);

        employee1.getCompanies().add(company1);

        employee2.getCompanies().add(company2);
        employee2.getCompanies().add(company3);

        employee3.getCompanies().add(company1);
        employee3.getCompanies().add(company3);

        //When

        //Then
        Assert.assertEquals(0, manytoManyFacade.getCompanies("Mechanics").size());
    }
}