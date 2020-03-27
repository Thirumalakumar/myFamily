package com.myfamily.service;

import com.myfamily.model.Person;
import com.myfamily.model.Relation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipService {

    private Person myself = new Person();

    public String addRelationship(Relation relation){
        Relation relations = new Relation(relation);
        myself.setRelationship(relation);
        return "hello2";
    }

    public void addPerson(Person person){
        myself = person;
    }

    public Person getMyself(){
        return myself;
    }

    public List<Relation> getMyRelations(){
        return myself.getRelation();
    }
}
