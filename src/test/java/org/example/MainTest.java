package org.example;

import org.example.model.PoliticialParty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.Main.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static ArrayList<PoliticialParty> parties = new ArrayList<>();

    @BeforeEach
    void afterEach() {
         parties.clear();
    }

    @Test
    void isAddedInStaticListOfPartiesWhenIncreaseMethodIsInvoked() {
        // Given

        // When
        increaseVote("AKP");

        // Then
        for (PoliticialParty party:parties){
            if (party.getName()=="AKP"){
                Assertions.assertTrue(party.getName()=="AKP");
            }
        }
    }

    @Test
    void isIncreasePartyVote() {
        // Given


        // When
        increaseVote("AKP");
        increaseVote("AKP");
        increaseVote("AKP");

        // Then
        for (PoliticialParty party:parties){
            if (party.getName()=="AKP"){
                Assertions.assertTrue(party.getVote()==3);
            }
        }

    }

    @Test
    void isDecreasePartyVote() {
        // Given


        // When
        increaseVote("AKP");
        increaseVote("AKP");
        increaseVote("AKP");
        decreaseVote("AKP");

        // Then
        for (PoliticialParty party:parties){
            if (party.getName()=="AKP"){
                Assertions.assertTrue(party.getVote()==2);
            }
        }

    }

    @Test
    void whenNoPartyMatchWithTheParameterGiveMessageAndReturnZero() {
        // Given
        parties = new ArrayList<>();
        // When
        int actual = decreaseVote("ZHP");

        // Then
        assertEquals(0,actual);

    }

}