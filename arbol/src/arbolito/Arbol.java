package arbolito;

/**
 *
 * @author Master79
 */
public class Arbol {
    
    private Nodo raiz;
    private int size;

    public Arbol() {
        
        this.raiz = null;
        this.size = 0;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    // METODOS =D
    
    public boolean vacia(){
        
        return raiz == null;
    }
    
    // METODO DE BUSCAR
    
    public boolean buscar(Nodo x){
        
        Nodo aux = raiz;
        
        while(aux != null){
            
            if(x.getValor() < aux.getValor()){
                
                if(aux.getValor() == x.getValor()){
                    
                    return true;
                }
                
                aux = aux.getIzquierda();
            }else{
                
                if(aux.getValor() == x.getValor()){
                    
                    return true;
                }
                
                aux = aux.getDerecha();
            }
        }
        
        return false;
    }
    
    public int buscarConNivel(Nodo x){
        
        Nodo aux = raiz;
        
        int cont = 1;
        
        while(aux != null){
            
            if(x.getValor() < aux.getValor()){
                
                if(aux.getValor() == x.getValor()){
                    
                    return cont;
                }
                
                aux = aux.getIzquierda();
                cont++;
                
            }else{
                
                if(aux.getValor() == x.getValor()){
                    
                    return cont;
                }
                
                aux = aux.getDerecha();
                cont++;
            }
        }
        
        return -1;
    }
    
    public void add(int x){
        
        if(vacia() == true){
            
            this.raiz = new Nodo(x);
        }else{
            
            Nodo aux = raiz;
            
            while(aux != null){
                
                if(x < aux.getValor()){
                    
                    if(aux.getIzquierda() != null){
                        
                        aux = aux.getIzquierda();
                    }else {

                        aux.setIzquierda(new Nodo(x));

                        this.size++;
                        break;
                    }
                }else{
                    
                    if (aux.getDerecha() != null) {

                        aux = aux.getDerecha();
                    } else {

                        aux.setDerecha(new Nodo(x));

                        this.size++;
                        break;
                    }
                }
            } 
        }
    }
    
    public void eliminarXD(Nodo x){
        
        if(vacia() == false && buscar(x) == true){
            
            // ELIMINAR LA RAIZ
            if (raiz.getValor() == x.getValor()) {
                
                Nodo aux = raiz;
                
                if(raiz.getIzquierda() != null){
                    
                    raiz = raiz.getIzquierda();
                    
                    Nodo a = raiz;
                    
                    while(a.getDerecha() != null){
                        
                        a = a.getDerecha();
                    }
                    
                    a.setDerecha(aux.getDerecha());
                    
                    aux.setDerecha(null);
                    aux.setIzquierda(null);
                }
                
                else if(raiz.getDerecha() != null){
                    
                    raiz = raiz.getDerecha();
                    
                    Nodo a = raiz;
                    
                    while(a.getIzquierda() != null){
                        
                        a = a.getIzquierda();
                    }
                    
                    a.setIzquierda(aux.getIzquierda());
                    
                    aux.setDerecha(null);
                    aux.setIzquierda(null);
                }else{
                    
                    raiz = null;
                }

                /*Nodo aux = raiz;

                raiz = raiz.getIzquierda();
                
                Nodo a = raiz;

                while (raiz.getDerecha() != null) {

                    raiz = raiz.getDerecha();
                }

                raiz.setDerecha(aux.getDerecha());
                
                raiz = a;*/
            }else{
                
                Nodo a = raiz;
                Nodo aux = raiz;
                
                while(aux.getValor() != x.getValor()){
                    
                    a = aux;
                    
                    if(aux.getValor() > x.getValor()){
                        
                        aux = aux.getIzquierda();
                    }else{
                        
                        aux = aux.getDerecha();
                    }
                }
                
                // NODO SIN HIJOS
                if(aux.getDerecha() == null && aux.getIzquierda() == null){
                    
                    if(a.getDerecha().getValor() == x.getValor()){
                        
                        a.setDerecha(null);
                    }else{
                        
                        a.setIzquierda(null);
                    }
                }
                
                // NODO CON SOLO UN HIJO A LA DERECHA
                else if(aux.getDerecha() != null && aux.getIzquierda() == null){
                    
                    a.setDerecha(aux.getDerecha());
                    
                    aux.setDerecha(null);
                }
                
                // NODO CON SOLO UN HIJO A LA IZQUIERDA
                else if(aux.getIzquierda() != null && aux.getDerecha() == null){
                    
                    a.setIzquierda(aux.getIzquierda());
                    
                    aux.setIzquierda(null);
                }
                
                // NODO CON DOS HIJOS
                else{
                    
                    if(a.getIzquierda() == aux){
                        
                        a.setIzquierda(aux.getIzquierda());
                        
                        Nodo b = aux.getIzquierda();
                        
                        while (b.getDerecha() != null) {

                            b = b.getDerecha();
                        }

                        b.setDerecha(aux.getDerecha());
                        
                    }else{
                        
                        a.setDerecha(aux.getDerecha());

                        Nodo b = aux.getDerecha();

                        while (b.getIzquierda() != null) {

                            b = b.getIzquierda();
                        }

                        b.setIzquierda(aux.getIzquierda());
                    }
                    
                    aux.setDerecha(null);
                    aux.setIzquierda(null);
                }
            }
            
            System.out.println("ELEMENTO ELIMINADO EXITOSAMENTE ;D");
            
            size--;
        }else{
            
            System.out.println("ESTE ELEMENTO NO SE ENCUENTRA EN EL ÁRBOL ... =)");
        }
    }
    
    public void toString2(Nodo x){
        
        if(x != null && x.getIzquierda() != null){
            
            toString2(x.getIzquierda());
        }
        
        System.out.print(x + " ");
        
        if(x != null && x.getDerecha() != null){
            
            toString2(x.getDerecha());
        }
    }
}
