package com.example.MiniProject2.service;

import com.example.MiniProject2.entity.User;
import com.example.MiniProject2.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Component
public class UserService {
    //@Autowired
    private UserRepository userRepository;

    public User create(final User user) {
        if(user == null || user.getPhoneNumber() == null ) {
            throw new RuntimeException("Invalid arguments");
        }
        final String PhoneNumber = user.getPhoneNumber();
        if(userRepository.existsByPhoneNumber(PhoneNumber)) {
            log.warn("Email already exists {}", PhoneNumber);
            throw new RuntimeException("Email already exists");
        }

        return userRepository.save(user);
    }

    public User getByCredentials(final String PhoneNumber, final String PassWord, final PasswordEncoder encoder) {
        final User originalUser = userRepository.findByPhoneNumber(PhoneNumber);

        // matches 메서드를 이용해 패스워드가 같은지 확인
        if(originalUser != null && encoder.matches(PassWord, originalUser.getPassWord())) {
            return originalUser;
        }
        return null;
    }
}
