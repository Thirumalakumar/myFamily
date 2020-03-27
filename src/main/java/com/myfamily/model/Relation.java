package com.myfamily.model;

import com.myfamily.constants.Relationship;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Relation {

    private Relationship relationship;
    private String name;

    Relation (){
    }

    public Relation(Relation relation) {
    }
}
