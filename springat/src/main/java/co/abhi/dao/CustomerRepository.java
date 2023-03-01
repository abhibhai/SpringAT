package co.abhi.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import co.abhi.entity.customer;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<customer, Integer> {

	Optional<customer> findById(Integer id);

	void save(customer customer);

	void delete(customer c1);

	


	

}
