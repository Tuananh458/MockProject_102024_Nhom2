package com.mock_project_102024_nhom02.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class PaymentRequest {
 
    String id;
 
    String user;
 
    String service;
 
    String income;

    String status;
 
    BigDecimal total;
 
    LocalDate paymentDateline;
 
    String typePayment;
}
