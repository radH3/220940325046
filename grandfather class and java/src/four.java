public class four {
    public static void main(String[] args) {
        child c = new child("PAPA","GODWA","NADO","NADO" +
                "");
    }
}
class GrandParent{
    String grandFatherName;
    String grandMotherName;

    public GrandParent(String grandFatherName, String grandMotherName) {
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;
        System.out.println("Grand Father name is "+grandFatherName+" and Grand Mother name is "+grandMotherName);
    }
}
class parent extends GrandParent{
    String fatherName;
    String motherName;

    public parent(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName);
        this.fatherName = fatherName;
        this.motherName = motherName;
        System.out.println("Father name is "+fatherName+" and Mother name is "+motherName);
    }
    public parent(String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
    }
}
class child extends parent{

    public child(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName, fatherName, motherName);
    }

}
