package com.dnp.Pdf3_2;

public class UserService {
     private final UserRepository userRepository;

     public UserService(UserRepository userRepository) {
          this.userRepository = userRepository;
     }

     public String getUserEmail(String username) {
          User user = userRepository.findByUsername(username);
          return user != null ? user.getEmail() : null;
     }
}
