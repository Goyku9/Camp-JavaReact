package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.StaffUsersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.StaffUsersDao;
import kodlamaio.hrms.entities.concretes.StaffUsers;


@Service
public class StaffUsersManager implements StaffUsersService{

	private StaffUsersDao staffUsersDao;
	
	@Autowired
	public StaffUsersManager(StaffUsersDao staffUsersDao) {
		super();
		this.staffUsersDao = staffUsersDao;
	}

	@Override
	public DataResult<List<StaffUsers>> getAll() {
		
		return new SuccessDataResult<List<StaffUsers>>(this.staffUsersDao.findAll(),"Data Eklendi");
	}

	@Override
	public Result add(StaffUsers staffUser) {
		
		this.staffUsersDao.save(staffUser);
		
		return new SuccessResult("Personel Eklendi");
	}
	
	

}
