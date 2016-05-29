package com.stringring.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by alexander on 28/05/16.
 */
@Entity
public class List {
  @Id
  private long id;
  private String name;
  private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublic() {
    return isPublic;
  }

  public void setPublic(boolean aPublic) {
    isPublic = aPublic;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Set<Item> getItems() {
    return items;
  }

  public void setItems(Set<Item> items) {
    this.items = items;
  }

  public void addItem(Item item){
    this.items.add(item);
  }

  @Column(name= "is_public")
  private boolean isPublic;

  @Column(name = "created_at")
  private Date createdAt;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Item.class)
  private Set<Item> items;

  public List(){

  }

  public List(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void addItem(String content, String type){
    addItem(new Item(content,type));
  }
}
