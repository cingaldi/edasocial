package com.edasocial.users_srv.domain.repositories;

import com.edasocial.users_srv.domain.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
