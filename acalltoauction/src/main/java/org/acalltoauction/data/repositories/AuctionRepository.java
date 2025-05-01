package org.acalltoauction.data.repositories;

import org.acalltoauction.data.models.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionRepository extends MongoRepository<Auction, String> {
    Auction findByTitle(String auctionTitle);
    void deleteByTitle(Auction auction);
}
