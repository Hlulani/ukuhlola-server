package infrastructure.restapi.registration;

import infrastructure.security.RegistrationService;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RegistrationControllerTest {

    @Test
    public void shouldCallRegistrationServiceWhenRegistering() {
        RegistrationService registrationService = mock(RegistrationService.class);
        RegistrationController registrationController = new RegistrationController(registrationService);

        registrationController.registerUser(new RegistrationDetails("email", "P@ssword"));

        verify(registrationService, times(1)).registerUser("email", "P@ssword");
    }

}