package entity;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private char nationalCode;
    private Date birthday;
    private char password;

    public User(int id, String username, char nationalCode, Date birthday) {
        this.id = id;
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthday = birthday;
        this.password = nationalCode;
    }

}
