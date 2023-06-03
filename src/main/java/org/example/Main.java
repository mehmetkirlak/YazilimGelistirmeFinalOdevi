package org.example;

import org.example.model.PoliticialParty;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<PoliticialParty> Parties = new ArrayList<>();

    public static void main(String[] args) {
    }

    public static int increaseVote(String partyName){
        for (PoliticialParty party:Parties){
            if (party.getName()==partyName){
                party.increaseVote();
                return party.getVote();
            }}
        PoliticialParty newParty = new PoliticialParty(partyName);
        Parties.add(newParty);
        newParty.increaseVote();
        return newParty.getVote();
    }

    public static int decreaseVote(String partyName){
        for (PoliticialParty party:Parties){
            if (party.getName()==partyName){
                party.decreaseVote();
                return party.getVote();
            }}
        System.out.println("No such a Party named "+partyName+".");
        return 0;
    }

    public static void selectionResults(){
        for (PoliticialParty party:Parties){
            System.out.println("Party name = "+party.getName()+" vote = "+party.getVote());
        }
    }
}