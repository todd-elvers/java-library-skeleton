package te;

public class ServiceTwo {

    private final ServiceOne one;

    public ServiceTwo(ServiceOne one) {
        this.one = one;
    }

    public String randString() {
        return one.randString();
    }

}
