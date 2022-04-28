package com.devsuperior.hrpayroll.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Worker {
    private Long id;
    private String name;
    private Double dailyIncome;
}
