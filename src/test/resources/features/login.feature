Feature: yo como usuario del servicio
  Necesito ingresar a la aplicaciòn Wappi
  Para estar registrado en el sistema

  Scenario: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el ingresa las credenciales para ingresar
      | usuario         | contrasena   |
      | usuarioLinkedin | Usuario*2019 |
    Then el usuario debe ver el mensaje Ofertas