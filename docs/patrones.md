Programacion 2
Realizado por Andres David Santafe Lopez y 
Juan Diego Quitian Rengifo

PARTE 3

a)La principal preocupación al momento de usar singleton en cuanto al principio DIP es que cuando las clases que manejan la lógica de negocio necesite la instancia , la cual está en una clase concreta, pueda depender de más en el funcionamiento del programa

b) El método getInstancia() debe aparecer en la clase donde se vaya a aplicar singleton en este caso ConsecutivoFactura y debe ser llamada solamente por la clase main y de ahí el objeto es inyectado por el constructor.

c) En el caso de singleton el constructor es privado para impedir que otras clases, a parte de ella, puedan crear nuevas instancias
En el caso de Builder funciona para que ninguna instancia u objeto sea creado sin antes ser validado por el

d) Asiento: no, porque tiene solo dos atributos obligatorios entonces no es necesario
Función: si, ya que necesita validar los datos de la función antes de crearla
Cliente: sí, ya que se necesita validar su información antes de crear un nuevo cliente
Combo: no, debido a que no tiene tantos atributos obligatorios.


e) En este caso es incorrecto, debido a que si el builder de compra requiere IVA debería recibir ese dato desde fuera y no depender de una instancia para obtenerlo