package pl.project.invoicing.db;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import pl.project.invoicing.configuration.Configuration;
import pl.project.invoicing.service.FileService;

public class FileDatabase implements Database {

  private FileService fileService;
  private String invoice;
  public FileDatabase(){
    this.fileService = new FileService();
  }
  @Override
  public Long save() throws IOException {
    fileService.writeDataToFile(Configuration.DB_FILE_NAME, invoice);
    return null;
  }

  @Override
  public Optional getById() {return Optional.empty();}

  @Override
  public List getAll() {
    return null;
  }

  @Override
  public Optional update() {
    return Optional.empty();
  }

  @Override
  public Optional delete() {
    return Optional.empty();
  }

  @Override
  public Optional reset() {
    return Optional.empty();
  }
}
