package dev.likelion.ezpt.EZPT.repository;

import dev.likelion.ezpt.EZPT.entity.Prompt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PromptRepository {
    private final EntityManager em;

    public void save(Prompt prompt){
        if(prompt.getId() == 0){
            em.persist(prompt);
        }
        else {
            em.merge(prompt);
        }
    }

    public Prompt findOne(int id){
        return em.find(Prompt.class, id);
    }

    public List<Prompt> findByUserId(int userId){
        return em.createQuery("select p from Prompt p where p.user_id = :userId", Prompt.class)
                .setParameter("userId", userId)
                .getResultList();
    }
}
