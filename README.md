# Automatizacion_Wappi

Se realizar la automatización de la aplicación Wappi que se encarga del delivery de comidas, por medio de url https://automation-wappi.vercel.app/login. se desea validar y verificar el correcto funcionamiento de las funcionalidades.

 1.Actualización de informaciòn dentro del perfil
 2.Pedir una orden con y sin el cupón de bienvenida
Comenzando ✒️

Con este proyecto se desea realizar una automatización WEB basandonos en los principios SOLID y FIRST, para un mejor entendimiento en los resportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Maven.

Pre-requisitos 📋

Para la ejecución de este proyecto desdemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:

JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files (x86)\Java\jdk1.8.0_251 MAVEN_HOME: Descarga el Apache Maven y se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3

Tener un IDEA instalado para la observación o modificación del codigo.

En la raiz de proyecto debemos tener 3 archivos, los cuales son:

serenity.properties
sonar-project.properties
chromedriver.exe : Este archivo debe ser compatible con la versiòn que se tenga en la maquina; en este caso es ChromeDriver 84.0.4147.30
Ejecutando las pruebas ⚙️

Para la ejecución del proyecto debe tener presente que las variables de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas la cual se encuentra en el archivo pom.xml.

La prueba se puede ejecutar por medio del package runners, la cual esta ubicada en src\test\java\co\certificacion\automatizacion\runner o por medio de la consola del proyecto con el comando mvn clean verify

Para observar las evidencias de las pruebas debemos ejecutar el script y ingresar a la ruta target\site\serenity , allí buscamos archivo Index que encontramos en la carpeta.

Analizar el codigo con Sonarqube ⌨️️

En la raiz del proyecto debemos de poner el sonar-project.properties, para poder realizar el analisis del codigo.

Los pasos a seguir son:

En el cmd de la carpeta del proyecto ejecutamos el comando starSonar. Abrir el cmd y ejecutamos el comando StartSonar Abrir en el navegador la URL http://localhost:9000/about En la carpeta del proyecto se procede abrir el cmd y se ejecuta el comando sonar -scanner , en otra ventana del mismo proyecto ejecuto el cmd el comando sonar-scanner Ingresar a la URL http://localhost:9000/about para analizar el resultado.