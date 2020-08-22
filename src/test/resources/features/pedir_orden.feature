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
    Entonces el deberia ver el mensaje en la alerta Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
    Entonces  en la ventana de Mis pedidos debe estar el producto Jamón Premium