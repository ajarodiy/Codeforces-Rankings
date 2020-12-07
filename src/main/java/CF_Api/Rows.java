package CF_Api;

import java.util.List;

public class Rows {
    private Party party;
    private int rank;
    private float points;
    private float penalty;
    private int successfulHackCount;
    private int unsuccessfulHackCount;
    private List<Object> problemResults;

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public float getPenalty() {
        return penalty;
    }

    public void setPenalty(float penalty) {
        this.penalty = penalty;
    }

    public int getSuccessfulHackCount() {
        return successfulHackCount;
    }

    public void setSuccessfulHackCount(int successfulHackCount) {
        this.successfulHackCount = successfulHackCount;
    }

    public int getUnsuccessfulHackCount() {
        return unsuccessfulHackCount;
    }

    public void setUnsuccessfulHackCount(int unsuccessfulHackCount) {
        this.unsuccessfulHackCount = unsuccessfulHackCount;
    }

    public List<Object> getProblemResults() {
        return problemResults;
    }

    public void setProblemResults(List<Object> problemResults) {
        this.problemResults = problemResults;
    }
}
