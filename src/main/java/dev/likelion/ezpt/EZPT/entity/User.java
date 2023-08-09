package dev.likelion.ezpt.EZPT.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Prompt> prompt = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Prompt> getPrompt() {
        return prompt;
    }

    public void setPrompt(List<Prompt> prompt) {
        this.prompt = prompt;
    }
}
