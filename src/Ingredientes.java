public class Ingredientes {
    //Se nombran las variables
    String ingrediente;
    int puntos;
    // se crea un contructor
    public Ingredientes (String ingrediente, int puntos){
        this.ingrediente = ingrediente;
        this.puntos = puntos;
    }
    // se crean los get y set
    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override //Se crea el toString 
   
    public String toString() {
        return "Ingrediente=" + ingrediente + ", puntos=" + puntos +"\n";
    }
}
