package NBU_.task2_;

public abstract class RegProvider implements Provider{
    public String regNum;

    public RegProvider() {
    }
    public RegProvider(String regNum) {
        this.regNum = regNum;
    }
}
