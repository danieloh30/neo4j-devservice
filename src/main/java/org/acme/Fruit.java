package org.acme;

import org.neo4j.driver.types.Node;

public class Fruit {

    public Long id;
    public String name;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Fruit from(Node node) {
        return new Fruit(node.id(), node.get("name").asString());
    }
    
}
