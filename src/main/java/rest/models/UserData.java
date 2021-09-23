package rest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserData {
     UserModel data;
     @JsonIgnore
     String support;

     public UserData(UserModel model){
 data = model;
     }

     public UserData(){

     }

     public UserModel getData() {
          return data;
     }

     public void setData(UserModel data) {
          this.data = data;
     }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}
