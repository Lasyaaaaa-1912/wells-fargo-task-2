package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    protected Portfolio() {}

    public Portfolio(String creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public long getPortfolioId() { return portfolioId; }
    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}