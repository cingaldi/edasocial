package com.edasocial.users_srv.users.domain.repositories;

import com.edasocial.users_srv.users.domain.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
