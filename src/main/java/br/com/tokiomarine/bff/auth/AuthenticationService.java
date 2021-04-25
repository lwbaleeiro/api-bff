package br.com.tokiomarine.bff.auth;

public interface AuthenticationService {

    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest);

    public ValidatedResponse validated(String accessToken);

}