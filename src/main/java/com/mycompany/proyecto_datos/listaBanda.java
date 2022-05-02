/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class ListaBanda {
    //se nombran los atributos
    private NodoLista begin;
    private NodoLista end;
    private int tam;
    // se inicia el metodo insert
public void insert(Ingredientes I){
        if(begin==null){
            begin = new NodoLista(I);
            end = begin;
            tam=1;
        }else if(tam<4){
            NodoLista aux = new NodoLista(I);
            aux.setNext(begin);
            begin.setBack(aux);
            begin=aux;
            tam++;
        }
        end.setNext(begin);
        begin.setBack(end); 
    }
   @Override// se crea el to String
    public String toString(){
        NodoLista aux = begin;
        String s="Lista Banda: \n";
        if (aux != null){
            while(aux.getNext() != begin){
                s+=aux;
                aux=aux.getNext();
            }
            s+=aux;
        } else{
            s+="vacia";
        }
        return s;
    }
    // se inicia el metodo exists
    public boolean exists (int orden){
        boolean bandera=false;
        if(begin != null){
            if (orden >= begin.getValue().getPuntos()&& orden <= end.getValue().getPuntos()){
                NodoLista aux=begin;
                while (aux.getNext() != begin && aux.getValue().getPuntos()<orden ){
                    aux=aux.getNext();
                }
                bandera= (aux.getValue().getPuntos()==orden);
            }
        }
        return bandera;
    }
    // se inicia el metodo InPost 
    public String InPos(int pos){
        String s="";
        int cont=0;
        if (begin!=null){
            NodoLista aux= begin;
            while (aux.getNext() != begin && cont < 4){
                if (cont == pos){
                    s+=aux.getValue().getIngrediente();
                    cont = 5;
                }
                else{
                    cont++;
                    aux=aux.getNext();
                }
            }
            if(aux.getNext() == begin){
                s+=aux.getValue().getIngrediente();
            }
        }
        return s;
    }
    // se inicia el metodo modifiles
    public void modifies(Ingredientes I){
        if (begin!=null){
            if (I.getPuntos()>= begin.getValue().getPuntos() && I.getPuntos()<= end.getValue().getPuntos()){
                NodoLista aux= begin;
                while (aux.getNext() != begin && aux.getValue().getPuntos() < I.getPuntos()){
                    aux=aux.getNext();
                }
                if (aux.getValue().getPuntos() == I.getPuntos()){
                    aux.getValue().setIngrediente(I.getIngrediente());
                    aux.getValue().setPuntos(I.getPuntos());
                }
            }
        }
    }
    // se inicia el metodo delete
    public void delete(String orden){
        if (begin.getValue().getIngrediente().equals(orden)){
                    begin=begin.getNext();
                    end.setNext(begin);
                    begin.setBack(end);
                    tam--;
                }else {
                    NodoLista aux=begin;
                while (aux.getNext()!= begin){
                    if (aux.getNext().getValue().getIngrediente() == orden){
                    if (aux.getNext()== end){
                        aux.setNext(aux.getNext().getNext());
                        //aux.setBack(cabeza);
                        end=aux;
                        begin.setBack(aux);
                        tam--;
                    }else{
                    aux.setNext(aux.getNext().getNext());
                    aux.getNext().setBack(aux);
                    tam--;
                }
            }
                    aux= aux.getNext();
                }    
        }
    }
    // se inicia el metodo extrac
    public Ingredientes extract(String orden){
        Ingredientes p= null;
        if (begin!=null){
            NodoLista aux= begin;
            while (aux.getNext() != begin){
                if (aux.getValue().getIngrediente().equals(orden)){
                    p = aux.getValue();
                    delete(orden);
                }
                    aux=aux.getNext();
            }
        }
        return p;
    }
    public Ingredientes extraer(){
        Ingredientes dato = begin.getValue();
        begin = begin.getNext();
        return dato;
    }
    public Ingredientes extraer2(){
        Ingredientes dato = begin.getValue();
        //inicio = inicio.getNext();
        return dato;
    }
    public void setUltimo(NodoLista ultimo) {
        this.end = end;
    }
}
