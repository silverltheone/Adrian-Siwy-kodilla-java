package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ManytoManyFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<EmployeeDto> getEmployees(String name) {
        List<Employee> employees = employeeDao.retrieveNamedEmployees(name);
        return employees.stream()
                .map(e -> new EmployeeDto(e.getId(), e.getFirstname(), e.getLastname()))
                .collect(Collectors.toList());
    }

    public List<CompanyDto> getCompanies(String name) {
        List<Company> companies = companyDao.retrieveNameFragment(name);
        return companies.stream()
                .map(c -> new CompanyDto(c.getId(), c.getName()))
                .collect(Collectors.toList());
    }
}
