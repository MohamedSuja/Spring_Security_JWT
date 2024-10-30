package com.suja.SpringSecEx.role;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.suja.SpringSecEx.util.Permission.*;

// Enum representing user roles with specific permissions
@RequiredArgsConstructor
public enum Role {
    USER,

    ADMIN,

    MANAGER;


}
