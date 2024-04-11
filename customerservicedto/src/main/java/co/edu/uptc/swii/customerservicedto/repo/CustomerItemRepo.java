package co.edu.uptc.swii.customerservicedto.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uptc.swii.customerservicedto.entity.CustomerItem;

public interface CustomerItemRepo extends JpaRepository<CustomerItem, Integer> {
    CustomerItem findByid(Integer id);

    @SuppressWarnings("null")
    List<CustomerItem> findAll();
}
