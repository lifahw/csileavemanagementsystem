package com.csi.leavemanagement.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csi.leavemanagement.models.JobDetails;
import com.csi.leavemanagement.models.JobDetailsId;


@Repository
public interface JobDetailsRepository extends CrudRepository<JobDetails, JobDetailsId> {

	List<JobDetails> findByIdEmplid(String emplid);

}
