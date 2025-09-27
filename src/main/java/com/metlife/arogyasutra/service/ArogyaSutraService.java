package com.metlife.arogyasutra.service;

import com.metlife.arogyasutra.entity.CustomerPO;
import com.metlife.arogyasutra.entity.UserDetailPO;
import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.UserDetails;
import com.metlife.arogyasutra.repository.ArogyaSutraRepository;
import com.metlife.arogyasutra.repository.ArogyaSutraUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ArogyaSutraService {

    @Autowired
    private ArogyaSutraRepository arogyaSutraRepository;

    @Autowired
    private ArogyaSutraUserRepository arogyaSutraUserRepository;

    public String customerDetailPersist(Customer customer) {

        CustomerPO customerPO = prepareCustomerRequest(customer);


        CustomerPO customerS = arogyaSutraRepository.save(customerPO);
        if (customerS.getId()>0) {
            return "Customer created successfully";
        } else {
            return  "Customer creation failed";
        }

    }

    public void userDetailSign(UserDetails userDetails) {

        UserDetailPO userDetailPO = prepareUserDetails(userDetails);

        arogyaSutraUserRepository.save(userDetailPO);

    }

    public String userDetailLogin(UserDetails userDetails) {


        String uniqueCd = arogyaSutraUserRepository.findUniqueIdByUserName(userDetails.getUsername());

        return  uniqueCd;

    }


    public UserDetailPO prepareUserDetails(UserDetails userDetails) {

        UserDetailPO userDetailPO = new UserDetailPO();
        userDetailPO.setUsername(userDetails.getUsername());
        userDetailPO.setPassword(userDetails.getPassword());
        userDetailPO.setUnique_id(generateUniqueRef());
        System.out.println("db request"+userDetailPO);
        return userDetailPO;

    }

    public static String generateUniqueRef() {
        return UUID.randomUUID().toString();
    }


    public CustomerPO prepareCustomerRequest(Customer customer) {
            CustomerPO customerPO = new CustomerPO();
            customerPO.setAge(customer.getAge());
            customerPO.setName(customer.getName());
            customerPO.setGender(customer.getGender());
            customerPO.setSmoking_status(customer.isSmoking_status());
            customerPO.setFamily_history_cvd(customer.isFamily_history_cvd());
            customerPO.setFamily_history_diabetes(customer.isFamily_history_diabetes());

            return  customerPO;
    }
}
