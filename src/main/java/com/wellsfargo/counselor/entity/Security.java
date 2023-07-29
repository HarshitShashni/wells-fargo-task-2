package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(name="PortfolioId")
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;

    @MapsId
    @JoinColumn(name="portfolioId")
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String firstName, String lastName, String category, String purchasePrice, String purchaseDate, String quantity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getsecurityId() {
        return securityId;
    }

    public Long getPortfolioID() {
        return portfolioId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getcategory() {
        return category;
    }

    public void setcetegory(String category) {
        this.category = category;
    }

    public String getpurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}