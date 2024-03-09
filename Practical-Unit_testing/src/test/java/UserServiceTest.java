import com.javad.model.User;
import com.javad.service.SecurityService;
import com.javad.service.UserDAO;
import com.javad.service.UserServiceImpl;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private final static String PASSWORD = "password";
    private final static String MD5_PASSWORD = "encodedPass";

    @Test
    public void userHasSuccessfullyChangePassword() throws Exception {

        var user = Mockito.mock(User.class);
        var userDao = Mockito.mock(UserDAO.class);
        var securityService = Mockito.mock(SecurityService.class);

        var userService = new UserServiceImpl(userDao, securityService);

        when(user.getPassword()).thenReturn(PASSWORD);
        when(securityService.md5(PASSWORD)).thenReturn(MD5_PASSWORD);

        userService.assignPassword(user);

        verify(user).setPassword(MD5_PASSWORD);
        verify(userDao).updateUser(user);
    }
}