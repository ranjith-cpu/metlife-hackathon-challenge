package com.metlife.arogyasutra.repository;

import com.metlife.arogyasutra.entity.HealthRecord;
import com.metlife.arogyasutra.entity.UserDetailPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArogyaSutraHealthRecordRepository extends JpaRepository<HealthRecord, Integer> {

}
