package mediatheque;

public class printOnlyBooks implements ItemVisitor {
    public printOnlyBooks() {
    }

    public void visit(Book item) {
        System.out.println(item);
    }

    public void visit(CD item) {}
}

