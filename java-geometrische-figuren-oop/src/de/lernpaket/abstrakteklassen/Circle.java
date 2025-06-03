package de.lernpaket.abstrakteklassen;

/**
 * Konkrete Implementierung eines Kreises als geometrische Figur.
 * 
 * Ein Kreis wird durch seine Position (geerbt von Figure) und seinen Radius
 * vollständig definiert. Die Klasse berechnet Flächeninhalt und Umfang
 * basierend auf den mathematischen Formeln:
 * - Fläche: A = π * r²
 * - Umfang: U = 2 * π * r
 */
public class Circle extends Figure {

    /** Radius des Kreises (muss positiv sein) */
    private double radius;

    /**
     * Erstellt einen neuen Kreis an der Position (0,0) mit dem angegebenen Radius.
     * 
     * @param radius Radius des Kreises (muss positiv sein)
     */
    public Circle(double radius) {
        super(0, 0);
        setRadius(radius);
    }
    
    /**
     * Erstellt einen neuen Kreis an der angegebenen Position mit dem angegebenen Radius.
     * 
     * @param x X-Koordinate der Position
     * @param y Y-Koordinate der Position  
     * @param radius Radius des Kreises (muss positiv sein)
     */
    public Circle(int x, int y, double radius) {
        super(x, y);
        setRadius(radius);
    }

    /**
     * Berechnet und gibt den Flächeninhalt des Kreises zurück.
     * 
     * Formel: A = π * r²
     * 
     * @return Flächeninhalt des Kreises
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Berechnet und gibt den Umfang des Kreises zurück.
     * 
     * Formel: U = 2 * π * r
     * 
     * @return Umfang des Kreises
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Gibt den Radius des Kreises zurück.
     * 
     * @return Radius des Kreises
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setzt den Radius des Kreises.
     * 
     * Der Radius muss positiv sein. Ungültige Werte (≤ 0) werden ignoriert.
     * Nach einer erfolgreichen Änderung werden Fläche und Umfang automatisch
     * neu berechnet und das Fläche-Umfang-Verhältnis aktualisiert.
     * 
     * @param radius neuer Radius (muss > 0 sein)
     * @throws IllegalArgumentException wenn der Radius nicht positiv ist
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius muss positiv sein: " + radius);
        }
        this.radius = radius;
        // Aktualisiere die berechneten Werte in der Basisklasse
        setArea(getArea());
        setPerimeter(getPerimeter());
    }

    /**
     * Gibt eine String-Repräsentation des Kreises zurück.
     * 
     * @return String-Darstellung mit Position und Radius
     */
    @Override
    public String toString() {
        return String.format("Circle [x=%d, y=%d, radius=%.2f, area=%.2f, perimeter=%.2f]", 
                           getX(), getY(), radius, getArea(), getPerimeter());
    }
    
    /**
     * Prüft die Gleichheit mit einem anderen Objekt.
     * 
     * Zwei Kreise sind gleich, wenn sie die gleiche Position und den gleichen
     * Radius haben.
     * 
     * @param obj zu vergleichendes Objekt
     * @return true wenn die Objekte gleich sind, false sonst
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Circle circle = (Circle) obj;
        return getX() == circle.getX() && 
               getY() == circle.getY() && 
               Double.compare(circle.radius, radius) == 0;
    }
    
    /**
     * Berechnet den Hash-Code für diesen Kreis.
     * 
     * @return Hash-Code basierend auf Position und Radius
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getX(), getY(), radius);
    }
}