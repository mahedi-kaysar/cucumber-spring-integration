package com.mahedikaysar.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KafkaEvent {
    private String responseId;
    private String domainAcronym;
    private String sessionId;
    private int internalRequestId;
}