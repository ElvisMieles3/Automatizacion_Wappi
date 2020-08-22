#language: es
Característica: Prueba de solicitar una orden
  Como analista de calidad se desea validar y verifica el correcto
  funcionamiento de realizar un pedido con y sin cupòn de bienvenida

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa las credenciales para ingresar
      | usuario         | contrasena   |
      | usuarioLinkedin | Usuario*2019 |


  Escenario: El usuario Elvis desea realizar una orden sin cupòn
    Cuando selecciona el producto
      | nombreProducto |
      | Jamón Premium  |
    Entonces el deberia ver el siguiente mensaje Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
    Cuando se encuentra observando
      | sitio      |
      | misPedidos |
    Entonces  debe ver el producto Jamón Premium
