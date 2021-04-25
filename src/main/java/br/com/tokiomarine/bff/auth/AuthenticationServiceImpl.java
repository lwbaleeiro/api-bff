package br.com.tokiomarine.bff.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private AuthenticationClient authenticationClient;

    public AuthenticationServiceImpl(AuthenticationClient authenticationClient) {
        this.authenticationClient = authenticationClient;
    }

    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        return this.authenticationClient.authenticate(authenticateRequest);
    }

    @Override
    public ValidatedResponse validated(String accessToken) {
        return this.authenticationClient.validated(accessToken);
    }
}
