package com.springboot.Repo;

import com.springboot.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface
{
    /*private static Map<Integer, User> user;
    User users;*/
    List<User> list = new ArrayList<User>();
   /* static
    {
        user = new HashMap<Integer, User>()
        {
            {
                put(1, new User(1,"Zoba","Roidz"));
                put(2, new User(2,"boo","zo"));
                put(3, new User(3,"dodo","duka"));
            }
        };
    }*/

    public String insertUser(long id, String name, String surname)
    {
        User newUser = new User(id,name,surname);
        list.add(newUser);
        //user.put(Math.toIntExact(users.getId()),(User)user);
        return name;
    }
    public String findUserById(long id)
    {
        //this.user.get(id);
        for (User person: list)
        {
            if (person.getId() == id)
            {
                return person.getName();
            }
        }
        return null;
    }
    public String deleteUser(long id)
    {
        //this.user.remove(id);
        for (User person: list)
        {
            if (person.getId() == id)
            {
                String deletedName = person.getName();
                list.remove(person);
                return deletedName;
            }
        }
        return null;
    }
}
