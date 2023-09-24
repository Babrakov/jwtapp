package ru.infoza.jwtapp.dto;

import lombok.Data;

/**
 * DTO class for authentication (login) request.
 *
 * @author Sergei Babrakov
 * @version 1.0
 */

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
