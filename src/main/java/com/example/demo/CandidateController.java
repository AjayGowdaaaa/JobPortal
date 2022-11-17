package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CandidateController {

	@Autowired
	CandidateRepo repo;

	@RequestMapping("/")
	public String home() {
		System.out.println("Home method Running");
		return "home";
	}
	
	@RequestMapping("/register")
	public String addCandidate(@RequestBody Candidate candidate) {
		System.out.println("addEmployee method Running");
		repo.save(candidate);
		return "register";
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteCandidate/{mobile}")
	//@DeleteMapping("/deleteCandidate/{mobile}") 
	@ResponseBody
	public String delete(@RequestParam long mobile) {
		Candidate candidate =  repo.findByMobile(mobile);
		System.out.println(candidate);
		repo.delete(candidate);
		System.out.println("Deleted Can");
		return "Deleted Candidate";
	}
	
	@PutMapping("update")
	@ResponseBody
	public Candidate  update(@RequestBody Candidate candidate ) {
		repo.save(candidate);
		return candidate;
		
	}

	@RequestMapping("/companyPortal")
	public String companyPortal(Candidate candidate) {

		return "companyPortal";
	}

	@RequestMapping("/candidates")
	@ResponseBody
	public List<Candidate> candidates() {
		List<Candidate> l = repo.findAll();
		return l;
	}

	@RequestMapping("/getCandidateByName")
	@ResponseBody
	public String getCandidateByName(@RequestParam String name) {
		return repo.findByName(name).toString();
	}

	@RequestMapping("/getCandidateByGender")
	@ResponseBody
	public List<Candidate> getCandidateByGender(@RequestParam char gender) {
		List<Candidate> l = repo.findAllByGender(gender);
		return l;
	}

	@RequestMapping("/getCandidateByMobile")
	@ResponseBody
	public String getCandidateByMobile(@RequestParam long mobile) {
		return repo.findByMobile(mobile).toString();
	}

	@RequestMapping("/getCandidateByExperience")
	@ResponseBody
	public List<Candidate> getCandidateByExperience(@RequestParam double experience) {
		List<Candidate> l = repo.findByExperience(experience);
		return l;
	}

	@RequestMapping("/getCandidateByQualification")
	@ResponseBody
	public List<Candidate> getCandidateByQualification(@RequestParam String qualification) {
		List<Candidate> l = repo.findByQualification(qualification);
		return l;
	}

	@RequestMapping("/getCandidateByBranch")
	@ResponseBody
	public List<Candidate> getCandidateByBranch(@RequestParam String branch) {
		List<Candidate> l = repo.findByBranch(branch);
		return l;
	}

	@RequestMapping("/getCandidateByPercentage")
	@ResponseBody
	public List<Candidate> getCandidateByPercentage(@RequestParam double percentage) {
		List<Candidate> l = repo.findByPercentage(percentage);
		return l;
	}

	@RequestMapping("/getCandidateByPrimarySkill")
	@ResponseBody
	public List<Candidate> getCandidateByPrimarySkill(@RequestParam String primarySkill) {
		List<Candidate> l = repo.findByPrimarySkill(primarySkill);
		return l;
	}

	@RequestMapping("/getExperienceGreaterThan")
	@ResponseBody
	public List<Candidate> getExperienceGreaterThan(@RequestParam double experience) {
		List<Candidate> l = repo.findByExperienceGreaterThan(experience);
		return l;
	}

	@RequestMapping("/getPercentageGreaterThan")
	@ResponseBody
	public List<Candidate> getPercentageGreaterThan(@RequestParam double percentage) {
		List<Candidate> l = repo.findByPercentageGreaterThan(percentage);
		return l;
	}

//	@RequestMapping("/getPrimarySkillSorted")
//	@ResponseBody
//	public List<Candidate>  getPrimarySkillSorted(@RequestParam String primarySkill) {
//		List<Candidate> l = repo.findByPrimarySkillSorted(primarySkill);
//		return l;
//	}

}
