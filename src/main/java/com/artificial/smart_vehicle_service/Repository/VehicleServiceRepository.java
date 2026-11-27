
package com.artificial.smart_vehicle_service.Repository;

import com.artificial.smart_vehicle_service.Model.VehicleServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleServiceRepository
        extends JpaRepository<VehicleServiceEntity, Long> {
}
