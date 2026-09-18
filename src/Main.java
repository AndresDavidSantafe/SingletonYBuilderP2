public class Main{
    public static void main(String[]args){

        Compra compraMin = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento(asiento)
                .build();

        Compra compraMax = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento(asiento)
                .conCombo(combo)
                .conPuntoRedimido(1000)
                .conEsCortesia(true) // Reto
                .build();

    }
}