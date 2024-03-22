package com.pro.system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pro.system.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}