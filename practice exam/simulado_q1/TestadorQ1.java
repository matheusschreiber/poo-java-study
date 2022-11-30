package simulado_q1;

import java.text.NumberFormat;
import java.util.Date;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem média de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		UserBase base = new UserBase();
		
		User u1 = new User("1");
		User u2 = new User("2");
		
		Date d = new Date();
		VerifiedUser u3 = new VerifiedUser("3", d);
		
		base.addUser(u1);
		base.addUser(u2);
		base.addUser(u3);

		Tweet t1 = new Tweet("legal esse tweet");
		u1.adicionaTweet(t1);

		Tweet t2 = new Tweet("legal esse tweet mesmo");
		u2.adicionaTweet(t2);

		u3.adicionaTweet(t1);
		u3.adicionaTweet(t2);


		NumberFormat nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(base.meanVerifiedUsers()));
		System.out.println(nf.format(base.meanTextSize()));
	}
}
