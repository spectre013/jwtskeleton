package net.zoms.jwt.football.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Football {
    @Id
    private String id;
    private String name;
    private List<Round> rounds;

    Football() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }
}
