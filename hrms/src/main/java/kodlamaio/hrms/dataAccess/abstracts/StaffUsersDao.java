package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.StaffUsers;

public interface StaffUsersDao  extends JpaRepository<StaffUsers, Integer>{

}
