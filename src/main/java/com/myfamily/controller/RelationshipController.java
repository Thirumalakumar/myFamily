package com.myfamily.controller;

import com.myfamily.model.Person;
import com.myfamily.model.Relation;
import com.myfamily.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RelationshipController {

    @Autowired
    private RelationshipService relationshipService;

    @PostMapping(path = "/addRealationship")
    public String addRelationship(@RequestBody Relation relation){
        relationshipService.addRelationship(relation);
        return "added relation with"+relation.getName();
    }

    @PostMapping(path = "/addPerson")
    public String addPerson(@RequestBody Person person){
        relationshipService.addPerson(person);
        return "added person";
    }

    @GetMapping(path = "/getMyself")
    public Person getMyself(){
        return relationshipService.getMyself();
    }

    @GetMapping(path = "/getMyRelations")
    public List<Relation> getMyRelations(){
        return relationshipService.getMyRelations();
    }
}
