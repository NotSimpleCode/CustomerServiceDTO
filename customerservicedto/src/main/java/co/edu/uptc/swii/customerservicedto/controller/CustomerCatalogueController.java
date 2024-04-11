package co.edu.uptc.swii.customerservicedto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.swii.customerservicedto.dto.CustomerItemDTO;
import co.edu.uptc.swii.customerservicedto.entity.CustomerItem;
import co.edu.uptc.swii.customerservicedto.service.CustomerCatalogueService;

@RestController
@RequestMapping("/customerCatalogue")
@CrossOrigin
public class CustomerCatalogueController {

    @Autowired
    CustomerCatalogueService customerCatalogueService;

    @PostMapping("/addCustomer")
    public ResponseEntity<CustomerItemDTO> addCustomer(@RequestBody CustomerItemDTO customerItemDTO) {
        CustomerItemDTO customerItemSaved = customerCatalogueService.addCustomerItem(customerItemDTO);
        return new ResponseEntity<>(customerItemSaved, HttpStatus.CREATED);
    }

    @GetMapping("/fetchCustomerById/{customerId}")
    public ResponseEntity<CustomerItem> fetchCustomerById(@PathVariable Integer customerId) {
        CustomerItem customerItem = customerCatalogueService.fetchCustomerItem(customerId);
        return new ResponseEntity<>(customerItem, HttpStatus.OK);
    }

    @GetMapping("/fetchAllCustomers")
    public ResponseEntity<List<CustomerItem>> fetchAllCustomers() {
        List<CustomerItem> customerItems = customerCatalogueService.fetchAllCustomers();
        return new ResponseEntity<>(customerItems, HttpStatus.OK);
    }
}
