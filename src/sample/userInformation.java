package sample;

import java.util.ArrayList;

public class userInformation {

    public userInformation() {
    }

    ArrayList<User> CustomerList = new ArrayList<User>();

    ArrayList<User> VetList = new ArrayList<User>();
    public void addCustomer(String username, String password){

        User custoemr = new User(username,password);

        CustomerList.add(custoemr);

    }



    public void addVet(String username, String password){

        User vet = new User(username,password);

        VetList.add(vet);

    }
}
