package com.stringring.domain.user;

import com.stringring.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alexander on 28/05/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

  User findById(Long id);
  User findByEmail(String email);
  

}
