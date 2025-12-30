package com.rookiecontrol.dto;

public class DocumentDto {
  private String documentCode;
  private String title;
  private String fileType;

  public DocumentDto(String documentCode, String title, String fileType) {
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
