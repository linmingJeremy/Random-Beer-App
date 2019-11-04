package com.app.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.app.entity.Beer;

@Repository
public interface BeerRespositroy extends CrudRepository<Beer,Long> {
	
	@Query(value="select b.* from beer b order by rand() limit 1",nativeQuery = true)
	List<Beer> findRandBeer();
}
