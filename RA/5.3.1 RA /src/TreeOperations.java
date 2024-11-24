import lista.Nodo;

public class TreeOperations<T> {

    public int countNodes(Nodo<T> root){
        if (root == null) {
            return 0;
        }

        int l = countNodes(root.getLeft());
        int r = countNodes(root.getRight());

        return 1 + l + r;
    }

    public int findAltura(Nodo<T> root){

        if (root == null) return -1;

        int l = findAltura(root.getLeft());
        int r = findAltura(root.getRight());

        if (l < r){
            return r + 1;
        } else {
            return l + 1;
        }
        // Aqui si fue sentir que uno se avienta al vacio confiando en la recursion
        // se sintió raro

    }
}
