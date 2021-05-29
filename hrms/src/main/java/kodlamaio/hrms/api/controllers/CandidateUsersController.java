package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateUsersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateUsers;

@RestController
@RequestMapping("/api/candidate")
public class CandidateUsersController {
	
	private CandidateUsersService candidateUsersService;

	 @Autowired
	public CandidateUsersController(CandidateUsersService candidateUsersService) {
		super();
		this.candidateUsersService = candidateUsersService;
	}
	
	@GetMapping("/getall")
	public 	DataResult<List<CandidateUsers>> getAll(){
		return this.candidateUsersService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateUsers candidateUser) {
		return this.candidateUsersService.add(candidateUser);
	}


}
