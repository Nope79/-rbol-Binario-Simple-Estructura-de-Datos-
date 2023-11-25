package ArbolTarjeta;

/**
 *
 * @author Master79
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarjeta a = new Tarjeta("Papuraiz", "Director", 2000);
        Tarjeta b= new Tarjeta("Papu", "Director", 200);
        Tarjeta c= new Tarjeta("Papu", "Director", 300);
        Tarjeta d = new Tarjeta("Papumayor", "Director", 100000);
        Tarjeta e = new Tarjeta("Papu", "Director", 20);
        Tarjeta f= new Tarjeta("Papumenor", "Director", -7);
        Tarjeta g= new Tarjeta("Papu", "Director", 7500);
        Tarjeta h = new Tarjeta("Papurandom", "Director", 900);
        
        Arbol x = new Arbol();
        
        System.out.println("NULL EXCEPTION:");
        
        x.imprimer(x.getRaiz());
        x.maximum();
        x.minimum();
        x.plusGrand(x.getRaiz(), 100);
        x.mineurs(x.getRaiz(), 100);
        x.rechercherLePropriétaire("papu", x.getRaiz());
        
        System.out.println();
        
        x.ajouter(new Nodo(a));
        x.ajouter(new Nodo(b));
        x.ajouter(new Nodo(c));
        x.ajouter(new Nodo(d));
        x.ajouter(new Nodo(e));
        x.ajouter(new Nodo(f));
        x.ajouter(new Nodo(g));
        x.ajouter(new Nodo(h));
        
        System.out.print("PRUEBAS PARA IMPRIMIR \n###########################################");
        System.out.println("###############################################");
        
        x.imprimer(x.getRaiz());
        
        System.out.print("###########################################");
        System.out.println("###############################################");
        
        System.out.print("PRUEBAS PARA MAYORES \n###########################################");
        System.out.println("###############################################");
        
        x.plusGrand(x.getRaiz(), 100);
        
        System.out.print("###########################################");
        System.out.println("###############################################");
        
        System.out.print("PRUEBAS PARA MENORES \n###########################################");
        System.out.println("###############################################");
        
        x.mineurs(x.getRaiz(), 901);
        
        System.out.print("###########################################");
        System.out.println("###############################################");
        
        System.out.print("PRUEBAS EL MAYOR \n###########################################");
        System.out.println("###############################################");
        
        System.out.println(x.maximum());
        
        System.out.print("###########################################");
        System.out.println("###############################################");
        
        System.out.print("PRUEBAS EL MENOR \n###########################################");
        System.out.println("###############################################");

        System.out.println(x.minimum());

        System.out.print("###########################################");
        System.out.println("###############################################");
        
        System.out.print("PRUEBAS BUSCAR TÍTULAR \n###########################################");
        System.out.println("###############################################");

        System.out.println(x.rechercherLePropriétaire2("papuraiz", x.getRaiz()));
        System.out.println(x.rechercherLePropriétaire2("Papumenor", x.getRaiz()));
        System.out.println(x.rechercherLePropriétaire2("Papumayor", x.getRaiz()));
        System.out.println(x.rechercherLePropriétaire2("Papurandom", x.getRaiz()));
        System.out.println(x.rechercherLePropriétaire2("Papu", x.getRaiz()));
        System.out.println(x.rechercherLePropriétaire2("hola", x.getRaiz()));

        System.out.print("###########################################");
        System.out.println("###############################################");
        
    }
    
}
