package com.skydeck.mongo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("databases")
public class Database {
    
    private ObjectId _id;
    private String type;
    private String name;
    
    public Database(ObjectId _id, String type, String name) {
        super();
        this._id = _id;
        this.type = type;
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ObjectId get_id() {
        return _id;
    }
    
}
