package observer;

/**
 *
 * @author 65050521
 */
public class Register implements Observer {
    
    public void scoreUpdate(MatchSource matchSource){
        Operator matchOperator = (Operator) matchSource;
        Score matchScore = matchOperator.getMatchScore();
        System.out.println("live result: Thai " + matchScore.getTeamAScore() + " - " + matchScore.getTeamBScore() + " UAE");
    }
}
