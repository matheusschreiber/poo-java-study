public enum Selecoes {
  BRASIL(5), ALEMANHA(4), ITALIA(4), HOLANDA(1), FRANCA(2);

  private final int copas;

  Selecoes(int quantidade) {
    this.copas = quantidade;
  }

  public int getValue(){
    return this.copas;
  }
}
