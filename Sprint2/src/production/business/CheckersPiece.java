package production.business;

public class CheckersPiece {
    private String color; // Color de la pieza (puede ser "RED" o "BLACK")
    private boolean king = false; // Indica si la pieza es un rey (king)

    // Constructor para inicializar la pieza con un color específico
    public CheckersPiece(String color) {
        this.color = color; // Establece el color de la pieza
    }

    // Devuelve el color de la pieza
    public String getColor() {
        return color; // Devuelve el color actual
    }

    // Establece el color de la pieza
    public void setColor(String color) {
        this.color = color; // Cambia el color de la pieza
    }

    // Devuelve si la pieza es un rey
    public boolean isKing() {
        return king; // Devuelve true si es rey, false de lo contrario
    }

    // Convierte la pieza en un rey
    public void setKing() {
        this.king = true; // Establece el estado de rey a true
    }
}
