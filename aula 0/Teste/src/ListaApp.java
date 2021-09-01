public class ListaApp {
    public static void main(String[] args) {
        Lista l = new Lista();
        
        l.inserirFinalRec(5);
        l.inserirFinalRec(6);
        l.inserirFinalRec(3);
        l.inserirInicio(9);
        System.out.println(l.encontrarElementoRec(l.inicio,3));

        l.imprimir(); // 9 5 6 3 
        //testecommit;
        
        /*
        if(l.removerElemento(6)) {
            System.out.println("Removeu!!");
        }
        else {
            System.out.println("Não encontrou!");
        }
         if(l.removerElemento(5)) {
            System.out.println("Removeu!!");
        }
        else {
            System.out.println("Não encontrou!");
        }
        if(l.removerElemento(3)) {
            System.out.println("Removeu!!");
        }
        else {
            System.out.println("Não encontrou!");
        }
        if(l.removerElemento(9)) {
            System.out.println("Removeu!!");
        }
        else {
            System.out.println("Não encontrou!");
        }
        if(l.removerElemento(10)) {
            System.out.println("Removeu!!");
        }
        else {
            System.out.println("Não encontrou!");
        }
        l.imprimir();
        */
        
        
        /*        
        System.out.println(l.encontrarElemento(9)); // true
        System.out.println(l.encontrarElemento(5)); // true 
        System.out.println(l.encontrarElemento(6)); // true
        System.out.println(l.encontrarElemento(3)); // true
        System.out.println(l.encontrarElemento(10)); // false
        */
        
        /*
        // 9 5 6 3
        if(!l.isEmpty()) {
            System.out.println("Removido = " + l.removerInicio());
        }
        // 5 6 3
        l.imprimir();
        
        Lista a = new Lista();
        a.inserirInicio(10);
        a.imprimir();
        // 10
        if(!a.isEmpty()) {
            System.out.println("Removido = " + a.removerInicio());
        }
        a.imprimir();
        */
        

                                      
    } 
}
