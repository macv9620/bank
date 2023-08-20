package bytebank;

public class TestFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(2000);
        gerente.setClave("00010");
        Auth auth = new Auth();
        auth.autenticar("0000", gerente);

        Admin admin = new Admin();
        admin.setClave("1111");
        auth.autenticar("1111", admin);

        Cliente cliente = new Cliente();
        cliente.setClave("2222");
        auth.autenticar("2222", cliente);
    }
}
