package com.rookiecontrol.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documents")
public class Document {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String documentCode;

  private String title;
  private String fileType;

  public Document() {} //apparently JPA requires a no-param constructor

  public Document(String documentCode, String title, String fileType) {
    this.documentCode = documentCode;
    this.title = title;
    this.fileType = fileType;
  }

  public String getDocumentCode() {
    return documentCode;
  }

  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

}
