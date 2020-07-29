package com.springboot.Repo;

public interface FakeRepoInterface
{
    String insertUser(long id, String name, String surname);
    String findUserById(long id);
    String deleteUser(long id);
}
