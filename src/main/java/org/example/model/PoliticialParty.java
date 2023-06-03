package org.example.model;

public class PoliticialParty {

    private String name;
    private int vote;

    public PoliticialParty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getVote() {
        return vote;
    }

    public int increaseVote(){
        this.vote++;
        return vote;
    }
    public int decreaseVote(){
        this.vote--;
        return vote;
    }
}
