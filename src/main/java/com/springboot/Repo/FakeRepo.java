package com.springboot.Repo;

import com.springboot.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo
{
    private static Map<Integer, User> user;
    User users;
    static
    {
        user = new HashMap<Integer, User>()
        {
            {
                put(1, new User(1,"Zoba","Roidz"));
                put(2, new User(2,"boo","zo"));
                put(3, new User(3,"dodo","duka"));
            }
        };
    }

    public void insertUser(long id, String name, String surname)
    {
        user.put(Math.toIntExact(users.getId()),(User)user);
    }
    public void findUserById(long id)
    {
        this.user.get(id);
    }
    public void deleteUser(long id)
    {
        this.user.remove(id);
    }
}
