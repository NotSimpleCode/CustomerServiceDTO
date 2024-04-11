package co.edu.uptc.swii.customerservicedto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.edu.uptc.swii.customerservicedto.dto.CustomerItemDTO;
import co.edu.uptc.swii.customerservicedto.entity.CustomerItem;
import co.edu.uptc.swii.customerservicedto.mapper.CustomerItemMapper;
import co.edu.uptc.swii.customerservicedto.repo.CustomerItemRepo;

@Service
public class CustomerCatalogueService {

    @Autowired
    CustomerItemRepo customerItemRepo;

    @Autowired
    RestTemplate restTemplate;

    public CustomerItemDTO addCustomerItem(CustomerItemDTO customerItemDTO) {
        CustomerItem customerItemSavedInDB = customerItemRepo
                .save(CustomerItemMapper.INSTANCE.mapCustomerItemDTOToCustomerItem(customerItemDTO));
        return CustomerItemMapper.INSTANCE.mapCustomerItemToCustomerItemDto(customerItemSavedInDB);
    }

    public CustomerItem fetchCustomerItem(Integer customerId) {
        return customerItemRepo.findByid(customerId);
    }

    public List<CustomerItem> fetchAllCustomers() {
        return customerItemRepo.findAll();
    }
}
