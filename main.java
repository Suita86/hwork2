public class Main {
    public static void main(String[] args) {
        Person vlad = new PersonImpl("Vlad", 35);
        Person mariya = new PersonImpl("Mariya", 30);
        Person boris = new PersonImpl("Boris", 10);
        Person olga = new PersonImpl("Olga", 8);
        Person timofei = new PersonImpl("Timofei", 5);

        vlad.addChild(boris);
        vlad.addChild(olga);
        olga.addChild(timofei);

        FamilyTree familyTree = new FamilyTreeImpl(vlad);
        GenealogyResearch genealogyResearch = new GenealogyResearchImpl(familyTree);

        List<Person> children = genealogyResearch.getAllChildren(vlad);
        for (Person child : children) {
            System.out.println(child.getName());
        }

        List<Person> descendants = genealogyResearch.getAllDescendants(vlad);
        for (Person descendant : descendants) {
            System.out.println(descendant.getName());
        }

        FamilyTreeFileIO fileIO = new FamilyTreeFileIOImpl();
        fileIO.writeFamilyTreeToFile(familyTree, "family_tree.txt");
        FamilyTree readFamilyTree = fileIO.readFamilyTreeFromFile("family_tree.txt");
    }
}