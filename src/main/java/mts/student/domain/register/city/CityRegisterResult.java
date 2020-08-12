package mts.student.domain.register.city;

public class CityRegisterResult {

    private boolean  decision;
    private String error;

    @Override
    public String toString() {
        return "CityRegisterResult{" +
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

    public String getError() {
        return error;
    }

    // сделать через append
    public void setError(String error) {
        this.error = error;
    }
}
