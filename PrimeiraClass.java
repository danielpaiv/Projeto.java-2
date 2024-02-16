public class PrimeiraClass {

    public static void main(String args[]) {
        System.out.println("Ben vindo");

        Cliente cliente = new Cliente();
        Fucionario fucionario = new Fucionario();

        cliente.setCodigo(123);
        cliente.setEndereco("Rua teste");
        fucionario.setNome("Daniel");
        fucionario.setEndereco("Rua dois");

        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        System.out.println(fucionario.getNome());
        System.out.println(fucionario.getEndereco());

    }
}
