package com.metlife.arogyasutra.repository;

import com.metlife.arogyasutra.entity.CustomerPO;
import com.metlife.arogyasutra.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArogyaSutraRepository  extends JpaRepository<CustomerPO, Integer> {

    List<Customer> findByName(String gender);
}
