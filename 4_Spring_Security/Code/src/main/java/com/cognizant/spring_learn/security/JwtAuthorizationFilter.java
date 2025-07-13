package com.cognizant.spring_learn.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {
  private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthorizationFilter.class);
  private static final String BASE64_SECRET = "bMx+DeC2dKZPKy6K/Er8Jv3iTzss/6Dn45yOVTuB9Ww=";

  public JwtAuthorizationFilter(AuthenticationManager authenticationManager) {
    super(authenticationManager);
    LOGGER.info("Start JwtAuthorizationFilter");
    LOGGER.debug("AuthenticationManager: {}", authenticationManager);
  }

  @Override
  protected void doFilterInternal(
      HttpServletRequest req, HttpServletResponse res, FilterChain chain)
      throws IOException, ServletException {
    LOGGER.info("Start - doFilterInternal");

    String header = req.getHeader("Authorization");
    LOGGER.debug("Authorization Header: {}", header);

    if (header == null || !header.startsWith("Bearer ")) {
      chain.doFilter(req, res);
      return;
    }

    UsernamePasswordAuthenticationToken authentication = getAuthentication(req);

    if (authentication != null) {
      SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    chain.doFilter(req, res);
    LOGGER.info("End - doFilterInternal");
  }

  private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
    String token = request.getHeader("Authorization");

    if (token != null) {
      try {
        byte[] keyBytes = Base64.getDecoder().decode(BASE64_SECRET);
        Jws<Claims> jws = Jwts.parser().setSigningKey(keyBytes).build().parseClaimsJws(token);
        String user = jws.getBody().getSubject();
        LOGGER.debug("JWT subject (user): {}", user);

        if (user != null) {
          return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
        }

      } catch (JwtException ex) {
        LOGGER.warn("JWT validation failed: {}", ex.getMessage());
        return null;
      }
    }

    return null;
  }
}
