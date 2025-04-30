package org.acalltoauction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}





//+ createLot(Str name, Str:description, Str:imageUrl  ):void
//+ deleteLot(Str:name)
//+ viewAvailableLots():list<Lots>;
//+ checkLotStatus(str:)Status
//+ viewAvailableAuctions():list<Auctions>
//+ createAuction(Str:name, Str:lotName):void\
//+ deleteAuction(Str:auctionName)
//+ subscribeToAuction(Auction):Str
//+ unsubscribeToAuction(Auction):Str
//+ bid(auction, price):String
//+ viewBiddingHistory():List<Str>
//+ FindLotByName( Str: lotName):Lot