#language: es
Característica: Registrar los datos personales
  Como analista de calidad se desea validar el correcto
  funcionamiento de actualizar informaciòn personal.

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa las credenciales para ingresar
      | usuario     | contrasena    |
      | ElvisMieles | _M1elesG*2019 |

  Esquema del escenario: : El usuario Elvis desea actualizar lo informaciòn personal correctamente
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre   | apellido   | fechaNacimiento   | pais   | sexo   | imagen   |
      | <nombre> | <apellido> | <fechaNacimiento> | <pais> | <sexo> | <imagen> |

    Entonces el deberia ver el mensaje <mensaje>

    Ejemplos: Datos

      | nombre       | apellido      | fechaNacimiento | pais     | sexo      | imagen       | mensaje                                |
      | Elvis Miguel | Mieles Guarin | 04/03/1996      | Colombia | masculino | naranja.jfif | Tu información se guardó correctamente |


  Esquema del escenario: El usuario Elvis desea actualizar la informaciòn sin la imagen
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre   | apellido   | fechaNacimiento   | pais   | sexo   | imagen   |
      | <nombre> | <apellido> | <fechaNacimiento> | <pais> | <sexo> | <imagen> |

    Entonces el deberia ver en el campo de la imagen un mensaje <mensaje>

    Ejemplos: Datos

      | nombre       | apellido      | fechaNacimiento | pais     | sexo      | imagen        | mensaje                 |
      | Elvis Miguel | Mieles Guarin | 04/03/1996      | Colombia | masculino |               | La imagen es requerida  |
      | Elvis Miguel | Mieles Guarin | 04/03/1996      | Colombia | masculino | pruebapdf.pdf | El archivo no es valido |


  Esquema del escenario: El usuario Elvis desea actualizar la informaciòn sin el campo nombre
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre   | apellido   | fechaNacimiento   | pais   | sexo   | imagen   |
      | <nombre> | <apellido> | <fechaNacimiento> | <pais> | <sexo> | <imagen> |

    Entonces el deberia ver en el campo de la nombre un mensaje <mensaje>

    Ejemplos: Datos

      | nombre        | apellido      | fechaNacimiento | pais     | sexo      | imagen       | mensaje                        |
      |               | Mieles Guarin | 04/03/1996      | Colombia | masculino | naranja.jfif | El nombre es requerido         |
      | .             | Mieles Guarin | 04/03/1996      | Colombia | masculino | naranja.jfif | El nombre debe ser solo letras |
      | Elvis Mi.guel | Mieles Guarin | 04/03/1996      | Colombia | masculino | naranja.jfif | El nombre debe ser solo letras |

  Esquema del escenario: El usuario Elvis desea actualizar la informaciòn sin el campo Apellido
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre   | apellido   | fechaNacimiento   | pais   | sexo   | imagen   |
      | <nombre> | <apellido> | <fechaNacimiento> | <pais> | <sexo> | <imagen> |

    Entonces el deberia ver en el campo de apellido un mensaje <mensaje>

    Ejemplos: Datos

      | nombre       | apellido       | fechaNacimiento | pais     | sexo      | imagen       | mensaje                          |
      | Elvis Miguel |                | 04/03/1996      | Colombia | masculino | naranja.jfif | El apellido es requerido         |
      | Elvis Miguel | .              | 04/03/1996      | Colombia | masculino | naranja.jfif | El apellido debe ser solo letras |
      | Elvis Miguel | Miele.s Guarin | 04/03/1996      | Colombia | masculino | naranja.jfif | El apellido debe ser solo letras |

  Esquema del escenario: El usuario Elvis desea actualizar la informaciòn sin el campo Fecha de nacimiento
    Dado que el usuario se encuentra en la pantalla de Información Personal y digita los datos
      | nombre   | apellido   | fechaNacimiento   | pais   | sexo   | imagen   |
      | <nombre> | <apellido> | <fechaNacimiento> | <pais> | <sexo> | <imagen> |

    Entonces el deberia ver en el campo de fecha de nacimiento un mensaje <mensaje>

    Ejemplos: Datos

      | nombre       | apellido      | fechaNacimiento | pais     | sexo      | imagen       | mensaje                                   |
      | Elvis Miguel | Mieles Guarin |                 | Colombia | masculino | naranja.jfif | La fecha de nacimiento es requerida       |
      | Elvis Miguel | Mieles Guarin | 4-Marzo-1996    | Colombia | masculino | naranja.jfif | La fecha debe tener el formato dd/mm/yyyy |
      | Elvis Miguel | Mieles Guarin | 04/Marzo/1996   | Colombia | masculino | naranja.jfif | La fecha debe tener el formato dd/mm/yyyy |
      | Elvis Miguel | Mieles Guarin | 04/Marzo/2021   | Colombia | masculino | naranja.jfif | La fecha incorrecta                       |