package org.calltoauction.data.repository;

import org.calltoauction.data.models.Lot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LotRepository extends MongoRepository<Lot, String> {

}
