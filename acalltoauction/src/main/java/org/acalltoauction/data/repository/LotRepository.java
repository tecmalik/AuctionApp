package org.acalltoauction.data.repository;

import org.acalltoauction.data.models.Lot;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface LotRepository extends MongoRepository<Lot, String> {

}
