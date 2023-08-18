package dev.likelion.ezpt.EZPT.repository;

import dev.likelion.ezpt.EZPT.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public void save(User user){
        em.persist(user);
    }

    public User findOne(int id){
        return em.find(User.class, id);
    }
}
