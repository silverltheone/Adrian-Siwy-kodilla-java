package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManytoManyFacadeTest extends TestCase {

    @Autowired
    private ManytoManyFacade manytoManyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

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

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<CompanyDto> testListCompanies = manytoManyFacade.getCompanies("Mechanics");


        //Then
        Assert.assertEquals(1, testListCompanies.size());

        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();

    }
}