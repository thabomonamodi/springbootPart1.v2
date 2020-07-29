package com.springboot.Service;

import com.springboot.Repo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService
{
    @Autowired
    private FakeRepo repo;

    @Autowired
    public void addUser(long id, String name, String surname)
    {
        String msg = repo.insertUser(id,name,surname);
        System.out.println("user added"+ name);
    }

    @Override
    public void removeUser(long id)
    {
        String msg = repo.deleteUser(id);
        System.out.println(msg+"removed");
    }

    @Override
    public void getUser(long id)
    {
        String msg = repo.findUserById(id);
        System.out.println("hello "+ msg);
    }
}
