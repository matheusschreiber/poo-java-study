package simulado_q1;

import java.util.LinkedList;

public class UserBase {
  private LinkedList<User> users = new LinkedList<User>();
  private int numUsers=0;

  public void addUser(User u) {
    this.users.add(u);
    this.numUsers++;
  }

  public void removeUser(User u) {
    this.users.remove(u);
    this.numUsers--;
  }
  
  public float meanVerifiedUsers(){
    float verified = 0;
    
    for (User u : users){
      if (u instanceof VerifiedUser) verified++;
    }

    return (verified/numUsers);
  }

  public float meanTextSize() {
    int sizeAccumulated=0;
    int numTweets=0;

    for(User u : users) {
      sizeAccumulated+=u.sizeTweetsCombined();
      numTweets+=u.numTweets();
    }

    return sizeAccumulated/numTweets;
  }

}
