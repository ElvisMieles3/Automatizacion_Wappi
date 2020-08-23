#language: es
Característica: Solicitar una orden
  Como analista de calidad se desea validar y verifica el correcto
  funcionamiento de realizar un pedido con y sin cupòn de bienvenida

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa las credenciales para ingresar
      | usuario         | contrasena   |
      | usuarioLinkedin | Usuario*2019 |


  Escenario: El usuario Elvis desea realizar una orden sin cupòn
    Cuando selecciona el producto sin cupon
      | nombreProducto |
      | Jamón Premium  |
    Entonces el deberia ver el siguiente mensaje Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
    Cuando se encuentra observando
      | sitio      |
      | misPedidos |
    Entonces  debe ver el producto Jamón Premium


  Escenario: El usuario Elvis desea realizar una orden usando el cupòn
    Cuando selecciona el producto con cupon
      | nombreProducto |
      | Jamón Premium  |
    Entonces el deberia ver el siguiente mensaje Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
    Cuando se encuentra observando
      | sitio      |
      | misPedidos |
    Entonces  debe ver el producto Jamón Premium

  Escenario: El usuario Elvis desea realizar una orden usando el cupòn 3 veces
    Cuando selecciona tres producto con el mismo cupon
      | nombreProducto |
      | Jamón Premium  |
      | Jamón Premium  |
    Entonces en la página de cupones debe mostrar el siguiente mensaje No se encontraron registros


