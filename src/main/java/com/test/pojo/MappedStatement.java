package com.test.pojo;

public class MappedStatement {

    private String id;

    private String resultType;

    private String paramerType;

    private String sql;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getParamerType() {
        return paramerType;
    }

    public void setParamerType(String paramerType) {
        this.paramerType = paramerType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
