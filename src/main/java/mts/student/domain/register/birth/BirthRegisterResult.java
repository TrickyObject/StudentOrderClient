package mts.student.domain.register.birth;

public class BirthRegisterResult {

    private boolean decision;
    private StringBuilder error;

    public BirthRegisterResult() {
        this.error = new StringBuilder("");
    }

    @Override
    public String toString() {
        return "BirthRegisterResult{" +
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
