package com.deploy.pertemuan11.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "profile")
@AllArgsConstructor
@NoArgsConstructor

public class Profile {
    @Id
    private String
}
