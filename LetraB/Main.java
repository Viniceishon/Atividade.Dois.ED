public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vinicius", "169.998.556-17");
        LivroUm livro = new LivroUm("A CENTELHA DO DRAGÃO", "ERMELINDO DRAW", "FICÇÃO");

        System.out.println(livro.toString());
        System.out.println(pessoa.toString());
    }
}