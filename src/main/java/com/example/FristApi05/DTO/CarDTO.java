package com.example.FristApi05.DTO;

import javax.validation.constraints.NotBlank;

public class CarDTO {

    @NotBlank(message = "mandatory")
    private String id;
    @NotBlank(message = "mandatory")
    private String modelName;
    private double price;

    public CarDTO(String id, String modelName, double price){
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }


    public String toString() {
        return "id: " + id + "Model Name : " + modelName + "Price : " + price;
    }

    public String getId(){
        return id;
    }

    public String getModelName(){
        return modelName;
    }

    public double getPrice() {
        return price;
    }
}
