package polytech.ADCE.user.models;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class User {

    @Id
    private String username;
    private String password;

    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Pseudo : " + this.username + " Password : " + this.password;
    }
}
