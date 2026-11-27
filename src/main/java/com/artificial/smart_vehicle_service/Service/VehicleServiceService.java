
package com.artificial.smart_vehicle_service.Service;

import com.artificial.smart_vehicle_service.Model.VehicleServiceEntity;
import com.artificial.smart_vehicle_service.Repository.VehicleServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceService {

    private final VehicleServiceRepository repository;

    public VehicleServiceService(VehicleServiceRepository repository) {
        this.repository = repository;
    }

    public VehicleServiceEntity createService(VehicleServiceEntity vehicle) {
        vehicle.setServiceStatus("BOOKED");
        return repository.save(vehicle);
    }

    public List<VehicleServiceEntity> getAllServices() {
        return repository.findAll();
    }

    public VehicleServiceEntity getServiceById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle service not found"));
    }

    public VehicleServiceEntity updateStatus(Long id, String status) {
        VehicleServiceEntity vehicle = getServiceById(id);
        vehicle.setServiceStatus(status);
        return repository.save(vehicle);
    }

    public void deleteService(Long id) {
        repository.delete(getServiceById(id));
    }
}
