// Интерфейс для исследования генеалогического древа
public interface GenealogyResearch {
    public List<Person> getAllChildren(Person parent);

    public List<Person> getAllDescendants(Person ancestor);
}

// Реализация интерфейса для исследования генеалогического древа
public class GenealogyResearchImpl implements GenealogyResearch {
    private FamilyTree familyTree;

    public GenealogyResearchImpl(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public List<Person> getAllChildren(Person parent) {
        return familyTree.getAllChildren(parent);
    }

    @Override
    public List<Person> getAllDescendants(Person ancestor) {
        List<Person> descendants = new ArrayList<>();
        List<Person> children = getAllChildren(ancestor);
        descendants.addAll(children);
        for (Person child : children) {
            descendants.addAll(getAllDescendants(child));
        }
        return descendants;
    }
}
