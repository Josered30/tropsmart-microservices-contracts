package com.tropsmart.resources.comunications;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.tropsmart.resources.outputs.BalanceOutput;
import com.tropsmart.resources.outputs.CustomerOutput;

@Data
@NoArgsConstructor
public class CustomerBoundResponse extends BaseResponse{
    public CustomerBoundResponse(String title, String message, Integer status) { super(title, message, status);}

    CustomerOutput customerOutput;

    List<CustomerOutput> customerOutputs;

    BalanceOutput balanceOutput;

    List<BalanceOutput> balanceOutputs;
}
