package br.com.tokiomarine.bff.config;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import feign.form.FormEncoder;

@Configuration
public class FromUrlEncodedClientConfiguration {

    private ObjectFactory<HttpMessageConverters> messageConverters;

    public FromUrlEncodedClientConfiguration(ObjectFactory<HttpMessageConverters> messageConverters) {
        super();
        this.messageConverters = messageConverters;
    }

    @Bean
    @Primary
    @Scope(SCOPE_PROTOTYPE)
    FormEncoder feignFormEncoder() {
        return new FormEncoder(new SpringEncoder(this.messageConverters));
    }
}
