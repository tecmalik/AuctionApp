package org.acalltoauction.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionRepository extends MongoRepository<AuctionRepository, String> {

}
