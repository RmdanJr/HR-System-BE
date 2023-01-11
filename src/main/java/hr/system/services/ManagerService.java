package hr.system.services;

import hr.system.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ManagerService {
    @Autowired
    private final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public void deleteManager(UUID id) {
        managerRepository.deleteById(id);
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//        if (manager.getManager() == null) return;
//        Manager directManager = manager.getManager();
//        for (Employee employee : manager.getManagedEmployees()) {
//            employee.setManager(directManager);
//        }
//        managerRepository.delete(manager);
    }
}
