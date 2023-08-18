package dev.likelion.ezpt.EZPT.service;

import dev.likelion.ezpt.EZPT.entity.User;
import dev.likelion.ezpt.EZPT.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUser(int userid){
        return userRepository.findOne(userid);
    }
}
