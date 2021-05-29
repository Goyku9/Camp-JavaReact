package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UsersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UsersDao;
import kodlamaio.hrms.entities.concretes.Users;

@Service
public class UsersManager implements UsersService {
	
	private UsersDao userDao;
	
	
    @Autowired
	public UsersManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<Users>> getAll() {
		
		return new SuccessDataResult<List<Users>>(this.userDao.findAll(),"Data Eklendi");
	}

	@Override
	public Result add(Users user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

}
