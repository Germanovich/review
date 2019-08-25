package by.etc.module6.task1.entity.user;

import by.etc.module6.task1.entity.CatalogObserver;
import by.etc.module6.task1.entity.book.Book;
import by.etc.module6.task1.utils.Operation;

public class User implements CatalogObserver {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String userName;
    private char[] password;
    private String salt;
    private Email email;
    private Role role;

    public User(String userName, String password) {
        if (userName.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("User name or password cannot be empty!");
        }
        this.userName = userName;
        this.password = password.toCharArray();
        this.email = new Email("");
        this.role = Role.USER;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public void update(Operation operation, Book book, Email email) {
        Letter letter;
        switch (operation) {
            case ADDED: {
                letter = new Letter(email, this.email, "Library update.",
                        "Book added to library: " + book.toString(), book);
                email.getOutbox().add(letter);
                this.email.getInbox().add(letter);
                break;
            }
            case REMOVED: {
                letter = new Letter(email, this.email, "Library update.",
                        "Book was removed from catalog: " + book.toString(), book);
                email.getOutbox().add(letter);
                this.email.getInbox().add(letter);
                break;
            }
            default: {
                throw new EnumConstantNotPresentException(Operation.class, operation.name());
            }
        }

    }

    @Override
    public String toString() {
        return String.format("ID: %-5d userName: %-10s email: %-12s role: %s", id,
                userName, email, role.name().toLowerCase());
    }
}
