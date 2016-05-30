package com.stringring.domain.list;

import com.stringring.domain.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alexander on 29/05/16.
 */
@Repository
public interface ListRepository extends CrudRepository<List, Long>{
  List findById(Long listId);

}
