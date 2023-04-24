package pl.project.invoicing.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {

  private ObjectMapper objectMapper;

  public FileService(){
    this.objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
  }
  public void writeDataToFile(String filename, Object object) throws IOException {
      objectMapper.writeValue(new File(filename),object);
  }
  public Object getDataFromFile(String filename) throws IOException {
    return objectMapper.readValue(new File(filename), Object.class);
  }
}
