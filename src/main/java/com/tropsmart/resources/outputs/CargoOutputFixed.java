package com.tropsmart.resources.outputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CargoOutputFixed {
    private String customer;
    private String driver;
    private double weight;
    private String description;
    private double servicePrice;
}
