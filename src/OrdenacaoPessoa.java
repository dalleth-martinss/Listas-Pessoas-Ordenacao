import java.util.*;


public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

        //constructor => na inicialização cria uma lista vazia
        public OrdenacaoPessoa() {
            this.pessoaList = new ArrayList<>();
        }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    //metodo para adicionar pessoa
        public void adicionaPessoa(String nome, int idade, double altura){
            pessoaList.add((new Pessoa(nome, idade, altura)));

        }

        public List<Pessoa>  ordenarPorIdade(){
            List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
            Collections.sort(pessoaPorIdade); // esse metodo faz a ordenação da lista através do método comparable
            return pessoaPorIdade;
        }

        public List<Pessoa> ordenarPorAltura(){
            List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura()); //para ordenar com camparator, usamos a Lista e instaciamos a classe criada com o implementes Comparator
            return pessoaPorAltura;
        }


}























