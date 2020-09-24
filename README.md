# testcanal
Cette application consiste en un test BDD, implémenté avec _Cucumber_. Deux instances de ce test sont exécutées en parallèle par _TestNg_. Le premier cas est passant, et le deuxième est non-passant.

Pour installer l'application et exécuter le test, lancer cette commande:

**mvn clean install**

Pour visualiser le rapport Surefire, ouvrir ce fichier:

**target/surefire-reports/index.html**

**Structure de l'application**

**pom.xml**

**src/test/resources/org/examples**: Scénarios de test.

**org.example.RunCucumberTest**: Le _Runner_ des tests _TestNg_.

**org.example.StepDefinitions**: Les étapes du cas de test.

Package **org.example.model**: Classes de modèle représentant les entités fonctionnelles.

Package **org.example.services**: Classes de service qui interrogent le MockServer.

**org.example.mock.CanalExpInitializer**: Classe qui définit les réponses du MockServer.

**Echec**:

Le MockServer ne répond pas.