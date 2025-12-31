package com.rookiecontrol.controller;

import com.rookiecontrol.dto.DocumentDto;
import com.rookiecontrol.service.DocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DocumentController {

  private final DocumentService documentService;

  public DocumentController(DocumentService documentService) {
    this.documentService = documentService;
  }

  @GetMapping("/{code}")
  public ResponseEntity<DocumentDto> getByCode(@PathVariable String code) {
    return documentService.getDocumentByCode(code)
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }
}
