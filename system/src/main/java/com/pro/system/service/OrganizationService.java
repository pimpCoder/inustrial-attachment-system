package com.pro.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.system.dto.OrganizationRegistrationRequest;
import com.pro.system.model.Organization;
import com.pro.system.repository.OrganizationRepository;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization registerOrganization(OrganizationRegistrationRequest request) {
        Organization organization = new Organization();
        organization.setName(request.getName());
        organization.setContactInformation(request.getContactInformation());
        // Set other properties if any

        return organizationRepository.save(organization);
    }
}

