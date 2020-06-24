package com.redhat.labs.omp.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreationDetails {

    private String createdByUser;
    private String createdByEmail;
    private LocalDateTime createdOn;

}
