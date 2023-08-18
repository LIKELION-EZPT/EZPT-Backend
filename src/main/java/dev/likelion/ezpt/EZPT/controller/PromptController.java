package dev.likelion.ezpt.EZPT.controller;

import dev.likelion.ezpt.EZPT.entity.Message;
import dev.likelion.ezpt.EZPT.entity.Prompt;
import dev.likelion.ezpt.EZPT.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PromptController {
    private final MessageService messageService;
    @GetMapping("/messages/{promptId}")
    public ResponseEntity<List<Message>> getChatMessages(@PathVariable int promptId){
        List<Message> messages = messageService.findAll(promptId);
        return ResponseEntity.ok(messages);
    }
}
