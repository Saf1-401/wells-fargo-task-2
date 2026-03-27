package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
        this.creationDate = LocalDate.now();
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}