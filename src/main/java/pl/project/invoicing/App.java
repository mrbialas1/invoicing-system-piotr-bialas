/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package pl.project.invoicing;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import pl.project.invoicing.model.Invoice;
import pl.project.invoicing.utils.TextUtils;

public class App {

  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {

    System.out.println(new App().getGreeting());

    List<Invoice> invoices = new ArrayList<>();

    Invoice invoice1 = new Invoice(1L, LocalDateTime.now(), "c1", "c2");

    String upperCaseText = TextUtils.capitalizeText("test");
  }
}
