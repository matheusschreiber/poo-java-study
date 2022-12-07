public enum Selecoes {
	BRASIL(5), ALEMANHA(4), ITALIA(4), ARGENTINA(2), FRANCA(2);

	private final int copas;

	Selecoes(int quantidade){
		this.copas = quantidade;
	}
	
	public int value(){
		return this.copas;
	}
}
