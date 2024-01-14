    package com.example.donation_inventory.donation;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;

    @Controller
    public class donation_controller {
        @GetMapping(path = "/donation_inventory")
        public String get_donation_inventory_form(){
            return "donation_inventory";
        }
        @PostMapping(path = "/donation_inventory_form")
        public String submit_donation_inventory_form(donation_inventory_form donation_inventory_form){
            return "donation_inventory_form_summary";
        }


    }
