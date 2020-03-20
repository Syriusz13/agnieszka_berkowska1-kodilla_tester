package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersList()      //wywołujemy metodę, która zwraca nam ArrayList obiektów typu User
                .stream()                   //uruchamiamy strumień
                .filter(u -> u.getGroup().equals("Chemists"))
                //.map(u -> u.getUsername())  //operacja transformująca. Metoda map klasy Stream, wyrażenie lambda
                .map(UsersManager::getUserName)// zamiat tego co powyżej, jeżeli mamy w kodzie metodę to możemy wpis zastąpić referencją metody
                //.forEach(un -> System.out.println(un)); //wyrażenie terminalne (kolektor).
                .collect(Collectors.toList());
        System.out.println(usernames);
    }
    public static String getUserName (User user) {
        return user.getUsername();
    }
}
