package NBU_.NBU_exercise2603;

public enum ProgramType {
    Major(140),
    Minor(120);

    private final int numberOfCredits;

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    ProgramType(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
