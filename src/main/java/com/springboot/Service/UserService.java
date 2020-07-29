package com.springboot.Service;

public interface UserService
{
    void addUser(long id, String name, String surname);
    void removeUser(long id);
    void getUser(long id);
}
