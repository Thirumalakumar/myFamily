package com.myfamily.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class Person {
    private String FirstName;
    private String LastName;
    private int age;
    private String MiddleName;
    private List<Relation> relation;

    public Person() {
    }


    public void setRelationship(Relation relation ){
        this.relation.add(relation);
    }

}
