public class Technician {
    private String login;
    private String password;
    private Role role;
    private String firstName;
    private String secondName;
    private String lastName;

    public Technician(String login, String password, Role role, String firstName, String secondName, String lastName) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
