#language: es
Característica: Registrar los datos personales
  Como analista de calidad se desea validar el correcto
  funcionamiento de actualizar informaciòn personal.

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa las credenciales para ingresar
      | usuario         | contrasena   |
      | usuarioLinkedin | Usuario*2019 |

  Escenario: El usuario Elvis desea actualizar lo informaciòn personal
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre       | apellido      | fechaNacimiento | pais     | sexo      | imagen                       |
      | Elvis Miguel | Mieles Guarin | 04/03/1996      | Colombia | masculino | naranja.jfif |

    Entonces el deberia ver el mensaje Tu información se guardó correctamente

