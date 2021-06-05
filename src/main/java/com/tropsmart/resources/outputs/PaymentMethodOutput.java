package com.tropsmart.resources.outputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentMethodOutput {
    private String bankName;
    private int swiftCode;
    private long accountNumber;
}
