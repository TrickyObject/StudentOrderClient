package mts.student.domain.register.marriage;

public class MarriageRegisterResult {

    private boolean  decision;
    private StringBuilder error;

    public MarriageRegisterResult() {
        StringBuilder error = new StringBuilder("");
    }

    @Override
    public String toString() {
        return "MarriageRegisterResult{" +
                "decision=" + decision +
                ", error='" + error + '\'' +
                '}';
    }


    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public StringBuilder getError() {
        return error;
    }

    public void setError(StringBuilder error) {
        this.error = error;
    }
}
