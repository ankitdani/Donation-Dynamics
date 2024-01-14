    package com.example.donation_inventory.donation.controller;

    import com.example.donation_inventory.donation.donation_inventory_form;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import com.example.donation_inventory.donation.Repository.donor_repository;

    @Controller
    public class donation_controller {
        @Autowired
        private donor_repository donor_repository;
        @GetMapping(path = "/donation_inventory")
        public String get_donation_inventory_form(){
            return "donation_inventory";
        }
        @PostMapping(path = "/donation_inventory_form")
        public String submit_donation_inventory_form(donation_inventory_form donation_inventory_form){
            return "donation_inventory_form_summary";
        }


    }
