package generics.classes;
//generic olarak PRIMITIVE data tipleri KULLANILMAZ.
public class GenericClass<T> {

    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
