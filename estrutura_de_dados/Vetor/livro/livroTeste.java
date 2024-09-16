public class livroTeste {
    public static void main(String[] args) {
        Livro l = new Livro("Xadrez para leigos", "James Eade", 2009,400, 10, false );
        
    
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
    l.emprestar();
  
   
    
    
    System.out.println(l.toString());
    }   
}
