package de.lernpaket.abstrakteklassen;

/**
 * Basisklasse für zweidimensionale geometrische Objekte wie Rechtecke oder Kreise.
 * 
 * Diese Klasse stellt gemeinsame Eigenschaften aller geometrischen Objekte bereit:
 * - Position auf dem Bildschirm (x, y)
 * - Flächeninhalt (area)
 * - Umfang (perimeter)
 * 
 * Konkrete geometrische Objekte wie Circle oder Rectangle erben von dieser Klasse
 * und implementieren die spezifischen Berechnungen für Fläche und Umfang.
 * 
 * Hinweis: Diese Implementierung zeigt eine Modellierung ohne abstrakte Klassen,
 * was jedoch Raum für Programmierfehler lässt. Eine bessere Lösung wäre die
 * Verwendung abstrakter Methoden.
 */
public class Figure {
    
    /** X-Koordinate der Position auf dem Bildschirm */
    private int x;
    
    /** Y-Koordinate der Position auf dem Bildschirm */
    private int y;
    
    /** Flächeninhalt des geometrischen Objekts */
    private double area;
    
    /** Umfang des geometrischen Objekts */
    private double perimeter;
    
    /** Verhältnis von Fläche zu Umfang */
    private double eaPerimeterRatio;

    /**
     * Konstruktor für ein geometrisches Objekt an der angegebenen Position.
     * 
     * @param x X-Koordinate der Position
     * @param y Y-Koordinate der Position
     */
    public Figure(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    /**
     * Gibt die X-Koordinate der Position zurück.
     * 
     * @return X-Koordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gibt die Y-Koordinate der Position zurück.
     * 
     * @return Y-Koordinate
     */
    public int getY() {
        return y;
    }
    
    /**
     * Setzt die Position des geometrischen Objekts.
     * 
     * @param x neue X-Koordinate
     * @param y neue Y-Koordinate
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gibt den Flächeninhalt des geometrischen Objekts zurück.
     * 
     * Diese Methode sollte in Subklassen überschrieben werden, um die
     * spezifische Flächenberechnung zu implementieren:
     * - Kreis: A = π * r²
     * - Rechteck: A = a * b
     * 
     * @return Flächeninhalt (Standard: 0.0)
     */
    public double getArea() {
        return area;
    }

    /**
     * Gibt den Umfang des geometrischen Objekts zurück.
     * 
     * Diese Methode sollte in Subklassen überschrieben werden, um die
     * spezifische Umfangberechnung zu implementieren:
     * - Kreis: U = 2 * π * r
     * - Rechteck: U = 2 * (a + b)
     * 
     * @return Umfang (Standard: 0.0)
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Gibt das Verhältnis von Flächeninhalt zu Umfang zurück.
     * 
     * @return Verhältnis Fläche/Umfang
     */
    public double getAreaPerimeterRatio() {
        return eaPerimeterRatio;
    }
    
    /**
     * Berechnet und aktualisiert das Fläche-Umfang-Verhältnis.
     * 
     * Sollte nach jeder Änderung von Fläche oder Umfang aufgerufen werden.
     */
    protected void updateAreaPerimeterRatio() {
        if (perimeter != 0) {
            this.eaPerimeterRatio = area / perimeter;
        } else {
            this.eaPerimeterRatio = 0;
        }
    }
    
    /**
     * Setzt den Flächeninhalt (für Subklassen).
     * 
     * @param area neuer Flächeninhalt
     */
    protected void setArea(double area) {
        this.area = area;
        updateAreaPerimeterRatio();
    }
    
    /**
     * Setzt den Umfang (für Subklassen).
     * 
     * @param perimeter neuer Umfang
     */
    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        updateAreaPerimeterRatio();
    }
}