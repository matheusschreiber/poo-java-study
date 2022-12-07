import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String args[]) {
    System.out.println("File name: ");
    Scanner s = new Scanner(System.in);
    String filename = s.nextLine();
    s.close();
    System.out.println("File chosen: " + filename + "\n\n\n");



    System.out.println("Contents: ");
    try (
      InputStream is = new FileInputStream(filename);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);     
    ){
      String linha="";
      while((linha = br.readLine())!= null){
        String selecao;
        int copas;

        if (linha.contains("MELHOR")){
          selecao = Selecoes.BRASIL.name();
          copas = Selecoes.BRASIL.getValue();
        } else if (linha.contains("PIOR")) {
          selecao = Selecoes.ITALIA.name();
          copas = Selecoes.ITALIA.getValue();
        } else {
          selecao = Selecoes.FRANCA.name();
          copas = Selecoes.FRANCA.getValue();
        }
        System.out.printf("%s %s: %d\n", linha, selecao,copas);
      }

      System.out.println("\n\n\n Leitura finalizada");
    } catch (FileNotFoundException ex) {
      System.out.println("Problema ao ler o arquivo (não existe)");
    } catch (Exception ex) {
      System.out.println("Problema não identificado " + ex);
    }

    Juiz j = new Juiz("Sergio Espndola", "Juiz", 45);
    j.comer();
    j.trabalhar();  
    
    try {
      if (j.getAnos() >30){
        throw new MuitoVelhoException("aposentado ve jogo do sofa");
      } 
    } catch (MuitoVelhoException ex) {
      System.out.println("TEVE UM ERRO: " + ex);
    }


    System.out.println("SLAARIO DELE: " + j.getSalario());
    
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    System.out.println(nf.format(j.getSalario()));
  }
}
