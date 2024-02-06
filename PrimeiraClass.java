    public class PrimeiraClass {

        public static void main(String args[]){
            System.out.println("Olá mundo");

            Cliente cliente = new Cliente();

            cliente.setCodigo(123);//Primeiro exemplo não precisa modificar nada na class clinte
            cliente.setEndereco("Rua teste");

            //cliente.cadastrarEndereco(); //Segundo exemplo adicionar metodos

            System.out.println(cliente.getCodigo());
            System.out.println(cliente.getEndereco());

            //System.out.println(cliente.getValorTotal());//Terceiro exemplo

        }
    }
