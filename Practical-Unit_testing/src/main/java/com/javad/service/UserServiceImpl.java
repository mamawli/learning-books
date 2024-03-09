package com.javad.service;

import com.javad.model.User;

public class UserServiceImpl {

    private UserDAO userDAO;
    private SecurityService service;

    public UserServiceImpl(UserDAO userDAO, SecurityService service) {
        this.userDAO = userDAO;
        this.service = service;
    }

    public void assignPassword(User user) throws Exception {
        var passwordMd5 = service.md5(user.getPassword());
        user.setPassword(passwordMd5);
        userDAO.updateUser(user);
    }
}
