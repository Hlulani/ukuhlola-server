package infrastructure.restapi.registration;

public class RegistrationDetails {
    private String email;
    private String password;

    public RegistrationDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
