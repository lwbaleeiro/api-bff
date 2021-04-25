package br.com.tokiomarine.bff.auth;

import lombok.Data;

@Data
public class AuthenticateRequest {

    private String user;
    private String password;

}
