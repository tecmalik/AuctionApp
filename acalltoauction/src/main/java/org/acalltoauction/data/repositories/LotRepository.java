package org.acalltoauction.data.repositories;

import org.acalltoauction.data.models.Lot;
import org.springframework.data.mongodb.repository.MongoRepository;

public class LotRepository extends MongoRepository <Lot,String> {
}
