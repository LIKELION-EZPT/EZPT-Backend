package dev.likelion.ezpt.EZPT.entity;


import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue
    @Column(name = "message_id")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prompt_id")
    private Prompt prompt;
    private String content;
    @Column(name = "is_gpt")
    private boolean isGpt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prompt getPrompt() {
        return prompt;
    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isGpt() {
        return isGpt;
    }

    public void setGpt(boolean gpt) {
        isGpt = gpt;
    }
}
