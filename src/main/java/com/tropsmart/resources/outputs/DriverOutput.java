package com.tropsmart.resources.outputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DriverOutput {
    private int id;
    private String firstName;
    private String lastName;
    private String license;
    private String email;
    private int role;
    private int roleId;
}
