package com.example.donation_inventory.donation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface distribution_report extends JpaRepository<distributor, Long> {
    @Query("SELECT d.donor_name, SUM(d.distributed_amount) FROM distributions d GROUP BY d.donor_name")
    List<Object[]> get_total_distribution();
}
