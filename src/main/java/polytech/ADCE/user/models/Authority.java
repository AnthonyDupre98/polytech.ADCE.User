package polytech.ADCE.user.models;

import javax.persistence.*;

@Entity
public class Authority {

    @Id
    @GeneratedValue
    private int authority_id;
    private String username;
    private String authority;

    public Authority() {}

    public int getAuthorityId() {
        return authority_id;
    }

    public void setAuthorityId(int authority_id) {
        this.authority_id = authority_id;
    }

    public String getPseudoUser() {
        return username;
    }

    public void setPseudoUser(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuhtority(String authority) {
        this.authority = authority;
    }

    public String toString() {
        return "Id : " + this.authority_id + "Pseudo : " + this.username + " Authority : " + this.authority;
    }
}
