package com.edasocial.users_srv.repositories;

import com.edasocial.users_srv.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Object> {
}
