package com.tropsmart.resources.comunications;


import java.util.List;

import com.tropsmart.resources.outputs.ConfigurationOutput;
import com.tropsmart.resources.outputs.PaymentMethodOutput;
import com.tropsmart.resources.outputs.ReviewOutput;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConfigBoundResponse extends BaseResponse {
    
    public ConfigBoundResponse(String title, String message, Integer status) { super(title, message, status);}
    
    ConfigurationOutput configurationOutput;

    List<ConfigurationOutput> configurationOutputs;

    PaymentMethodOutput paymentMethodOutput;

    List<PaymentMethodOutput> paymentMethodOutputs;

    ReviewOutput reviewOutput;

    List<ReviewOutput> reviewOutputs;
}
