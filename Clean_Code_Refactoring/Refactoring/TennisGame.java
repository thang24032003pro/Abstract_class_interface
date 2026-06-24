public class TennisGame {

    // Loai bo Magic Values bang cach dinh nghia hang so
    private static final int SCORE_LOVE = 0;
    private static final int SCORE_FIFTEEN = 1;
    private static final int SCORE_THIRTY = 2;
    private static final int SCORE_FORTY = 3;

    // Doi ten tham so giup bien dung nghia (player1Name, player2Name,...)
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getDrawScore(player1Score);
        }

        if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWinScore(player1Score, player2Score);
        }

        return getNormalScore(player1Score, player2Score);
    }

    // Tach ham xu ly truong hop ti so hoa
    private static String getDrawScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love-All";
            case SCORE_FIFTEEN:
                return "Fifteen-All";
            case SCORE_THIRTY:
                return "Thirty-All";
            case SCORE_FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    // Tach ham xu ly truong hop co loi the hoac chien thang
    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1)
            return "Advantage player1";
        if (scoreDifference == -1)
            return "Advantage player2";
        if (scoreDifference >= 2)
            return "Win for player1";
        return "Win for player2";
    }

    // Tach ham xu ly truong hop ti so binh thuong
    private static String getNormalScore(int player1Score, int player2Score) {
        return convertScoreToString(player1Score) + "-" + convertScoreToString(player2Score);
    }

    private static String convertScoreToString(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love";
            case SCORE_FIFTEEN:
                return "Fifteen";
            case SCORE_THIRTY:
                return "Thirty";
            case SCORE_FORTY:
                return "Forty";
            default:
                return "";
        }
    }
}