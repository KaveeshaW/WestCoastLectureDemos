package com.stayready.demos.artist;

public abstract class Artist {

    private String birthName;
    private String alias;
    private Integer age;

    public Artist(String name, String alias, Integer age){
        this.birthName = name;
        this.alias = alias;
        this.age = age;
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract String signAutoGraph();

    @Override
    public String toString(){
        return birthName +" "+ alias + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
}
