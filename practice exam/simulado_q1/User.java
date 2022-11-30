package simulado_q1;

import java.util.LinkedList;

public class User {
  private String twitterId;
  private LinkedList<Tweet> tweets = new LinkedList<Tweet>();
  private int sizeTweetsCombined=0;

  public User(String twitterId) {
    this.twitterId = twitterId;
  }

  public String getTwitterId() {
    return twitterId;
  }

  public void setTwitterId(String twitterId) {
    this.twitterId = twitterId;
  }

  public void adicionaTweet(Tweet t)   {
    this.tweets.add(t);
    this.sizeTweetsCombined+=t.tweetSize();
  }

  public void deletaTweet(Tweet t) {
    this.tweets.remove(t);
    this.sizeTweetsCombined-=t.tweetSize();
  }

  public int sizeTweetsCombined(){
    return sizeTweetsCombined;
  }

  public int numTweets(){
    return tweets.size();
  }

  
  
}
