
import controller.Sets;
import java.util.*;
import controller.ContactoController;
public class App {
    public static void main(String[] args) throws Exception {
        Sets sts = new Sets();
        System.out.println("-------------------MATEO EDUARDO MOLINA CHAMBA----------------------");
        /* 
        System.out.println("-------------------HashSET----------------------");
        runHashSet(sts);
        System.out.println("-----------------LinkedHashSet---------------------");
        runLinkedHashSet(sts);
        System.out.println("-----------------TreeSet---------------------");
        runTreeSet(sts);
        System.out.println("-----------------TreeSetComparacion---------------------");
        runTreeSetComparador(sts);
        System.out.println("-----------------TreeSetComparacionAlfabetico---------------------");
        runTreeSetComparadorAlfabetico(sts);
        */

        ContactoController contactoController = new ContactoController();
    }
    
    public static void runHashSet (Sets set){
        System.out.println(("Elemetnos del HashSet: "));
        Set<String> elementos = set.construirHashSet();
        for (String elemento : elementos){
            System.out.println(elemento);
        }

    }

    public static void runLinkedHashSet (Sets set){
        System.out.println(("Elemetnos del LnkedHashSet: "));
        Set<String> elementos = set.construirLinkedHashSet();
        for (String elemento : elementos){
            System.out.println(elemento);
        }

    }
    public static void runTreeSet (Sets set){
        System.out.println(("Elemetnos del TreeSet: "));
        Set<String> elementos = set.construirTreeSet();
        for (String elemento : elementos){
            System.out.println(elemento);
        }

    }
     public static void runTreeSetComparador (Sets set){
        System.out.println(("Elemetnos del TreeSet con Comparador: "));
        Set<String> elementos = set.construirTreeSetConComparador();
        for (String elemento : elementos){
            System.out.println(elemento);
        }

    }

    public static void runTreeSetComparadorAlfabetico (Sets set){
        System.out.println(("Elemetnos del TreeSet con Comparador Alfabeticamente: "));
        Set<String> elementos = set.construirTreeSetConComparadorAlfabetico();
        for (String elemento : elementos){
            System.out.println(elemento);
        }

    }
}



