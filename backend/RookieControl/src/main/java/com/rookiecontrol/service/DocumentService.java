package com.rookiecontrol.service;

import com.rookiecontrol.exception.DocumentNotFoundException;
import com.rookiecontrol.model.Document;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentService {

  public Optional<Document> getDocumentByCode(String code) {
    if ("TP-30-16-091".equals(code)) {
      return Optional.of(
        new Document(
          "TP-30-16-091",
          "Perfecta product testing",
          "Test Protocol"
        )
      );
    } else if("TM41927600".equals(code)) {
      return Optional.of(
        new Document(
          "TM41927600",
          "Perfecta PTA catheters burst test",
          "Test Method"
        )
      );
    } else {
      throw new DocumentNotFoundException(code);
    }
  }
}
