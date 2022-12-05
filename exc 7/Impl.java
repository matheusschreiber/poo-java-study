public class Impl implements Inter {
  private int A=0;
	private String B="";

  @Override
  public int getA(){
    return this.A;
  }

	@Override
  public String getB(){
    return this.B;
  }

	@Override
  public void setA(int A){
    this.A = A;
  }

	@Override
  public void setB(String B){
    this.B = B;
  }

  @Override
	public String toString(){
		return A + " " +B;
	}
}
