package com.rookiecontrol.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DocumentControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void returnsTPWhenFound() throws Exception {
    mockMvc.perform(get("/documents/TP-30-16-091"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.documentCode").value("TP-30-16-091"))
      .andExpect(jsonPath("$.title").value("Perfecta product testing"))
      .andExpect(jsonPath("$.fileType").value("Test Protocol"));
  }

  @Test
  void returnsTMWhenFound() throws Exception {
    mockMvc.perform(get("/documents/TM41927600"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.documentCode").value("TM41927600"))
      .andExpect(jsonPath("$.title").value("Perfecta PTA catheters burst test"))
      .andExpect(jsonPath("$.fileType").value("Test Method"));
  }

  @Test
  void returns404WhenNotFound() throws Exception {
    mockMvc.perform(get("/documents/IJustLoveJavaAndCamelCase"))
      .andExpect(status().isNotFound());
  }
}
