package com.pro.system.dto;

import com.pro.system.model.NotBlank;

public class StudentRegistrationRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String contactInformation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "StudentRegistrationRequest [name=" + name + ", contactInformation=" + contactInformation + "]";
    }

}
    
