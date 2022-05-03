public class NodoCola {
    //Se nombran los atributos
    private Preparacion prepa;
    private NodoCola next;
    // se crea un constructor
    public void NodoCola(Preparacion orden){
        this.prepa= new Preparacion();
        this.next = null;
    }
    // se crean los get y los set
    public Preparacion getPrepa() {
        return prepa;
    }

    public void setPrepa(Preparacion prepa) {
        this.prepa = prepa;
    }

    public NodoCola getNext() {
        return next;
    }

    public void setNext(NodoCola next) {
        this.next = next;
    }
    
    @Override// se crea el metodo toString
    public String toString() {
        return "NodoCola{" + prepa + ", next=" + next + '}';
    }
}
