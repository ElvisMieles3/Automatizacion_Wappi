#language: es
Característica: Prueba de registrar una experiencia laboral
  Como analista de calidad se desea validar el correcto
  funcionamiento de agregar una nueva experiencia.

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa las credenciales para ingresaru
      | usuario         | contrasena   |
      | usuarioLinkedin | usuario*2020 |

  Escenario: El usuario Elvis desea actualizar lo informaciòn personal
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre       | apellido      | fechaNacimiento | pais     | sexo      | urlImagen                       |
      | Elvis Miguel | Mieles Guarin | 04/03/1996      | Colombia | masculino | C:\Users\Navelis Mieles\Desktop |

    Entonces el deberia ver el mensaje Tu información se guardó correctamente