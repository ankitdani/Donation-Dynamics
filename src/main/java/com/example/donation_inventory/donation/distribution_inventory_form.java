package com.example.donation_inventory.donation;

public class distribution_inventory_form {
    private String donor_name;
    private String distribution_type;
    private long distributed_amount;
    private String distribution_date;

    public distribution_inventory_form() {
    }

    public distribution_inventory_form(String donor_name, String distribution_type, long distributed_amount, String distribution_date) {
        this.donor_name = donor_name;
        this.distribution_type = distribution_type;
        this.distributed_amount = distributed_amount;
        this.distribution_date = distribution_date;
    }

    public String getDonor_name() {
        return donor_name;
    }

    public void setDonor_name(String donor_name) {
        this.donor_name = donor_name;
    }

    public String getDistribution_type() {
        return distribution_type;
    }

    public void setDistribution_type(String distribution_type) {
        this.distribution_type = distribution_type;
    }

    public long getDistributed_amount() {
        return distributed_amount;
    }

    public void setDistributed_amount(long distributed_amount) {
        this.distributed_amount = distributed_amount;
    }

    public String getDistribution_date() {
        return distribution_date;
    }

    public void setDistribution_date(String distribution_date) {
        this.distribution_date = distribution_date;
    }
}
