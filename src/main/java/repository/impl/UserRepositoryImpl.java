package repository.impl;

import domain.User;
import repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    public User bigUser = new User();
    @Override
    public User save(User user) {
        bigUser = user;
        return user;
    }

    @Override
    public User findByEmployeeNo(String employeeNo) {
        if(bigUser.getEmployeeNo() == employeeNo) {
            return bigUser;
        }

        return null;
    }
}
