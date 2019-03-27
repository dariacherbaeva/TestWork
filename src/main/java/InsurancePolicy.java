import java.util.List;

public class InsurancePolicy<T> {

    private List<T> owner;
    private String insurancePolicyNumber;

    public InsurancePolicy(List<T> owner, String insurancePolicyNumber) {
        this.owner = owner;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public List<T> getOwner() {
        return owner;
    }

    public void setOwner(List<T> owner) {
        this.owner = owner;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "owner=" + owner +
                ", insurancePolicyNumber='" + insurancePolicyNumber + '\'' +
                '}';
    }
}
