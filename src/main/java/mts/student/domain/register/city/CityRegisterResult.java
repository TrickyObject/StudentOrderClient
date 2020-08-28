package mts.student.domain.register.city;

public class CityRegisterResult {

    private boolean  decision;
    private StringBuilder error;

    public CityRegisterResult() {
        this.error = new StringBuilder("");
    }

    @Override
    public String toString() {
        return "CityRegisterResult{" +
                "decision=" + decision +
                ", error=" + error +
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
