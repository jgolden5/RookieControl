package com.rookiecontrol.service;

import com.rookiecontrol.dto.DocumentDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentService {

  public Optional<DocumentDto> getDocumentByCode(String code) {
    if ("TP-30-16-091".equals(code)) {
      return Optional.of(
        new DocumentDto(
          "TP-30-16-091",
          "Perfecta product testing",
          "Test Protocol"
        )
      );
    } else if("TM41927600".equals(code)) {
      return Optional.of(
        new DocumentDto(
          "TM41927600",
          "Perfecta PTA catheters burst test",
          "Test Method"
        )
      );
    }
    return Optional.empty();
  }
}
