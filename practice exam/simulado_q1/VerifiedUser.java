package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User{
  private Date verificationDate;

  public VerifiedUser(String twitterId, Date verificationDate) {
    super(twitterId);
    this.verificationDate = verificationDate;
  }

  public Date getVerificationDate() {
    return verificationDate;
  }

  public void setVerificationDate(Date verificationDate) {
    this.verificationDate = verificationDate;
  }

}
