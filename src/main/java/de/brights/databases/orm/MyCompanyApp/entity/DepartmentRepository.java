package de.brights.databases.orm.MyCompanyApp.entity;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
