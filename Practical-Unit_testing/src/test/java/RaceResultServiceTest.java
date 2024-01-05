import com.javad.model.Client;
import com.javad.model.Message;
import com.javad.service.RaceResultService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class RaceResultServiceTest {
    private final RaceResultService raceResultService = new RaceResultService();
    private final Message message = Mockito.mock(Message.class);
    private final Client client = Mockito.mock(Client.class);

    @Test
    public void subscribedClientShouldReceiveMessage() {

        raceResultService.addSubscriber(client);
        raceResultService.send(message);

        verify(client).receive(message);
    }

    @Test
    public void messageShouldBeSentToAllSubscribers() {

        var clientA = Mockito.mock(Client.class);

        raceResultService.addSubscriber(clientA);
        raceResultService.addSubscriber(client);

        raceResultService.send(message);

        verify(clientA).receive(message);
        verify(client).receive(message);
    }

    @Test
    public void unsentMessageToNotSubscribers(){
        raceResultService.send(message);

        verify(client, never()).receive(message);
    }

    @Test
    public void sendOneMessageToDuplicateSubscriber(){
        raceResultService.addSubscriber(client);
        raceResultService.addSubscriber(client);
        raceResultService.send(message);

        verify(client).receive(message);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveMessage(){

        raceResultService.addSubscriber(client);
        raceResultService.removeSubscriber(client);

        raceResultService.send(message);

        verify(client, never()).receive(message);
    }
}