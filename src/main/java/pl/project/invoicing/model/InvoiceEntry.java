package pl.project.invoicing.model;

import java.math.BigDecimal;

public class InvoiceEntry {
  private Long id;
  private String description;
  private BigDecimal netPrice;
  private BigDecimal vatValue = BigDecimal.ZERO;
  private Vat vatRate;
}
