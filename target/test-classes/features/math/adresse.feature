@address @modification
Feature: Modifier l'adresse d'un abonne

  Scenario: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet
    Given un abonné avec une adresse principale <active> en France
    When le conseiller connecté a <canal> modifie l'adresse de l'abonné
    Then l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné
    And un mouvement de modification d'adresse est créé

  Examples:
    | canal | active   |
    | FACE  | inactive |
    | EC    | active   |