package com.tropsmart.resources.outputs;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FavoriteOutput {
    private String user;
    private String favourited;
    private Date since;
}
