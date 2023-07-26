package generics.interfaces.Example;

public class AccountRepo implements Repository<Account> {

    public void save(Account object){

    }

    @Override
    public Account find() {
        return null;
    }

}
