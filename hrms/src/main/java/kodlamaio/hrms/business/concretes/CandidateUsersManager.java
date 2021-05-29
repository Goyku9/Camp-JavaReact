package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateUsersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateUsersDao;
import kodlamaio.hrms.entities.concretes.CandidateUsers;

@Service
public class CandidateUsersManager implements CandidateUsersService {

	private CandidateUsersDao candidateUsersDao;
	
	@Autowired
	public CandidateUsersManager(CandidateUsersDao candidateUsersDao) {
		super();
		this.candidateUsersDao = candidateUsersDao;
	}

	@Override
	public DataResult<List<CandidateUsers>> getAll() {
		
		return new SuccessDataResult<List<CandidateUsers>>(this.candidateUsersDao.findAll(),"Data Eklnedi");
	}

	@Override
	public Result add(CandidateUsers candidateUser) {
	
		this.candidateUsersDao.save(candidateUser);
		return new SuccessResult("İş Arayan Eklendi");
	}

}
