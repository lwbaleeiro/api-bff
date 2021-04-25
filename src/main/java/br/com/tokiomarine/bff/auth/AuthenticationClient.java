package br.com.tokiomarine.bff.auth;

import br.com.tokiomarine.bff.config.FromUrlEncodedClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;

@FeignClient(url = "${client.url.api-auth}",
        name = "authenticationClient",
        configuration = FromUrlEncodedClientConfiguration.class)
public interface AuthenticationClient {

    String BASE_URL_AUTH = "/auth";

    @PostMapping(BASE_URL_AUTH)
    AuthenticateResponse authenticate(@RequestBody @Valid AuthenticateRequest authenticateRequest);

    @GetMapping(BASE_URL_AUTH + "/validated")
    ValidatedResponse validated(@RequestHeader(value = "Authorization") String authorizationHeader);

}
