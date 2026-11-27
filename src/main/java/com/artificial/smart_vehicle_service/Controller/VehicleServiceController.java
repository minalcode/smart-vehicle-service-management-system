
package com.artificial.smart_vehicle_service.Controller;

import com.artificial.smart_vehicle_service.Model.VehicleServiceEntity;
import com.artificial.smart_vehicle_service.Service.VehicleServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle-services")
public class VehicleServiceController {

    private final VehicleServiceService service;

    public VehicleServiceController(VehicleServiceService service) {
        this.service = service;
    }

    @PostMapping
    public VehicleServiceEntity createService(@RequestBody VehicleServiceEntity vehicle) {
        return service.createService(vehicle);
    }

    @GetMapping
    public List<VehicleServiceEntity> getAllServices() {
        return service.getAllServices();
    }

    @GetMapping("/{id}")
    public VehicleServiceEntity getServiceById(@PathVariable Long id) {
        return service.getServiceById(id);
    }

    @PutMapping("/{id}/status")
    public VehicleServiceEntity updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return service.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public String deleteService(@PathVariable Long id) {
        service.deleteService(id);
        return "Vehicle service deleted successfully";
    }
}
