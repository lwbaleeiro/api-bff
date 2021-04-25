package br.com.tokiomarine.bff.auth;

import lombok.Data;

@Data
public class AuthenticateResponse {

    private String user;
    private String password;

}
