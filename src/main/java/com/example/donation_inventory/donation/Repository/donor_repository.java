package com.example.donation_inventory.donation.Repository;

import com.example.donation_inventory.donation.entity.donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface donor_repository extends JpaRepository<donor, Long> {
    @Query("SELECT d.donor_name, SUM(d.donation_amount) FROM donor d GROUP BY d.donor_name")
    List<Object[]> get_total_donations_by_donor();
}
