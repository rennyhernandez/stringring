package com.stringring.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by alexander on 28/05/16.
 */
@Entity
public class Item {
  @Id
  private long id;
  private String content;
  private String type;

  public Item(String content, String type) {
    this.content = content;
    this.type = type;
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
}
