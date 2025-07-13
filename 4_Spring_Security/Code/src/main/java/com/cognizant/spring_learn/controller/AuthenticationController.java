package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
  private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
  private static final String BASE64_SECRET = "bMx+DeC2dKZPKy6K/Er8Jv3iTzss/6Dn45yOVTuB9Ww=";
  private SecretKey secretKey;

  @PostConstruct
  public void init() {
    byte[] keyBytes = Base64.getDecoder().decode(BASE64_SECRET);
    secretKey = Keys.hmacShaKeyFor(keyBytes);
    LOGGER.info("🔐 JWT secret initialized");
  }

  @GetMapping("/authenticate")
  public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
    LOGGER.info("START - /authenticate");
    LOGGER.debug("Authorization Header: {}", authHeader);

    String user = getUser(authHeader);
    String token = generateJwt(user);

    Map<String, String> response = new HashMap<>();
    response.put("token", token);

    LOGGER.info("END - /authenticate");
    return response;
  }

  private String getUser(String authHeader) {
    LOGGER.info("Start - getUser");
    String encodedCredentials = authHeader.substring("Basic ".length());
    byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
    String decodedString = new String(decodedBytes);
    LOGGER.debug("Decoded credentials: {}", decodedString);
    String username = decodedString.split(":")[0];
    LOGGER.info("End - getUser: {}", username);
    return username;
  }

  private String generateJwt(String user) {
    LOGGER.info("Start - generateJwt");

    Instant now = Instant.now();
    String jwt =
        Jwts.builder()
            .subject(user)
            .issuedAt(Date.from(now))
            .expiration(Date.from(now.plus(20, ChronoUnit.MINUTES)))
            .signWith(secretKey, SignatureAlgorithm.HS256)
            .compact();

    LOGGER.info("End - generateJwt");
    return jwt;
  }
}
