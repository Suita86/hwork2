// Интерфейс для модели дерева семьи
public interface FamilyTree {
    public List<Person> getAllChildren(Person parent);
}

// Реализация интерфейса для модели дерева семьи
public class FamilyTreeImpl implements FamilyTree {
    private Person root;

    public FamilyTreeImpl(Person root) {
        this.root = root;
    }

    @Override
    public List<Person> getAllChildren(Person parent) {
        List<Person> children = new ArrayList<>();
        if (parent.getChildren().isEmpty()) {
            return children;
        } else {
            for (Person child : parent.getChildren()) {
                children.add(child);
                children.addAll(getAllChildren(child));
            }
            return children;
        }
    }
}
