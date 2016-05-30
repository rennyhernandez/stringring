package com.stringring.domain.item;

import com.stringring.domain.Item;
import com.stringring.domain.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by alexander on 29/05/16.
 */
@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
  Item findById(Long itemId);
  Set<Item> findItemsByListId(List listId);
}
