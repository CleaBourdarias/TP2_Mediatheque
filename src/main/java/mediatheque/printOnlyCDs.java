package mediatheque;

public class printOnlyCDs implements ItemVisitor {
    public printOnlyCDs() {
    }

    public void visit(Book item) {}

    public void visit(CD item) {
        System.out.println(item);
    }
}
