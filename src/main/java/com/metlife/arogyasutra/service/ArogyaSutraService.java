package com.metlife.arogyasutra.service;

import com.metlife.arogyasutra.entity.CustomerPO;
import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.repository.ArogyaSutraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArogyaSutraService {

    @Autowired
    private ArogyaSutraRepository arogyaSutraRepository;

    public String customerDetailPersist(Customer customer) {

        CustomerPO customerPO = prepareCustomerRequest(customer);


        CustomerPO customerS = arogyaSutraRepository.save(customerPO);
        if (customerS.getId()>0) {
            return "Customer created successfully";
        } else {
            return  "Customer creation failed";
        }

    }

    public CustomerPO prepareCustomerRequest(Customer customer) {
            CustomerPO customerPO = new CustomerPO();
            customerPO.setAge(customer.getAge());
            customerPO.setName(customer.getName());
            customerPO.setGender(customer.getGender());
            customerPO.setSmoking_status(customer.isSmoking_status());
            customerPO.setFamily_history_cvd(customer.isFamily_history_vcd());
            customerPO.setFamily_history_diabetes(customer.isFamily_history_diabetes());

            return  customerPO;
    }
}
