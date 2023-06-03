package org.example;

import org.example.model.PoliticialParty;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.example.Main.*;


public class MainTest {

    public static ArrayList<PoliticialParty> parties = new ArrayList<>();


    @Test
    public void testisAddedInStaticListOfPartiesWhenIncreaseMethodIsInvoked() {
        // Given

        // When
        increaseVote("AKP");

        // Then
        for (PoliticialParty party:parties){
            if (party.getName()=="AKP"){
                assertTrue(party.getName()=="AKP");
            }
        }
    }

    @Test
    public void testisIncreasePartyVote() {
        // Given


        // When
        increaseVote("AKP");
        increaseVote("AKP");
        increaseVote("AKP");

        // Then
        for (PoliticialParty party:parties){
            if (party.getName()=="AKP"){
                assertTrue(party.getVote()==3);
            }
        }

    }

    @Test
    public void testisDecreasePartyVote() {
        // Given


        // When
        increaseVote("AKP");
        increaseVote("AKP");
        increaseVote("AKP");
        decreaseVote("AKP");

        // Then
        for (PoliticialParty party:parties){
            if (party.getName()=="AKP"){
                assertTrue(party.getVote()==2);
            }
        }

    }

    @Test
    public void testwhenNoPartyMatchWithTheParameterGiveMessageAndReturnZero() {
        // Given
        parties = new ArrayList<>();
        // When
        int actual = decreaseVote("ZHP");

        // Then
        assertEquals(0,actual);

    }

}