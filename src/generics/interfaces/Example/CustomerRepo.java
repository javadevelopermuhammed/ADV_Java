package generics.interfaces.Example;

public class CustomerRepo implements Repository<Customer> {

    public void save(Customer object){

    }

    @Override
    public Customer find() {
        return null;
    }
}
