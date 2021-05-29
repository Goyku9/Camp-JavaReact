package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.StaffUsersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.StaffUsers;

@RestController
@RequestMapping("/api/staff")
public class StaffUsersController {
   
	private StaffUsersService staffUsersService;

	@Autowired
	public StaffUsersController(StaffUsersService staffUsersService) {
		super();
		this.staffUsersService = staffUsersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<StaffUsers>> getAll(){
		
		return this.staffUsersService.getAll();
		
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody StaffUsers staffUser) {
		
		return this.staffUsersService.add(staffUser);
		
	}
	
	
}
