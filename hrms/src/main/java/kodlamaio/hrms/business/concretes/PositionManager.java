package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;

public class PositionManager implements PositionService{
	
	PositionDao positionDao;

	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		
		return this.positionDao.findAll();
	}
	
	
	

}