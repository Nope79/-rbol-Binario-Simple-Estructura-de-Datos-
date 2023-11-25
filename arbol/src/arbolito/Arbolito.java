package arbolito;

/**
 *
 * @author Master79
 */
public class Arbolito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arbol x = new Arbol();
        
       /* x.add(100);
        x.add(50);
        x.add(120);
        x.add(70);
        x.add(35);
        x.add(47);*/
        
        
        
        //x.mayores(new Nodo(100));
        
        /*x.toString2(x.getRaiz());
        
        x.eliminarXD(new Nodo(100));
        
        x.toString2(x.getRaiz());
        
        x.eliminarXD(new Nodo(50));
        
        x.toString2(x.getRaiz());
        
        x.eliminarXD(new Nodo(120));
        
        x.eliminarXD(new Nodo(70));
        
        x.toString2(x.getRaiz());
        
        x.eliminarXD(new Nodo(35));
        
        x.toString2(x.getRaiz());
        
        x.eliminarXD(new Nodo(47));
        
        x.eliminarXD(new Nodo(47));
        
        x.toString2(x.getRaiz());
        x.toString2(x.getRaiz());*/
        x.a(25);
        x.a(15);
        x.a(17);
        x.a(13);
        x.a(11);
        x.a(-7);
        x.a(11);
        x.a(12);
        x.a(12);
        x.a(12);
        x.a(11);
        x.a(117);
        x.a(175);
        x.a(174);
        x.a(170);
        x.a(174);
        x.a(190);
        x.a(180);
        x.a(200);
        x.a(200);
        x.a(202);
        x.a(203);
        
        x.toString2(x.getRaiz());
        
        System.out.println();
        
        //x.mayores(new Nodo(170), x.getRaiz());
        
        x.menores2(new Nodo(12), x.getRaiz());
        
        System.out.println();
        
        x.mayores2(new Nodo(12), x.getRaiz());
        
        //System.out.println(x.buscarConNivel(new Nodo(-7)));
        
        //System.out.println(x.buscar(new Nodo(202)));
       /* System.out.println(x.buscarConNivel(new Nodo(0)));
        System.out.println(x.buscarConNivel(new Nodo(1)));
        System.out.println(x.buscarConNivel(new Nodo(19)));
        System.out.println(x.buscarConNivel(new Nodo(-2)));
        System.out.println(x.buscarConNivel(new Nodo(-10)));
        
        
        
        //System.out.println(x.buscarConNivel(new Nodo(-100)));*/
        
    }
    
}
