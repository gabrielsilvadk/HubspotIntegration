package com.example.hubspotintegration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
}
