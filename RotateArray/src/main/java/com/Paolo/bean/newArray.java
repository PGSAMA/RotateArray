package com.Paolo.bean;

public class newArray {

    private String id = "2D-array de ";
    private int dimension;
    private String INPUT= " ";
    private String OUTPUT=" ";


    public void setId(String id) {
        this.id = id;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setId(int id) {
        this.id = "2D-array Autogenerado de "+(id*id)+" Casillas en Dimension "+id+"x"+id;
    }

    public String getId() {
        return id;
    }


    public String getINPUT() {
        return INPUT;
    }

    public void setINPUT(String INPUT) {
        this.INPUT = INPUT;
    }

    public String getOUTPUT() {
        return OUTPUT;
    }

    public void setOUTPUT(String OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

    public newArray() {
    }

    public newArray(String id, int nxN, String INPUT, String OUTPUT) {
        this.id= "2D-ARRAY DE "+(nxN*nxN)+" Casillas";
        this.INPUT = INPUT;
        this.OUTPUT = OUTPUT;
    }
}
