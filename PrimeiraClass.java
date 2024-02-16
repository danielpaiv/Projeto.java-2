public class PrimeiraClass {

    public static void main(String args[]) {
        System.out.println("Ben vindo ao sistema");

        Cliente cliente = new Cliente();
        Fucionario fucionario = new Fucionario();
        ItenVenda itenVenda = new ItenVenda();

        cliente.setCodigo(123);
        cliente.setEndereco("Rua teste");
        fucionario.setNome("Daniel");
        fucionario.setEndereco("Rua dois");
        itenVenda.setQuantidade(5);

        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        System.out.println(fucionario.getNome());
        System.out.println(fucionario.getEndereco());
        System.out.println(itenVenda.getQuantidade());

    }
}
