package by.etc.module6.task1.entity.user;

public class UserBuilder {

    private User user;

    public UserBuilder(String username, String password) {
        user = new User(username, password);
    }

    public UserBuilder setRole(Role role){
        user.setRole(role);
        return this;
    }

    public UserBuilder setEmail(Email email){
        user.setEmail(email);
        return this;
    }

    public UserBuilder setSalt(String salt){
        user.setSalt(salt);
        return this;
    }

    public User build(){
        return user;
    }
}
