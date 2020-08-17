package mts.student.domain.register.birth;

public class BirthRegisterResponse {

    private boolean born;

    public boolean isBorn() {
        return born;
    }

    public void setBorn(boolean born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return "BirthRegisterResponse{" +
                "born=" + born +
                '}';
    }
}


