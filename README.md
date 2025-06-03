# Java Geometrische Figuren - OOP Demonstration

Dieses Repository enthält ein didaktisches Java-Projekt, das grundlegende objektorientierte Programmierkonzepte anhand geometrischer Figuren demonstriert. Es dient als Lernressource für Studierende und Entwickler, die ihre Kenntnisse in objektorientierter Programmierung vertiefen möchten.

## Projektübersicht

Das Projekt implementiert eine Klassenhierarchie für geometrische Figuren mit einer Basisklasse `Figure` und einer konkreten Implementierung `Circle`. Es zeigt wichtige OOP-Konzepte wie:

- Vererbung und Klassenhierarchien
- Polymorphie und späte Bindung
- Methoden-Überschreibung (Method Overriding)
- Kapselung durch Getter und Setter
- Typumwandlung und instanceof-Operator

Die aktuelle Implementierung verwendet reguläre Klassen, weist jedoch in den Kommentaren darauf hin, dass eine bessere Lösung die Verwendung abstrakter Klassen wäre, um Programmierfehler zu vermeiden.

## Projektstruktur

Das Projekt besteht aus drei Hauptklassen im Package `de.lernpaket.abstrakteklassen`:

1. **Figure.java**: Basisklasse für alle geometrischen Figuren
   - Definiert gemeinsame Eigenschaften wie Position, Flächeninhalt und Umfang
   - Bietet Methoden zur Berechnung des Fläche-Umfang-Verhältnisses

2. **Circle.java**: Konkrete Implementierung eines Kreises
   - Erbt von Figure und implementiert spezifische Berechnungen für Fläche und Umfang
   - Fügt kreisspezifische Eigenschaften wie Radius hinzu

3. **Test.java**: Demonstrationsklasse mit main-Methode
   - Zeigt die Verwendung der Klassen und polymorphes Verhalten
   - Enthält Hilfsmethoden zur Analyse und zum Vergleich von Figuren

## Lernziele

Dieses Projekt hilft dabei, folgende Konzepte zu verstehen:

- Wie man eine sinnvolle Klassenhierarchie für verwandte Objekte entwirft
- Wie Polymorphie zur Laufzeit funktioniert und wie sie genutzt werden kann
- Wie man Methoden korrekt überschreibt und die Basisklassenimplementierung erweitert
- Wie man mit Typumwandlungen und Typprüfungen arbeitet
- Wie man Objekte korrekt vergleicht und Hash-Codes implementiert

## Erweiterungsmöglichkeiten

Das Projekt kann als Ausgangspunkt für weitere Lernaktivitäten dienen:

- Implementierung weiterer geometrischer Figuren (Rechteck, Dreieck, etc.)
- Umwandlung der Figure-Klasse in eine abstrakte Klasse
- Implementierung einer Schnittstelle für vergleichbare Figuren
- Hinzufügen von Zeichenfunktionalität mit Java Swing oder JavaFX
- Implementierung von Unit-Tests für die Klassen

## Verwendung

Um das Projekt auszuführen:

1. Klonen Sie das Repository
2. Öffnen Sie es in Ihrer bevorzugten Java-IDE (Eclipse, IntelliJ IDEA, etc.)
3. Führen Sie die `Test.java`-Klasse aus, um die Demonstration zu sehen

## Lizenz

[Hier Ihre bevorzugte Lizenz einfügen, z.B. MIT, GPL, etc.]

## Beitragen

Beiträge sind willkommen! Wenn Sie Verbesserungen vorschlagen oder Fehler beheben möchten, erstellen Sie bitte einen Pull Request oder öffnen Sie ein Issue.
