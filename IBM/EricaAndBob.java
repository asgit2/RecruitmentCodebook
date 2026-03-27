class EricaAndBob {

    public static String winner(String erica, String bob) {
        int ericaScore = calculateScore(erica);
        int bobScore = calculateScore(bob);

        if (ericaScore > bobScore) {
            return "Erica";
        } else if (bobScore > ericaScore) {
            return "Bob";
        } else {
            return "Tie";
        }
    }

    private static int calculateScore(String s) {
        int score = 0;

        for (char c : s.toCharArray()) {
            if (c == 'E') {
                score += 1;
            } else if (c == 'M') {
                score += 3;
            } else if (c == 'H') {
                score += 5;
            }
        }

        return score;
    }
}