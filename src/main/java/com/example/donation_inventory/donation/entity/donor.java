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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonor_name() {
        return donor_name;
    }

    public void setDonor_name(String donor_name) {
        this.donor_name = donor_name;
    }

    public String getDonation_type() {
        return donation_type;
    }

    public void setDonation_type(String donation_type) {
        this.donation_type = donation_type;
    }

    public long getDonation_amount() {
        return donation_amount;
    }

    public void setDonation_amount(long donation_amount) {
        this.donation_amount = donation_amount;
    }

    public String getDonation_date() {
        return donation_date;
    }

    public void setDonation_date(String donation_date) {
        this.donation_date = donation_date;
    }
}
