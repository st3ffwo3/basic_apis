Basic APIs und Libraries
====================================

Dieses Repository beinhaltet alle Basic APIs und Libraries die für andere Projekte benötigt werden.

Voraussetzungen: 
----------------
* JDK 1.6
* Eclipse Indigo SR2
* Checkstyle Plugin
* JBoss Tools Plugin
* EGit Plugin

Build Properties:
-----------------	
Für die ant Skripten existieren global-build.properties im Projekt "BasicBuildEnv". Diese müssen individuell auf jedem Rechner, je nach Konfiguration angepasst werden. Speziell der Installationspfad des JBoss Application Server muss richtig gesetzt werden, da sonst der Build-Prozess fehlschlägt.

Es besteht die Möglichkeit die eingecheckten global-build.properties im Projekt "BasicBuildEnv" zu überschreiben. Hierzu legt man eigene global-build.properties ins Verzeichnis <USER_HOME>/.ant/global-build.properties. Diese werden als erstes beim Build angezogen.

Build:
------
Die Basic API lässt sich per ant bauen. Das zugehörige Skript liegt im Projekt "BasicApi".

    ant -buildfile BasicApi/build.xml complete-build
