package com.metlife.arogyasutra.repository;

import com.metlife.arogyasutra.entity.CustomerPO;
import com.metlife.arogyasutra.entity.UserDetailPO;
import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.UserDetails;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArogyaSutraUserRepository extends JpaRepository<UserDetailPO, Integer> {

    @Query("SELECT u.unique_id FROM UserDetailPO u WHERE u.username = :username")
   String findUniqueIdByUserName(@Param("username") String username);
}
