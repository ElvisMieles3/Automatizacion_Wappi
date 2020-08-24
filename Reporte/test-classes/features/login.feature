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
      | usuarioLin      | Usuar*2019   | Ofertas |


  Scenario Outline: ingresar al sistema con un usuario incorrecto
    Given que Elvis esta en el portal
    When el ingresa las credenciales para ingresar
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then el usuario debe ver en el campo usuario el  mensaje <mensaje>

    Examples: Datos
      | usuario | contrasena | mensaje                                          |
      | .       | Polo*2019  | El usuario debe ser alfanumérico                 |
      | Elv     | Polo*2019  | El usuario debe contener entre 6 y 20 caracteres |


  Scenario Outline: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el ingresa las credenciales para ingresar
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then el usuario debe ver en el campo contraseña el  mensaje <mensaje>

    Examples: Datos
      | usuario     | contrasena | mensaje                                             |
      | ElvisMieles | .          | La contraseña debe contener entre 8 y 14 caracteres |


