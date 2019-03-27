import java.util.Optional;

public class Car<T> {
    private T owner;
    private InsurancePolicy insurancePolicy;

    public Car(T owner) {
        this.owner = owner;
    }

    public T getOwner() {
        return owner;
    }

    public void setOwner(T owner) {
        this.owner = owner;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner=" + owner +
                ", insurancePolicy=" + insurancePolicy +
                '}';
    }
}
