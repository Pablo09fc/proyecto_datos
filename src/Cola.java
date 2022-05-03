public class Cola {
    //se crean los atributos
    private NodoCola begin;
    private NodoCola end;
    //  se crea el contructor
    public void Cola(){
        this.begin=null;
        this.end=null;
    }
    // se inicia el metodo insert
    public void insert(Preparacion dato){
        NodoCola n = new NodoCola();
        n.setPrepa(dato);
        n.setNext(null);
        if(this.begin==null && end==null){
            this.begin=n;
            this.end=n;
        }else{
            end.setNext(n);
            end = end.getNext();  
        }
       
    }
    // se inicia los metodos de extraccion llamdos extract y extract2
    public Preparacion extract(){
        Preparacion dato = this.begin.getPrepa();
        begin = begin.getNext();
        return dato;
    }
    public Preparacion extract2(){
        Preparacion dato = this.begin.getPrepa();
        return dato;
    }
    // se inicia el metodo empty
        public boolean empty(){
        boolean cola = false;
        if(this.begin==null && end==null)
            cola = true;
    return cola;
    }
        
    // se inicia el metodo buscar llamado search
    public boolean search(String s){
        NodoCola temp = this.begin;
        boolean resultado= false;
        while (temp!=null){
            if(temp.getPrepa().getpreparacion().getValue().getIngrediente().equals(s)){
                resultado = true;
            }
        temp=temp.getNext();
        }
    return resultado;    
    }
    // se inicia el metodo inPos
    public String InPos(int pos){
        String s="";
        int cont=0;
        NodoCola temp = this.begin;
        while(temp!=null && cont<3){
            if(cont == pos){
                s+=temp.getPrepa().toString();
                cont=6;
            }
            else{
            cont++;
            temp=temp.getNext();
            }
        }
        return s;
    }
    // // se inicia el metodo contador con la variable count
    public int count(){
        int counter = 0;
        NodoCola temp = this.begin;
        while(temp != null){
            counter++;
            temp=temp.getNext();
        }
    return counter;  
    }
    // se crea po ultimo el metodo toString
    public String toString(){
        String t="";
        NodoCola temp=begin;
        while(temp!=null){
            t+=temp.getPrepa()+" | ";
            temp=temp.getNext();
        }
    return t;
    }
    public void extraer(String x){
            if(search(x)){
                NodoCola stackAux = null;
                while(x != begin.getPrepa().getpreparacion().getValue().getIngrediente()){
                    NodoCola temp=new NodoCola();
                    temp.setPrepa(begin.getPrepa());
                    if(stackAux == null){
                        stackAux = temp;
                    }
                    else {
                        temp.setNext(stackAux);
                        stackAux=temp;
                    }
                    this.extract();
                }
                this.extract();
                while (stackAux != null){
                    System.out.println("Cola stackAux > "+stackAux.toString());
                    insert(stackAux.getPrepa());
                    stackAux = stackAux.getNext();
                }
                stackAux=null;
            }
    }
    
}
