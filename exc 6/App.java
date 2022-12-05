import java.io.*;

public class App {
	public static void main (String args[]){

		System.out.println("TESTE 1");
		try{
			FileInputStream fin = new FileInputStream("arquivo.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			DataInputStream din = new DataInputStream(bin);
			
			String linha;
			String buffer = new String();
			linha = din.readLine();
			while(linha!=null){
				buffer+=linha+"\n";
				linha = din.readLine();
			}
			System.out.println(buffer);
			din.close();
		} catch (Exception ex) {
			System.out.println("erro");
		}








		System.out.println("TESTE 2");
		try {
			InputStream is = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is, "ISO8859-1");
			BufferedReader br = new BufferedReader(isr);
			String linha = "";

			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}

			br.close();
		} catch (Exception ex) {
			System.out.println("erro");
		}








		System.out.println("TESTE 3");
		try (
			InputStream is = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is, "ISO8859-1");
			BufferedReader br = new BufferedReader(isr);
		) {
			String linha="";
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (Exception ex){
			System.out.println("ERRO " + ex);
		}







		System.out.println("TESTE 4");
		try (
			BufferedReader breader = new BufferedReader(new FileReader("arquivo.txt"));
		) {
			String linha="";
			while((linha=breader.readLine()) != null){
				System.out.println(linha);
			}
			
		} catch(IOException ex) {
			System.out.println("ERRO I/O " + ex);
		}









		try (
			FileOutputStream fos = new FileOutputStream("out1.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
		) {
			
			dos.writeBytes("Uma frase...\n");
			dos.writeDouble(123.4567);

		} catch (IOException exc) {
			System.out.println("Erro de IO");
			exc.printStackTrace();
		}		








		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out2.txt"));
			
			out.write("Uma frase...\n");
			out.write("" + 123.4567);
			out.close();

		} catch (IOException exc) {
			System.out.println("Erro de I/O");
			exc.printStackTrace();
		}







		try (
			OutputStream is = new FileOutputStream("out3.txt");
			OutputStreamWriter isr = new OutputStreamWriter(is, "ISO8859-1");
			BufferedWriter br = new BufferedWriter(isr);
		) {

			br.write("Uma frase...\n");
			br.write("" + 123.4567);

		} catch (Exception ex){
			System.out.println("ERRO " + ex);
		}
	}
}
