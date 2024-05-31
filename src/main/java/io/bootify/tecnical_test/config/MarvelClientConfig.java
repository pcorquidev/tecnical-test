package io.bootify.tecnical_test.config;

import feign.RequestInterceptor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MarvelClientConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            String apiKey = "a849861b78fe8e15ea275dd5e41d4cbf";
            String privateKey = "e9a06b706ca5189c5f40b0a8f78a3eeaea1c2453";
            String timestamp = String.valueOf(System.currentTimeMillis());
            String hash = generateHash(timestamp, privateKey, apiKey);

            requestTemplate.query("apikey", apiKey);
            requestTemplate.query("ts", timestamp);
            requestTemplate.query("hash", hash);
        };
    }

    public static String generateHash(String timestamp, String privateKey, String publicKey) {
        String valueToHash = timestamp + privateKey + publicKey;
        return DigestUtils.md5Hex(valueToHash);
    }
}