import com.javad.FootBallTeam;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballTeamTest {

    @Test
    public void setGamesWonFootballTeam() {

        FootBallTeam footBallTeam = new FootBallTeam(3);
        assertEquals(3, footBallTeam.getGamesWon());

    }
}