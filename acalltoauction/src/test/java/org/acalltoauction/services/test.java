//package org.acalltoauction.services;
//
//import com.mongodb.BasicDBObjectBuilder;
//import com.mongodb.DBObject;
//import de.flapdoodle.embed.mongo.config.Net;
//import de.flapdoodle.embed.mongo.distribution.Version;
//import de.flapdoodle.embed.mongo.transitions.MongodStarter;
//import de.flapdoodle.embed.process.runtime.Network;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//@SpringBootTest
//public class test {
//        private static final String CONNECTION_STRING = "mongodb://%s:%d";
//
//        private MongodExecutable mongodExecutable;
//        private MongoTemplate mongoTemplate;
//
//        @AfterEach
//        void clean() {
//            mongodExecutable.stop();
//        }
//
//        @BeforeEach
//        void setup() throws Exception {
//            String ip = "localhost";
//            int port = 27017;
//
//            ImmutableMoaangodConfig mongodConfig = MongodConfig
//                    .builder()
//                    .version(Version.Main.PRODUCTION)
//                    .net(new Net(ip, port, Network.localhostIsIPv6()))
//                    .build();
//
//            MongodStarter starter = MongodStarter.getDefaultInstance();
//            mongodExecutable = starter.prepare(mongodConfig);
//            mongodExecutable.start();
//            mongoTemplate = new MongoTemplate(MongoClients.create(String.format(CONNECTION_STRING, ip, port)), "test");
//        }
//
//        @DisplayName("given object to save"
//                + " when save object using MongoDB template"
//                + " then object is saved")
//        @Test
//        void test() throws Exception {
//            // given
//            DBObject objectToSave = BasicDBObjectBuilder.start()
//                    .add("key", "value")
//                    .get();
//
//            // when
//            mongoTemplate.save(objectToSave, "collection");
//
//            // then
//            assertThat(mongoTemplate.findAll(DBObject.class, "collection")).extracting("key")
//                    .containsOnly("value");
//        }
//
//}
