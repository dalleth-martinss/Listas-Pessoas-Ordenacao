public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionaPessoa("Nome 1", 20, 1.56);
        System.out.println("\n");
        ordenacaoPessoa.adicionaPessoa("Nome 1", 30, 1.80);
        System.out.println("\n");
        ordenacaoPessoa.adicionaPessoa("Nome 1", 25, 1.70);
        System.out.println("\n");
        ordenacaoPessoa.adicionaPessoa("Nome 1", 17, 1.56);
        System.out.println("\n");
        ordenacaoPessoa.adicionaPessoa("Nome 1", 22, 1.95);
        System.out.println("\n");
        ordenacaoPessoa.adicionaPessoa("Nome 1", 40, 1.55);
        System.out.println("\n");

        System.out.println("Lista de pessoas: \n");
        System.out.println(ordenacaoPessoa.getPessoaList());

        System.out.println("Lista de Pessoas ordenadas Por Idade: \n");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("Lista de Pessoas ordenadas Por Altura: \n");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());


    }
}