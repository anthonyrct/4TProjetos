public class Node {
    String name; // Nome do diretório ou arquivo
    Node left;   // Referência ao filho esquerdo
    Node right;  // Referência ao filho direito


    Node(String name) {
        this.name = name;
        left = null;
        right = null;
}
}
