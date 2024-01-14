package com.example.donation_inventory.donation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class donor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String donor_name;
    private String donation_type;
    private long donation_amount;
    private String donation_date;

    public donor() {
    }

    public donor(String donor_name, String donation_type, long donation_amount, String donation_date) {
        this.donor_name = donor_name;
        this.donation_type = donation_type;
        this.donation_amount = donation_amount;
        this.donation_date = donation_date;
    }
}
