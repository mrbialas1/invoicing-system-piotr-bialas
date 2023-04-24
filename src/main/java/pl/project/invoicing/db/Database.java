package pl.project.invoicing.db;

import java.util.List;
import java.util.Optional;

public interface Database {

  Long save();

  Optional getById();

  List getAll();

  Optional update();

  Optional delete();

  Optional reset();
}
