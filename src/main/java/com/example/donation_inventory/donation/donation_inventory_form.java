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
