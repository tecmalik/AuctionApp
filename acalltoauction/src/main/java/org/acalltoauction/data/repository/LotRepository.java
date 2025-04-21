package org.acalltoauction.data.repository;

import org.acalltoauction.data.models.Lot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LotRepository extends MongoRepository<Lot, String> {

}
