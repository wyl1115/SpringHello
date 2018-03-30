package repository;

import domain.User;

public interface UserRepository {
    User save(User user);
    User findByEmployeeNo(String employeeNo);
}
