import com.javad.model.ClientModel;
import com.javad.model.Template;
import com.javad.service.MailServer;
import com.javad.service.Messenger;
import com.javad.service.TemplateEngine;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MessengerTest {

    private final static String MSG_CONTENT = "this is email content";
    private final static String CLI_EMAIL = "test@gmail.com";

    @Test
    public void shouldSendMessage() {
        var template = Mockito.mock(Template.class);
        var templateEngine = Mockito.mock(TemplateEngine.class);
        var mailServer = Mockito.mock(MailServer.class);
        var messenger = new Messenger(templateEngine, mailServer);
        var client = Mockito.mock(ClientModel.class);

        when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);
        when(client.getEmail()).thenReturn(CLI_EMAIL);

        messenger.sendMessage(client, template);

        verify(mailServer).send(CLI_EMAIL, MSG_CONTENT);
    }
}
