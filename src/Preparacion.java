public class Preparacion {
    // se nombran los atributos
    private Nodo cabeza;
    private int puntos;
    // se da inicio al metodo insert
    public void insert(Ingredientes ingrediente) {
        /*if(cabeza == null){
            Nodo ingre = new Nodo(ingrediente);
        }else {
            Nodo aux = cabeza;
            while(aux.getNext()==null){   
            } 
        while (aux.getNext() != null && aux.getNext().getValue().getPuntos() < ingrediente.getPuntos()) {
                aux = aux.getNext();
            }
            Nodo temp = new Nodo(ingrediente);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        contador();
        }*/
        if (cabeza == null) {
            cabeza = new Nodo(ingrediente);
        } else if (ingrediente.getPuntos() < cabeza.getValue().getPuntos()) {
            Nodo aux = new Nodo(ingrediente);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new Nodo(ingrediente));
        } else {
            Nodo aux = cabeza;
            while (aux.getNext() != null
                    && aux.getNext().getValue().getPuntos() < ingrediente.getPuntos()) {
                aux = aux.getNext();
            }
            Nodo temp = new Nodo(ingrediente);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        contador();
    }
    
    // se da inicio al metodo delete
    public void delete(){
        this.cabeza=null;
        this.puntos=0;
    }
    //se da inicio al metodo Inpos
    public String InPos(int pos){
        String s="";
        int cont=0;
        if (cabeza!=null){
            Nodo aux= cabeza;
            while (aux.getNext() != cabeza && cont < 10){
                if (cont == pos){
                    s+=aux.getValue().getIngrediente();
                    cont = 11;
                }
                else{
                    cont++;
                    aux=aux.getNext();
                }
            }
            if(aux.getNext() == cabeza){
                s+=aux.getValue().getIngrediente();
            }
        }
        return s;
    }   

    @Override
    
    //public String toString() {
    //  return "preparacion{" + "cabeza=" + cabeza + ", puntos=" + puntos + '}';
    public String toString() {
        Nodo aux = cabeza;
        String s = "-------Orden-------\n";
        while (aux != null) {
            s += aux.getValue().toString();
            aux = aux.getNext();
        }
        return s;       
    }       
    // se da inicio al metodo exists// este busca el ingrediente y verifica se esta 
    public boolean exists(String ingre) {
        boolean found = false;
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.getValue().getIngrediente() == ingre) {
                found = true;
                aux = null;
            } else {
                aux = aux.getNext();
            }
        }
        contador();
        return found;
    }
    // se da inicio al metodo modifies// este metodo busca el metodo existe y modifica el ingrediente
    public void modifies(Ingredientes ingre, int nuevoP) {
        if (exists(ingre.getIngrediente())) {
            Nodo aux = cabeza;
            while (aux != null) {
                if (aux.getValue().getIngrediente() == ingre.getIngrediente()) {
                    aux.getValue().setIngrediente(ingre.getIngrediente());
                    aux.getValue().setPuntos(ingre.getPuntos());
                    aux = null;
                } else {
                    aux = aux.getNext();
                }
            }
        }
        contador();
    }
    public Nodo getpreparacion(){
        return this.cabeza;
    }
    // se inicia el metodo eliminar ingrediente
    public void elimina(String ingre) {
        if (cabeza != null) {
            if (cabeza.getValue().getIngrediente() == ingre) {
                cabeza = cabeza.getNext();
            } else {
                Nodo aux = cabeza;
                while (aux.getNext() != null) {
                    if (aux.getNext() != null && aux.getNext().getValue().getIngrediente() == ingre) {
                        aux.setNext(aux.getNext().getNext());
                    } else {
                        aux = aux.getNext();
                    }
                }
            }
        }
        contador();
    }
    public int getPuntos(){
        contador();
        return this.puntos;
    }
    // se inicia el metodo extract para extraer el ingrediente y darle situacion a realizar
    public Ingredientes extract(String ingre) {
        //si persona tiene el id, lo extrae(elimina y retorna)
        Ingredientes p = null;
        if (cabeza != null) {
            if (cabeza.getValue().getIngrediente() == ingre) {
                p = cabeza.getValue();
                cabeza = cabeza.getNext();
            } else {
                Nodo aux = cabeza;
                while (aux.getNext() != null) {
                    if (aux.getNext() != null && aux.getNext().getValue().getIngrediente() == ingre) {
                        p = aux.getNext().getValue();
                        aux.setNext(aux.getNext().getNext());
                    } else {
                        aux = aux.getNext();
                    }
                }
            }
        }
        contador();
        return p;
    }
    // se inicia el metodo contador para el conteo de los puntos 
    public void contador(){
        /*int sum=0;
        Nodo aux = cabeza;
        while (aux!= null) {
            sum+=aux.getValue().getPuntos();
            aux = aux.getNext();
        }
        this.puntos=sum;
    }*/
        int sum=0;
        Nodo aux = cabeza;
        while (aux!= null) {
            sum+=aux.getValue().getPuntos();
            aux = aux.getNext();
        }
        this.puntos=sum;
    }
}
