package pl.project.invoicing.db;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface Database {

  Long save()throws IOException;

  Optional getById();

  List getAll();

  Optional update();

  Optional delete();

  Optional reset();
}
