    package com.example.donation_inventory.donation.controller;

    import com.example.donation_inventory.donation.distribution_inventory_form;
    import com.example.donation_inventory.donation.donation_inventory_form;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import com.example.donation_inventory.donation.Repository.donor_repository;
    import com.example.donation_inventory.donation.entity.donor;

    import java.util.List;

    @Controller
    public class donation_controller {
        @Autowired
        private donor_repository donor_repository;

        @GetMapping("/inventory_report")
        public String inventory_report(Model model){
            List<donor> donor_list = donor_repository.findAll();
            model.addAttribute("donor_list", donor_list);
            return "inventory_report";
        }

        @GetMapping(path = "/donation_inventory")
        public String get_donation_inventory_form(){
            return "donation_inventory";
        }
        @PostMapping(path = "/donation_inventory_form")
        public String submit_donation_inventory_form(donation_inventory_form donation_inventory_form){

            donor donor = null;

            if (donation_inventory_form != null){
                donor = new donor(donation_inventory_form.getDonor_name(),
                        donation_inventory_form.getDonation_type(),
                        donation_inventory_form.getDonation_amount(),
                        donation_inventory_form.getDonation_date());
            }
            donor_repository.save(donor);

            return "donation_inventory_form_summary";
        }

        @GetMapping(path = "/distribution_inventory")
        public String get_distribution_inventory_form(){
            return "distribution_inventory";
        }

        @PostMapping(path = "/distribution_inventory_form")
        public String submit_donation_inventory_form(distribution_inventory_form distribution_inventory_form){

            donor distributor = null;

            if (distribution_inventory_form != null){
                distributor = new donor(distribution_inventory_form.getDonor_name(),
                        distribution_inventory_form.getDistribution_type(),
                        distribution_inventory_form.getDistributed_amount(),
                        distribution_inventory_form.getDistribution_date());
            }
            donor_repository.save(distributor);

            return "distribution_inventory_form_summary";
        }



    }
