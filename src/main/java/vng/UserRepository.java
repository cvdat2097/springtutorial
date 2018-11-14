package vng;

import org.springframework.data.repository.CrudRepository;

import vng.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}