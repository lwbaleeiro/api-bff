package br.com.tokiomarine.bff.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private AuthenticationClient authenticationClient;

    public AuthenticationService(AuthenticationClient authenticationClient) {
        this.authenticationClient = authenticationClient;
    }

    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        return this.authenticationClient.authenticate(authenticateRequest);
    }

    public ValidatedResponse validated(String accessToken) {
        return this.authenticationClient.validated(accessToken);
    }
}
