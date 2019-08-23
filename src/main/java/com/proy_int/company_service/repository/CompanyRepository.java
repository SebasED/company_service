package com.proy_int.company_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proy_int.company_service.model.Company;

public interface CompanyRepository extends JpaRepository<Company, String>{

}
