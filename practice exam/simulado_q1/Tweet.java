package simulado_q1;

public class Tweet {
  private String text;

  public Tweet(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int tweetSize(){
    return text.length();
  }
}