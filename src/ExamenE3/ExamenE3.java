package ExamenE3;



public class ExamenE3 {

    public static void main(String[] args) {
        Arbolbinario<Integer> arbol = new Arbolbinario<>();

        arbol.add(90);
        arbol.add(70);
        arbol.add(55);
        arbol.add(69);
        arbol.add(67);
        arbol.add(65);
        arbol.add(66);
        arbol.add(89);
        arbol.add(75);
        arbol.add(85);
        arbol.add(77);
        arbol.add(79);
        arbol.add(88);
        arbol.add(86);
        System.out.println("");    
        System.out.println("preorden");     
        arbol.preorden(arbol.getRoot()); 
        System.out.println("");
        System.out.println("inorden");
        arbol.inorden(arbol.getRoot()); 
        System.out.println("");
        System.out.println("postorden");
        arbol.postorden(arbol.getRoot()); 
        
        
        
        
    }

}
