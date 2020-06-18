# Introduccion a Spring - Picas y Famas

### Autor: Carlos Andrés Ramírez Torres
### Fecha: Miercoles, 17 de Junio del 2020
##### LOC/h: 2019/16 = 126.18 LOC/h

## Picas y Famas

Es un juego que consiste en adivinar un numero generado aleatoriamente mediante una serie de intentos, cada intentos genera un resultado dependiendo del numero de aciertos realizados por el jugador, sus estados y reglas son las siguientes.

* **Famas:** Una fama representa que un numero puesto por el jugador es igual y se encuentra en la posicion exacta del numero generado aleatoriamente.
* **Picas:** Una pica representa que un numero puesto por el jugador se encuentra en en numero generado aleatoriamente pero en una posicion distinta.
* **Ganador:** Para ganar el juego se debe conseguir que todos los numeros sean famas.

## Link de heroku para jugar.

[https://famasypicas.herokuapp.com/](https://famasypicas.herokuapp.com/)

## Uso 

Para el desarrollo del proyecto se utilizo **Maven** como una herramienta para la construccion y gestion del mismo, el codigo fue desarrollado con el lenguaje de programación **Java** y framework **Spring**.

Utilizar `mvn package` para la generacion del fichero .jar con los .class compilados.

![Texto alternativo](https://github.com/CAndresRa/ARSW-QuintoLaboratorio/blob/master/ImgReadme/mvn%20package.png)

Una vez realizado el `mvn package` el codigo estara listo para ser utilizado bajo la siguiente estructura.

Debido a que es un proyecto que utiliza como framework **Spring**, la manera de ejecutarlo en conjunto a **Maven** es mediante el siguiente comando en terminal.
 
`mvn spring-boot:run`

por ejemplo y dando como resultado:

![Texto alternativo](https://github.com/CAndresRa/ARSW-QuintoLaboratorio/blob/master/ImgReadme/mvn%20spring.png)


## Diagrama

* Aplicación 

![Texto alternativo](https://github.com/CAndresRa/ARSW-QuintoLaboratorio/blob/master/ImgReadme/Diagrama.png)

El diagrama muestra que la clase **PicayFamaApplication** inicializa el framework de spring, mediante un controlador (controller) llamado **PicaFamaController** se gestionan las solicitudes por parte del cliente, en el que vemos que puede realizar 3 acciones principales **generar un numero aleatorio**, **recibir los intentos del cliente y validarlos** y **reiniciar el juego**, las solicitudes se realizan por medio de una pagina web html que utiliza scripts en javascript para comunicarse adecuadamente con el back de la aplicacion web, **PicaFamaController** genera una instancia del ***IPicaFamaService*** que es la interfaz que permite mediante el servicio **PicasFamasService** realizar las acciones anteriormente mencionadas.

## Pruebas 


Se han realizado un **total de 8** pruebas en donde se contemplan distintos escenarios que muestran que el codigo es correcto, entre las pruebas se probaron los siguientes eventos:

* Conteo correcto de Famas.
* Conteo correcto de Picas.
* Estado ganador del juego.
* Conteo correcto en caso de ningun acierto.


* Pruebas implementadas

![Texto alternativo](https://github.com/CAndresRa/ARSW-QuintoLaboratorio/blob/master/ImgReadme/test%20intellij.png)

* Utilizando el comando de `mvn test`

![](https://github.com/CAndresRa/ARSW-QuintoLaboratorio/blob/master/ImgReadme/mvn%20test.png)

