package ru.lesson.lessons.other_lessons;

import java.util.HashMap;
import java.util.Map;

public class UserRunner {
    public static void main(String[] args){
        /*
        List<User> users = new ArrayList<User>();
        users.add(new User("1","first"));
        users.add(new User("2","second"));
        users.add(new User("1","first"));

        for (User user : users){
            System.out.println(user);
        }
        */
        /*
        Set<User> users = new HashSet<User>();
        users.add(new User("1","first"));
        users.add(new User("2","second"));
        users.add(new User("1","first"));

        for (User user : users){
            System.out.println(user);
        }
        */

        Map<String,User> users = new HashMap<String, User>();
        users.put("1",new User("1","first"));
        users.put("2",new User("2","second"));
        users.put("1",new User("1","first"));

        for (Map.Entry<String,User> user: users.entrySet()){
            System.out.println(user);
        }


    }
}
