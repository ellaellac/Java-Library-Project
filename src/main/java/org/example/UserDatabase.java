package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDatabase {
    private List<User> users = new ArrayList<>();

    private ObjectMapper mapper = new ObjectMapper();

    private File jsonFile = new File("C:/Users/cwyel/nology2/java-library/users_data.json");



    public List<User> getUsers() {
        return users;
    }

    public void addUser (User user) throws IOException {
        users.add(user);
        mapper.writeValue(jsonFile, users);
    }

    public User getUserById(int id){
        for (User user : users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

}
