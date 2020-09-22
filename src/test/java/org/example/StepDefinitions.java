package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ParameterType;
import org.example.model.Adresse;
import org.example.model.Canal;
import org.example.services.SubscriberService;


import java.io.IOException;

import static org.junit.Assert.*;

public class StepDefinitions {

    @ParameterType(".*")
    public Canal canal(String canal) {
        return new Canal(canal);
    }
    @Given("un abonné avec une adresse principale {word} en France")
    public void abonneAdrPrincipal(String word) throws IOException {
        SubscriberService.getRandSubscriber();

        Adresse adresse = new Adresse();
        adresse.setStatut(word);

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("le conseiller connecte a {canal} modifie l'adresse de l'abonne")
    public void conseillerModifAdr(String canal) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("l'adresse de l'abonne modifiee est enregistree sur l'ensemble des contrats de l'abonne")
    public void adrModifiee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("un mouvement de modification d'adresse est cree")
    public void mouvModifAdrCree() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
