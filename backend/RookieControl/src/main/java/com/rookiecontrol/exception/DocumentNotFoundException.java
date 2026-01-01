package com.rookiecontrol.exception;

public class DocumentNotFoundException extends RuntimeException{
  public DocumentNotFoundException(String code) {
    super("Document not found for code: \"" + code + "\"");
  }
}
