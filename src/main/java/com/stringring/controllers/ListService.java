package com.stringring.controllers;

import com.stringring.domain.Item;
import com.stringring.domain.List;
import com.stringring.domain.item.ItemRepository;
import com.stringring.domain.list.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by alexander on 29/05/16.
 */
@RestController
@EnableAutoConfiguration
public class ListService {
  @Autowired
  ListRepository listRepository;

  @RequestMapping(name = "/list/{listId}", method = RequestMethod.GET)
  public List getList(@RequestParam Long listId) {
    return listRepository.findById(listId);
  }
  @RequestMapping(name = "/list/{listId}", method = RequestMethod.DELETE)
  public void deleteList(@RequestParam Long listId) {
    listRepository.delete(listId);

  }
  @RequestMapping(name = "list/{listId}/items")
  public List getItem(@RequestParam Long listId){
    List list = listRepository.findById(listId);
    return list;
  }
}
