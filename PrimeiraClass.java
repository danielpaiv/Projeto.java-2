    public class PrimeiraClass {

        public static void main(String args[]){
            System.out.println("Olá mundo");

            Cliente cliente = new Cliente();

            cliente.setCodigo(123);
            cliente.setEndereco("Rua teste");

            System.out.println(cliente.getCodigo());
            System.out.println(cliente.getEndereco());


        }
    }
