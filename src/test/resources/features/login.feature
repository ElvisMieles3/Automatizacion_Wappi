Feature: Login
  Necesito ingresar a la aplicaciòn Wappi
  Para estar registrado en el sistema

  Scenario Outline: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el ingresa las credenciales para ingresar
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then el usuario debe ver el mensaje <mensaje>

    Examples: Datos
      | usuario         | contrasena   | mensaje |
      | usuarioLinkedin | Usuario*2019 | Ofertas |