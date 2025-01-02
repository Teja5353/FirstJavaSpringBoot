// filepath: /home/tejaniduram/Desktop/first/src/main/java/com/example/first_application/first/repository/EmployeeRepository.java
package com.example.first_application.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<com.example.first_application.first.entities.Employee, Long> {
}