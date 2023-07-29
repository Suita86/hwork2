// Интерфейс для модели человека
public interface Person {
    public String getName();

    public int getAge();

    public void setMother(Person mother);

    public void setFather(Person father);

    public void addChild(Person child);

  public List<Person> getChildren()

    public Person getMother();

    public Person getFather();
}

// Реализация интерфейса для модели человека
public class PersonImpl implements Person {
    private String name;
    private int age;
    private List<Person> children;
    private Person mother;
    private Person father;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
        this.children = new ArrayList<>();
    }

    @Override
    public void setMother(Person mother) {
        this.mother = mother;
    }

    @Override
    public void setFather(Person father) {
        this.father = father;
    }

    @Override
    public void addChild(Person child) {
        this.children.add(child);
    }

    @Override
    public List<Person> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Person getMother() {
        return mother;
    }

    @Override
    public Person getFather() {
        return father;
    }
}
