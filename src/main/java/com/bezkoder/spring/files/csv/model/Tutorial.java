package com.bezkoder.spring.files.csv.model;

import javax.persistence.*;

@Entity
@Table(name = "BILL_PAYEE")
public class Tutorial {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Long id;

  @Column(name = "CUSTOMER_ID")
  private String customerId;
  @Column(name = "PAYEE_NUMBER")
  private String payeeNumber;
  @Column(name = "PAYEE_TYPE")
  private String payeeType;
  @Column(name = "PAYEE_NAME")
  private String payeeName;
  @Column(name = "PAYEE_ADDRESS")
  private String payeeAddress;
  @Column(name = "BILL_PROVIDER")
  private String billProvider;
  @Column(name = "PAYEE_NICKNAME")
  private String payeeNickname;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getPayeeNumber() {
    return payeeNumber;
  }

  public void setPayeeNumber(String payeeNumber) {
    this.payeeNumber = payeeNumber;
  }

  public String getPayeeType() {
    return payeeType;
  }

  public void setPayeeType(String payeeType) {
    this.payeeType = payeeType;
  }

  public String getPayeeName() {
    return payeeName;
  }

  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }

  public String getPayeeAddress() {
    return payeeAddress;
  }

  public void setPayeeAddress(String payeeAddress) {
    this.payeeAddress = payeeAddress;
  }

  public String getBillProvider() {
    return billProvider;
  }

  public void setBillProvider(String billProvider) {
    this.billProvider = billProvider;
  }

  public String getPayeeNickname() {
    return payeeNickname;
  }

  public void setPayeeNickname(String payeeNickname) {
    this.payeeNickname = payeeNickname;
  }

  public Tutorial(String customerId, String payeeNumber, String payeeType, String payeeName, String payeeAddress, String billProvider, String payeeNickname) {
    this.customerId = customerId;
    this.payeeNumber = payeeNumber;
    this.payeeType = payeeType;
    this.payeeName = payeeName;
    this.payeeAddress = payeeAddress;
    this.billProvider = billProvider;
    this.payeeNickname = payeeNickname;
  }

  public Tutorial() {
  }
}

