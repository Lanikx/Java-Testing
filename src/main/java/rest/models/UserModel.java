package rest.models;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserModel {

       int id;
    String email;

    String first_name;
    String last_name;
    String avatar;


    public UserModel(int id, String email, String firstName, String lastName, String avatar){
        this.id = id;
        this.email = email;
        this.first_name = firstName;
        this.last_name = lastName;
        this.avatar = avatar;
    }

    public UserModel(){}

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object object){
        var model = (UserModel)object;
        if (this.avatar.equals(model.avatar)  && this.email.equals(model.email) && this.last_name.equals(model.last_name) && this.first_name.equals(model.first_name) && this.id == model.id )
        return true;
    return false;
}

    public static UserModel readUser() {
        try (InputStream input = new FileInputStream("./src/main/resources/apistrings.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return new UserModel(Integer.parseInt(prop.getProperty("user.valid.id")), prop.getProperty("user.valid.email") ,prop.getProperty("user.valid.firstname") , prop.getProperty("user.valid.lastname"), prop.getProperty("user.valid.avatar") );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
