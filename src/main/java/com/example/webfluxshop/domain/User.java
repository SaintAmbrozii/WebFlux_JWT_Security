package com.example.webfluxshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users",schema = "public")
public class User {
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    private List<String> roles;

    private Boolean aktive;

    private LocalDateTime created_at;
}