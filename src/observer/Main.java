package observer;

import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Register reg1 = new Register();
        Register reg2 = new Register();

        Operator matchOperator = new Operator();

        matchOperator.registerGuest(reg1);
        matchOperator.registerGuest(reg2);

        while (true) {
            System.out.print("Thai Score (or press 'Enter' key to quit): ");
            String teamAScoreInput = sc.nextLine();
            if (teamAScoreInput.isEmpty()) break;

            System.out.print("UAE Score (or press 'Enter' key to quit): ");
            String teamBScoreInput = sc.nextLine();
            if (teamBScoreInput.isEmpty()) break;

            try {
                int teamAScore = Integer.parseInt(teamAScoreInput);
                int teamBScore = Integer.parseInt(teamBScoreInput);

                matchOperator.setMatchScore(teamAScore, teamBScore);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        sc.close();

    }
    
    
}
