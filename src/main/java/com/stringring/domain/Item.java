package com.stringring.domain;

import javax.persistence.*;

/**
 * Created by alexander on 28/05/16.
 */
@Entity
public class Item {
  @Id
  private long id;
  private String content;
  private String type;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "list_id")
  private List list;

  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Item(String content, String type) {
    this.content = content;
    this.type = type;
  }

  public Item(){
  }
}
