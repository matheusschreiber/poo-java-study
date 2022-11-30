package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
  private int vitalidade;
  private int maxDano;
  private int minDano;
  private int vitalidadeAtual;

  public Pokemon(int v, int max, int min) {
    this.vitalidade = v;
    this.vitalidadeAtual = v;
    this.maxDano = max;
    this.minDano = min;
  }

  public boolean atacar(Pokemon personagemAtacado){
    Random r = new Random();
    if (r.nextBoolean()) personagemAtacado.vitalidadeAtual-=this.maxDano;
    else personagemAtacado.vitalidadeAtual-=this.minDano;

    if (personagemAtacado.getPontosVitalidade()<=0) return true;
    else return false;
  }

	public void regenera(){
    this.vitalidadeAtual = this.vitalidade;
  }

	public int getPontosVitalidade(){
    return this.vitalidadeAtual;
  }
  
}
