import java.util.LinkedList;

public class App {
  public static void main(String args[]){
    LinkedList<Produto> l = new LinkedList<Produto>();
    
    Livro l1 = new Livro("Pequeno Principe",250d,"Getulio Vargas");
    Livro l2 = new Livro("Harry Potter",300d,"Roberto Carlos");
    Livro l3 = new Livro("Quarteto Fantástico",250d,"Hugh Jackman");
    Tabuleiro t1 = new Tabuleiro("Ludo",10d,7);
    Tabuleiro t2 = new Tabuleiro("Xadrez",100d,10);

    l.add(l1);
    l.add(l2);
    l.add(l3);
    l.add(t1);
    l.add(t2);

    // System.out.println(l);    

    for (Produto p : l) {
      System.out.println(p);
    }
  }
}
