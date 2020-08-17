package mts.student.domain.register.marriage;

public class MarriageRegisterResponse {

    private boolean married;

    @Override
    public String toString() {
        return "MarriageRegisterResponse{" +
                "married=" + married +
                '}';
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
