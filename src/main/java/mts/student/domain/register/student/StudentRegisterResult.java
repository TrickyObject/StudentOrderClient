package mts.student.domain.register.student;

public class StudentRegisterResult {

    private boolean  decision;
    private StringBuilder error;

    @Override
    public String toString() {
        return "StudentRegisterResult{" +
                "decision=" + decision +
                ", error=" + error +
                '}';
    }

    public StudentRegisterResult() {
        this.error = new StringBuilder("");
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
