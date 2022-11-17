 package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CandidateRepo extends JpaRepository<Candidate, Long>{
 
	 Candidate findByName( String name); 
	 List<Candidate> findAllByGender( char gender);
	 Candidate findByMobile( long mobile);
	 List<Candidate> findByExperience(double experience);
	 List<Candidate> findByQualification( String qualification);
	 List<Candidate> findByBranch(String branch);
	 List<Candidate> findByPercentage(double percentage);
	 List<Candidate> findByPrimarySkill(String primarySkill);
	 
	 List<Candidate> findByExperienceGreaterThan(double experience);
	 List<Candidate> findByPercentageGreaterThan(double percentage);
	 
//	 @Query ("from candidate where tech?1 order by experience desc")
//	 List<Candidate> findByPrimarySkillSorted(String primarySkill );
}
