package ArbolTarjeta;

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
    
    // METODOS...  
    
    // VACIO
    // ya jala
    
    public boolean vide(){
        
        return size == 0;
    }
    
    // AÑADIR
    // ya jala
    public void ajouter(Nodo x){
        
        if(vide() == true){
            
            System.out.println("ELEMENTO AÑADIDO EXITOSAMENTE COMO RAIZ");
            
            raiz = x;
            size++;
        }else{
            
            Nodo aux = raiz;
            
            while(aux != null){
                
                // SI X ES MAYOR O IGUAL SE VA A LA DERECHA
                if(x.getDato().getSaldo() >= aux.getDato().getSaldo()){
                    
                    if(aux.getDerecha() != null){
                        
                        aux = aux.getDerecha();
                    }else{
                        
                        System.out.println("ELEMENTO AÑADIDO EXITOSAMENTE A LA DERECHA");
                        
                        aux.setDerecha(x);
                        this.size++;
                        break;
                    }
                }
                
                // SI X ES MENOR SE VA A LA IZQUIERDA
                else{
                    
                    if(aux.getIzquierda() != null){
                        
                        aux = aux.getIzquierda();
                    }else{
                        
                        System.out.println("ELEMENTO AÑADIDO EXITOSAMENTE A LA IZQUIERDA");
                        
                        aux.setIzquierda(x);
                        this.size++;
                        break;
                    }
                }
            }
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // BUSCAR TITULAR
    // ?
    public Tarjeta rechercherLePropriétaire(String titular, Nodo x){
        
        if(x != null){
            
            if (x != null && x.getDato().getTitular().equalsIgnoreCase(titular)) {

                return x.getDato();
            }

            if (x != null && x.getIzquierda() != null) {

                return rechercherLePropriétaire(titular, x.getIzquierda());
            }

            if (x != null && x.getDerecha() != null) {

                return rechercherLePropriétaire(titular, x.getDerecha());
            }
        }
        
        return null;
    }
    
    public Tarjeta rechercherLePropriétaire2(String titular, Nodo x) {

        if (x != null) {
        if (x.getDato().getTitular().equalsIgnoreCase(titular)) {
            return x.getDato(); // Retorna el valor si se encuentra el titular en este nodo
        }

        // Llama recursivamente a la izquierda y retorna si se encuentra en la izquierda
        Tarjeta tarjetaEncontrada = rechercherLePropriétaire2(titular, x.getIzquierda());
        if (tarjetaEncontrada != null) {
            return tarjetaEncontrada;
        }

        // Llama recursivamente a la derecha y retorna si se encuentra en la derecha
        return rechercherLePropriétaire2(titular, x.getDerecha());
    }

    return null; // Retorna null si el nodo actual es nulo
    }
    
    // BUSCAR TIPO
    
    public void typeRecherche(){
        
        int cont = 0;
        
        
    }
    
    // MODIFICAR SALDO
    
    // ELIMINAR POR TITULAR
    
    // ELIMINAR POR TIPO
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // MAX
    // ya jala
    
    public Nodo maximum(){
        
        Nodo aux = raiz;
        
        if(aux != null){
            
            while(aux.getDerecha() != null){
                
                aux = aux.getDerecha();
            }
            return aux;
        }
        return null;
    }
    
    // MIN
    // ya jala
    
    public Nodo minimum(){
        
        Nodo aux = raiz;
        
        if(aux != null){
            
            while(aux.getIzquierda() != null){
                
                aux = aux.getIzquierda();
            }
            
            return aux;
        }
        
        return null;
    }
    
    // MENORES
    // ya jala
    
    public void mineurs(Nodo x, double dato){
        
        if(x != null && x.getIzquierda() != null){
            
            mineurs(x.getIzquierda(), dato);
        }
        
        if(x != null && dato > x.getDato().getSaldo()){
            
            System.out.println(x.getDato()  );
        } 
        
        if(x != null && x.getDerecha() != null){
            
            mineurs(x.getDerecha(), dato);
        }
    }
    
    // MAYORES
    // ya jala
    
    public void plusGrand(Nodo x, double dato){
        
        if(x != null && x.getIzquierda() != null){
            
            plusGrand(x.getIzquierda(), dato);
        }
        
        if(x != null && dato < x.getDato().getSaldo()){
            
            System.out.println(x.getDato());
        } 
        
        if(x != null && x.getDerecha() != null){
            
            plusGrand(x.getDerecha(), dato);
        }
    }
    
    // IMPRESION
    // ya jala
    public void imprimer(Nodo x){
        
        if(x != null && x.getIzquierda() != null){
            
            imprimer(x.getIzquierda());
        }
        
        if(x != null){
            
            System.out.println(x.getDato());
        }
        
        if(x != null && x.getDerecha() != null){
            
            imprimer(x.getDerecha());
        }
    }
    
}
