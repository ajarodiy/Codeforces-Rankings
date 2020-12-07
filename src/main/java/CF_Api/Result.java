package CF_Api;

import java.util.List;
import java.util.Map;

public class Result {
    private Map<String, Object> contest;
    private List<Object> problems;
    private List<Rows> rows;

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }

    public Map<String, Object> getContest() {
        return contest;
    }

    public void setContest(Map<String, Object> contest) {
        this.contest = contest;
    }

    public List<Object> getProblems() {
        return problems;
    }

    public void setProblems(List<Object> problems) {
        this.problems = problems;
    }


}
