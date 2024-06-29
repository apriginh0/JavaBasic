package PrimeiraSenama;

public class MinhaClasse {
    public static void main(String[] args){
        String firstName = "Diego";
        String lastName = "Aprigio";

        String fullName = nomeCompleto(firstName, lastName);
        System.out.println(fullName);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
