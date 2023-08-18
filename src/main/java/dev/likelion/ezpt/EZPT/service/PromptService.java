package dev.likelion.ezpt.EZPT.service;

import dev.likelion.ezpt.EZPT.entity.Prompt;
import dev.likelion.ezpt.EZPT.repository.PromptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class PromptService {
    private final PromptRepository promptRepository;

    public void savePrompt(Prompt prompt){
        promptRepository.save(prompt);
    }

    public List<Prompt> findAll(int userId){
        return promptRepository.findByUserId(userId);
    }

    public Prompt findOne(int promptId){
        return promptRepository.findOne(promptId);
    }
}
