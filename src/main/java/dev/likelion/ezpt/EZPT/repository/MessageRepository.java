package dev.likelion.ezpt.EZPT.repository;

import dev.likelion.ezpt.EZPT.entity.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MessageRepository {
    private final EntityManager em;

    public void save(Message message){
        em.persist(message);
    }
    public List<Message> findAll(int promptId){
        return em.createQuery("select m from Message m where m.prompt_id = :promptId",
                Message.class).setParameter("promptID", promptId).getResultList();
    }

    public List<Message> findUser(int promptId){
        return em.createQuery("select m from Message m where m.prompt_id = :promptId and m.is_gpt = :isGpt",
                Message.class).setParameter("promptID", promptId)
                .setParameter("isGpt", false).getResultList();
    }

    public List<Message> findGpt(int promptId){
        return em.createQuery("select m from Message m where m.prompt_id = :promptId and m.is_gpt = :isGpt",
                        Message.class).setParameter("promptID", promptId)
                .setParameter("isGpt", true).getResultList();
    }
}
