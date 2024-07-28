package observer;

/**
 *
 * @author 65050521
 */
public class Operator extends MatchSource {
    Score matchScore = new Score();

    public void setMatchScore(int teamA, int teamB) {
        matchScore.setTeamAScore(teamA);
        matchScore.setTeamBScore(teamB);
        notifier();
    }

    public Score getMatchScore() {
        return matchScore;
    }
}
