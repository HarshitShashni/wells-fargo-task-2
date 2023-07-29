package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(name="ClientID")
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    @MapsId
    @JoinColumn(name="ClientID")
    private Client client;

    @PrimaryKeyJoinColumn
    private Security security;

    protected Portfolio() {

    }
    public Long getPortfolioID(){
        return portfolioId;
    }

    public Long getClientID() {
        return clientId;
    }


    public Portfolio(String creationDate) {
        this.creationDate = creationDate;
        
    }

    public String getcreationDate() {
        return creationDate;
    }

    public void setcreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}