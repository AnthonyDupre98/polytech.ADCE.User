package polytech.ADCE.user.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class UserRegister {

        @Id
        private String username;
        private String password;
        private String matchingpassword;

        public UserRegister() {}

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

        public String getMatchingpassword() {
            return matchingpassword;
        }

        public void setMatchingpassword(String matchingpassword) {
            this.matchingpassword = matchingpassword;
        }

        public String toString() {
            return "Pseudo : " + this.username + " Password : " + this.password + " Matching Password : " + this.matchingpassword;
        }

}
