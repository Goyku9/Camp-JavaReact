package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	
	PositionDao positionDao;

	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}



	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>
    	(this.positionDao.findAll(),"Data listelendi");
    					
	}

	@Override
	public Result add(Position position) {
		this.positionDao.save(position);
    	return new SuccessResult("İş pozisyonu eklendi.");
    			
	}
	
	
	

}
