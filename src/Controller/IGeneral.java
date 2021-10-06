package Controller;

public interface IGeneral<T> {
    public void showAll();
    public int findById(String id);
    public void addUser(T i);
    public void remove(int index);
}
