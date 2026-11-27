
package com.artificial.smart_vehicle_service.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "vehicle_services")
public class VehicleServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String vehicleNumber;

    private String vehicleModel;

    private String serviceType;

    private double serviceCost;

    private String serviceStatus;

    private LocalDateTime createdAt = LocalDateTime.now();
}
