package dev.likelion.ezpt.EZPT.service;

import dev.likelion.ezpt.EZPT.entity.Message;
import dev.likelion.ezpt.EZPT.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public List<Message> findAll(int promptId){
        return messageRepository.findAll(promptId);
    }

    // user 메세지 전체 찾기
    public List<Message> findUser(int promptId){
        return messageRepository.findUser(promptId);
    }


    public List<Message> findGpt(int promptId){
        return messageRepository.findUser(promptId);
    }

    public void input(Message message){
        messageRepository.save(message);
    }
}
