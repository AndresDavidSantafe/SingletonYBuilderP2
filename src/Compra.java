import java.util.ArrayList;
import java.util.List;

public class Compra {
    private final Cliente cliente;
    private final Funcion funcion;
    private final List<String> asientos;
    private final Combo combo; // opcional
    private final int puntosRedimidos;
    private final boolean esCortesia;

    // opcional
    private Compra(Builder b) {
        this.cliente = b.cliente;
        this.funcion = b.funcion;
        this.asientos= b.asientos;
        this.combo = b.combo;
        this.puntosRedimidos= b.puntosRedimidos;
        this.esCortesia = b.esCortesia;
    }

    public static class Builder {
        // mismos campos, SIN final, con valores por defecto
        private Cliente cliente;
        private Funcion funcion;
        private List<String> asientos = new ArrayList<>();
        private Combo combo;
        private int puntosRedimidos = 0;
        private boolean esCortesia = false;

        public Builder conCliente(Cliente c) {
            this.cliente = c;
            return this; // ¿qué va aquí y por qué?
        }

        public Builder conFuncion(Funcion f) {
            this.funcion = f;
            return this;
        }

        public Builder conAsiento(String a) {
            this.asientos.add(a);
            return this;
        }

        public Builder conCombo(Combo c) {
            this.combo = c;
            return this;
        }

        public Builder conPuntoRedimido(int p) {
            this.puntosRedimidos = p;
            return this;
        }

        //Reto
        public Builder conEsCortesia(boolean b) {
            this.esCortesia = b;
            return this;
        }

        // ¿Qué principio SOLID acaban de cumplir sin proponérselo?: Principio Open / Closed

        // conFuncion, conAsiento, conCombo, conPuntos …
        public Compra build() {
            if(cliente == null){
                throw new IllegalStateException("Cliente no definido"); // Validacion 1
            }
            if(funcion == null){
                throw new IllegalStateException("Funcion no definido"); // Validacion 2
            }
            if(asientos == null){
                throw new IllegalStateException("Asientos no definidos"); // Validacion 3
            }

            return new Compra(this);
        }
    }
}
