package com.lx.qlw.shopping.api.bean;

import javax.persistence.Id;
import java.io.Serializable;

public class PmsBaseCatalog1 implements Serializable {
    @Id
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}