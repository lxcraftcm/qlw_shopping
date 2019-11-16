package com.lx.qlw.shopping.api.bean;

import javax.persistence.Id;
import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {
    @Id
    private Long id;

    private String name;

    private Integer catalog2Id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Integer catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}