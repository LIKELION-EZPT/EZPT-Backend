package dev.likelion.ezpt.EZPT.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name = "prompt")
public class Prompt {
    @Id
    @GeneratedValue
    @Column(name = "prompt_id")
    private int id;
    @Column(name = "prompt_name")
    private String promptName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "prompt")
    private List<Message> messages = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromptName() {
        return promptName;
    }

    public void setPromptName(String promptName) {
        this.promptName = promptName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Message> getMessage() {
        return messages;
    }

    public void setMessage(List<Message> message) {
        this.messages = message;
    }
}
