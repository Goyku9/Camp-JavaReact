package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CandidateUsers;

public interface CandidateUsersDao extends JpaRepository<CandidateUsers,Integer> {

}
