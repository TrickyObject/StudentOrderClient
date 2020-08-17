package mts.student.domain.register.student;

public class StudentRegisterResponse {

    private boolean studying;

    @Override
    public String toString() {
        return "StudentRegisterResponse{" +
                "studying=" + studying +
                '}';
    }

    public boolean isStudying() {
        return studying;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }
}
