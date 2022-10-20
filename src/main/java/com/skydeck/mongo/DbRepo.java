package com.skydeck.mongo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DbRepo extends MongoRepository<Database, ObjectId>{

}
