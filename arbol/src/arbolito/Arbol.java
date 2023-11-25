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
    
    public Nodo buscar3(Nodo x){
        
        Nodo aux = raiz;
        
        while(aux != null){
            
            if(x.getValor() < aux.getValor()){
                
                if(aux.getValor() == x.getValor()){
                    
                    return x;
                }
                
                aux = aux.getIzquierda();
            }else{
                
                if(aux.getValor() == x.getValor()){
                    
                    return x;
                }
                
                aux = aux.getDerecha();
            }
        }
        
        return null;
    }
    
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
    
    public void a(int x){
        
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
    
    // max y min, menores y mayores
    
    public int max(){
        
        Nodo aux = raiz;
        
        while(aux.getDerecha() != null){
            
            aux = aux.getDerecha();
        }
        
        return aux.getValor();
    }
    
    public int min(){
        
        Nodo aux = raiz;
        
        while(aux.getIzquierda() != null){
            
            aux = aux.getIzquierda();
        }
        
        return aux.getValor();
    }
    
    public void mayores(Nodo x, Nodo base){
        
        // IMPRESION DE LOS MAYORES SIN RECORRER TODO EL ARBOL, PERO CON INEXACTITUD
        
        if(base != null && base.getIzquierda() != null && base.getIzquierda().getValor() >= x.getValor()){

            mayores(x, base.getIzquierda());
        }
        
        if(base.getValor() >= x.getValor()){
            
            System.out.print(base.getValor() + " ");
        }
        
        if(base != null && base.getDerecha() != null){
            
            mayores(x, base.getDerecha());
        }
    }
    
    public void mayores2(Nodo x, Nodo base){
        
        // IMPRESION TOTAL DE LOS MENORES, PERO RECORRE TODO EL ARBOL

        if(base != null && base.getIzquierda() != null){

            mayores2(x, base.getIzquierda());
        }
        
        if(base.getValor() >= x.getValor()){
            
            System.out.print(base.getValor() + " ");
        }
        
        if(base != null && base.getDerecha() != null){
            
            mayores2(x, base.getDerecha());
        }
    }
    
    public void menores(Nodo x, Nodo base){
        
        // IMPRESION DE LOS MENORES SIN RECORRER TODO EL ARBOL, PERO CON INEXACTITUD
        
        if(base != null && base.getIzquierda() != null){
            
            menores(x, base.getIzquierda());
        }
        
        if(base.getValor() < x.getValor()){
            
            System.out.print(base.getValor() + " ");
        }
        
        if(base != null && base.getDerecha() != null && base.getDerecha().getValor() < x.getValor()){
            
            menores(x, base.getDerecha());
        }
    }
    
    public void menores2(Nodo x, Nodo base){
        
        // IMPRESION TOTAL DE LOS MENORES, PERO RECORRE TODO EL ARBOL
        
        if(base != null && base.getIzquierda() != null){
            
            menores2(x, base.getIzquierda());
        }
        
        if(base.getValor() < x.getValor()){
            
            System.out.print(base.getValor() + " ");
        }
        
        if(base != null && base.getDerecha() != null){
            
            menores2(x, base.getDerecha());
        }
    }
    
    public void eliminarXD(Nodo x){
        
        if(vacia() == false && buscar(x) == true){
            
            // RAIZ :D
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
                
                // NO HIJOS :D
                if(aux.getDerecha() == null && aux.getIzquierda() == null){
                    
                    if(a.getDerecha().getValor() == x.getValor()){
                        
                        a.setDerecha(null);
                    }else{
                        
                        a.setIzquierda(null);
                    }
                }
                
                // HIJO DERECHA
                else if(aux.getDerecha() != null && aux.getIzquierda() == null){
                    
                    a.setDerecha(aux.getDerecha());
                    
                    aux.setDerecha(null);
                }
                
                // HIJO IZQUIERDA
                else if(aux.getIzquierda() != null && aux.getDerecha() == null){
                    
                    a.setIzquierda(aux.getIzquierda());
                    
                    aux.setIzquierda(null);
                }
                
                // UNO Y UNO :D
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
        
        System.out.print(x.getValor() + " ");
        
        if(x != null && x.getDerecha() != null){
            
            toString2(x.getDerecha());
        }
    }
}
