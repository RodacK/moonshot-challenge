# Moonchot Challenge

## 1. Requisitos previos

1.1. Se debe tener el jdk 17
 
1.2. Se debe tener docker instalado

## 2. Como correr?

2.1. En su terminal correr

    /bin/bash run.sh

Nota: este se encargará de descargar y configurar las imagenes y contenedores necesarios.
Tambien de migrar los script para la bd, configurar el cliente soap y levantar nuestra app

Si hay algun inconveniente: calderonr.robinson@gmail.com

2.2. una vez terminada la ejecucion del script puede ejecutar

2.2.1. Crear employee:

    curl --location 'localhost:8081/employee/add' \
    --header 'Content-Type: application/json' \
    --data '{"position":"mangaer", "name":"rob", "salary": "1000"}'

2.2.2. Obtener employee:

    curl --location 'localhost:8081/employee/1'

## 3. Algunas anotaciones

3.1 Inconvenientes:

3.1.1. Cuando se generan los archivos java a pariir del wsdl, se crea una jerarquia de packages que no deberia.
Se podria solucionar creando un task que dependa despues de ejecutada la tarea wsdl2java
para que mueva los archivos correctamente

3.1.2. el repo de calculus-ws tenia problemas al generar la imagen docker, se pudo solucionar cambiando partes del Dockerfile

3.1.3. Hay un problema con flyway debido a que la version que esta actualmente no soporta IF NOT EXISTS y oracle 23 ya lo soporta.
Se podria mejorar el script con otro tipo de validacion como omitir el error ORA que genera para que la migracion corra sin problemas

3.2 Posibles mejoras:

3.2.1. Se podrian agregar logs y codigos de error en mas partes para mejor trazabilidad

3.2.2. Se podrian agregar interfaces en el service, package-info pero por el tipo de proyecto no fue necesario

3.2.3. No usé dtos porque la info es la misma entre clases y solo necesitaba hacer mappers

3.2.4. se peude mejorar el almacenamiento de passwords con trufflehawk o algun tool como vault

3.2.5. Se puede mejorar le network entre imagenes con docker network



