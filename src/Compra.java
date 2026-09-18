import java.util.List;

public class Compra {
    private final Cliente cliente;
    private final Funcion funcion;
    private final List<String> asientos;
    private final Combo combo; // opcional
    private final int puntosRedimidos;

    // opcional
    private Compra(Builder b) {  }
    public static class Builder {
    // mismos campos, SIN final, con valores por defecto
        private Cliente cliente;
        private Funcion funcion;
        private List<String> asientos= new List<>();
        private Combo combo;
        private int puntosRedimidos=0;

        public Builder conCliente(Cliente c) {
            this.cliente = c;
            return this; // ¿qué va aquí y por qué?
        }
        public Builder conFunciones(Funcion f){
            this.funcion=f;
            return this;
        }
        public Builder conAsientos(String a){
            this,asientos.add(a);
            return this;
        }
        public Builder conCombo(Combo c){
            this.combo=c;
            return this;
        }
        public Builder conPuntosRedimidos(int p){
            this.
        }
        // conFuncion, conAsiento, conCombo, conPuntos …
        public Compra build() {
// VALIDACIÓN 1:

// VALIDACIÓN 2:

            return new Compra(this);
        }
    }
}
