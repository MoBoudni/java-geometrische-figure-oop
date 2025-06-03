package de.lernpaket.abstrakteklassen;

/**
 * Testklasse zur Demonstration der Polymorphie bei geometrischen Figuren.
 * 
 * Diese Klasse zeigt das Konzept der Polymorphie: Circle-Instanzen werden
 * als Figure-Referenzen behandelt, wodurch spezifische Implementierungen
 * zur Laufzeit aufgerufen werden (späte Bindung).
 */
public class Test {

    /**
     * Hauptmethode zum Testen der Figure-Hierarchie.
     * 
     * Erstellt verschiedene Circle-Instanzen und gibt deren Eigenschaften aus.
     * Demonstriert Polymorphie durch Verwendung von Figure-Referenzen.
     * 
     * @param args Kommandozeilenargumente (nicht verwendet)
     */
    public static void main(String[] args) {
        // Polymorphie: Circle-Objekte als Figure-Referenzen
        Figure circle1 = new Circle(1.0);
        Figure circle2 = new Circle(2.0);
        Figure circle3 = new Circle(5, 10, 3.0); // Mit Position
        
        System.out.println("=== GEOMETRISCHE FIGUREN ANALYSE ===\n");
        
        // Ausgabe der Informationen für alle Figuren
        showInfosFor(circle1);
        showInfosFor(circle2);
        showInfosFor(circle3);
        
        // Demonstration der Typumwandlung
        demonstrateTypeCasting(circle1);
    }

    /**
     * Gibt detaillierte Informationen über eine geometrische Figur aus.
     * 
     * Diese Methode arbeitet mit der abstrakten Basisklasse Figure und
     * nutzt Polymorphie - die konkreten Implementierungen von getArea()
     * und getPerimeter() werden zur Laufzeit bestimmt.
     * 
     * @param figure die zu analysierende geometrische Figur
     */
    public static void showInfosFor(Figure figure) {
        if (figure == null) {
            System.out.println("Keine Figur angegeben (null)");
            return;
        }
        
        System.out.println("INFORMATIONEN FÜR: " + figure);
        System.out.printf("Position: (%d, %d)%n", figure.getX(), figure.getY());
        System.out.printf("Fläche: %.4f%n", figure.getArea());
        System.out.printf("Umfang: %.4f%n", figure.getPerimeter());
        System.out.printf("Verhältnis Fläche/Umfang: %.4f%n", figure.getAreaPerimeterRatio());
        
        // Zusätzliche Informationen je nach Figurentyp
        if (figure instanceof Circle) {
            Circle circle = (Circle) figure;
            System.out.printf("Radius: %.4f%n", circle.getRadius());
            System.out.printf("Durchmesser: %.4f%n", 2 * circle.getRadius());
        }
        
        System.out.println(); // Leerzeile für bessere Lesbarkeit
    }
    
    /**
     * Demonstriert explizite Typumwandlung und instanceof-Prüfung.
     * 
     * Zeigt, wie man von einer Figure-Referenz auf spezifische
     * Circle-Methoden zugreifen kann.
     * 
     * @param figure die zu prüfende Figur
     */
    private static void demonstrateTypeCasting(Figure figure) {
        System.out.println("=== TYPUMWANDLUNG DEMONSTRATION ===");
        
        if (figure instanceof Circle) {
            System.out.println("Die Figur ist ein Kreis!");
            Circle circle = (Circle) figure;
            
            // Zugriff auf Circle-spezifische Methoden
            double originalRadius = circle.getRadius();
            System.out.printf("Ursprünglicher Radius: %.2f%n", originalRadius);
            
            // Radius verdoppeln und Auswirkungen zeigen
            circle.setRadius(originalRadius * 2);
            System.out.printf("Neuer Radius: %.2f%n", circle.getRadius());
            System.out.printf("Neue Fläche: %.4f (Faktor 4!)%n", circle.getArea());
            System.out.printf("Neuer Umfang: %.4f (Faktor 2!)%n", circle.getPerimeter());
            
            // Radius zurücksetzen
            circle.setRadius(originalRadius);
        } else {
            System.out.println("Die Figur ist kein Kreis.");
        }
        
        System.out.println();
    }
    
    /**
     * Hilfsmethode zum Vergleichen zweier Figuren.
     * 
     * @param fig1 erste Figur
     * @param fig2 zweite Figur
     */
    public static void compareFigures(Figure fig1, Figure fig2) {
        System.out.println("=== FIGURENVERGLEICH ===");
        System.out.printf("Figur 1: %s%n", fig1);
        System.out.printf("Figur 2: %s%n", fig2);
        
        double area1 = fig1.getArea();
        double area2 = fig2.getArea();
        
        if (area1 > area2) {
            System.out.printf("Figur 1 hat eine größere Fläche (%.4f > %.4f)%n", area1, area2);
        } else if (area1 < area2) {
            System.out.printf("Figur 2 hat eine größere Fläche (%.4f > %.4f)%n", area2, area1);
        } else {
            System.out.println("Beide Figuren haben die gleiche Fläche");
        }
        
        System.out.println();
    }
}