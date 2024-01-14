package com.example.donation_inventory.donation;

public class donation_inventory_form {
    private String donor_name;
    private String donation_type;
    private long donation_amount;
    private String donation_date;

    public donation_inventory_form() {
    }

    public donation_inventory_form(String donor_name, String donation_type, long donation_amount, String donation_date) {
        this.donor_name = donor_name;
        this.donation_type = donation_type;
        this.donation_amount = donation_amount;
        this.donation_date = donation_date;
    }
}
