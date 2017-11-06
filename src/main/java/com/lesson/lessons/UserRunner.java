package com.lesson.lessons;

import java.util.*;

public class UserRunner {
    public static void main(String[] args) {
        //List<User> users = new ArrayList<User>();
        //List<User> users = new LinkedList<User>();

        Set<User> users = new HashSet<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "two"));
        users.add(new User("1", "first"));

        for (User user : users){
            System.out.println(user);
        }

        Map<String, User> usersMap = new HashMap<String, User>();
        usersMap.put("1", new User("1", "q"));
        usersMap.put("2", new User("2", "w"));
        usersMap.put("1", new User("1", "q"));

        for (Map.Entry<String, User> user : usersMap.entrySet()){
            System.out.println(user);
        }
    }
}
