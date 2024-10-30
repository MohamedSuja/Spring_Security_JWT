package com.suja.SpringSecEx.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.suja.SpringSecEx.role.NotRoles;
import com.suja.SpringSecEx.role.Role;
import com.suja.SpringSecEx.role.RoleDeserializer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDto {

    @NotBlank(message = "Firstname is required")
    private String firstname;
    @NotBlank(message = "Lastname is required")
    private String lastname;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$",
            message = "Password must contain at least one digit, one uppercase and one lowercase letter, and at least 8 characters")
    private String password;


    @NotRoles()
    @JsonDeserialize(using = RoleDeserializer.class)
    private Role role;
}
