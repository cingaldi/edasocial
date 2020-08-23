package com.edasocial.users_srv.auth.domain.repositories;

import com.edasocial.users_srv.auth.domain.entities.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<Registration , String> {
}
