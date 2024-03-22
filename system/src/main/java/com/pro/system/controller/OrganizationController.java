package com.pro.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.system.dto.OrganizationRegistrationRequest;
import com.pro.system.model.Organization;
import com.pro.system.service.OrganizationService;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/register")
    public ResponseEntity<?> registerOrganization(@Validated @RequestBody OrganizationRegistrationRequest request) {
        Organization organization = organizationService.registerOrganization(request);
        return ResponseEntity.ok(organization);
    }
}