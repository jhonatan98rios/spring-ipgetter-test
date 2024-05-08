package com.ipgetter.ipgetter.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String publicIPAddress;

    @NotBlank
    private String privateIPAddress;

    @NotBlank
    private String macAddress;

    @NotBlank
    private String browser;

    @NotBlank
    private String systemOperation;

    @NotBlank
    private String platform;
}