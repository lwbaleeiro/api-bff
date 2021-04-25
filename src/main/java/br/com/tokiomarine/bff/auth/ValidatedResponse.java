package br.com.tokiomarine.bff.auth;

import lombok.Data;

@Data
public class ValidatedResponse {

    private Boolean validated;
    private String user;

}