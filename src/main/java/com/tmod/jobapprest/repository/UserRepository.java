package com.tmod.jobapprest.repository;

import com.tmod.jobapprest.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gulteking on 18.04.2018 with love.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
