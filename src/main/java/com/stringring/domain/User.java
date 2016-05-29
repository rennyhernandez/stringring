package com.stringring.domain;



import javax.persistence.*;
import java.util.Set;

/**
 * Created by alexander on 28/05/16.
 */

@Entity
public class User {
  @Id
  private long id;

  private String name;

  @Column(unique = true)
  private String email;

  private String password;

  @OneToMany
  private Set<List> lists;

  public User(){}
  public User(String name, String email){
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List createList(String name, String description){
    List list = new List(name, description);
    this.lists.add(list);
    return list;
  }
  public Set<List> getLists(){
    return this.lists;
  }
}
