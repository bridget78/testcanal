@adresse @modification
Feature: Modifier l'adresse d'un abonne

  Scenario: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet
    Given un abonné avec une adresse principale <active> en France
    When le conseiller connecte a <canal> modifie l'adresse de l'abonne
    Then l'adresse de l'abonne modifiee est enregistree sur l'ensemble des contrats de l'abonne
    And un mouvement de modification d'adresse est cree

  Examples:
    | canal | active   |
    | FACE  | inactive |
    | EC    | active   |