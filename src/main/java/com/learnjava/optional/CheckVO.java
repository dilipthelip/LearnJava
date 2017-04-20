package com.learnjava.optional;

/**
 * Created by z001qgd on 2/28/17.
 */
public class CheckVO {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "CheckVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
