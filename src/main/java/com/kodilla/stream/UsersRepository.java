package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList () {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter W", 50, 7, "Chemists"));
        users.add(new User("Jessie P", 25, 4567, "Sales"));
        users.add(new User("Tuco S", 34, 116, "Manager"));
        users.add(new User("Gus F", 49, 0, "Board"));
        users.add(new User("Gale B", 44, 4, "Chemists"));
        users.add(new User("Mike E", 57, 0, "Security"));

        return users;
    }
}
