# BodegaeSemaforo

****
Integrantes | Código
--- | --- | ---
Dylan Torres | 12103021 
Esteban Durán | 12103025 
****
##Descripción de la solución

SE MANEJAN EN ESTA VERSIÓN SEMAFOROS
Se tiene en cuenta un semaforo Mutex para regular el acceso a los recursos, un semaforo para la capacidad de la bodeha y dos semaforos uno para la cantidad de articulos tipo 1 y uno para la cantidad de articulos tipo 2.

La clase programa es la que inicializa los procesos (hilos) del empacador y el operario que son los encargados de crear y descargar los paquetes respectivamente. El método descargar artículo recibe un parámetro boolean indicando que tipo de paquete es, true para 1, false para 2.

###Problema
La capacidad de la bodega es de 200m3.
En la bodega se pueden colocar dos tipos de artículos, tipo 1 de volumen 10m3 y tipo 2 de 15m3.
Cada vez se coloca un artículo, puede ser descargarArticulo(1) o descargarArticulo(2).
Para crear un paquete el empacador necesita 3 artículos tipo 1 y 4 tipo 2, si no los hay debe esperar.


##Diagrama de Clases Empleado para la solución
![alt text](https://github.com/dylan9538/BodegaeSemaforo/blob/master/DiagramClassSemaforo.PNG "Diagrama de clases")
****

##Pantallazos Solución

![alt text](https://github.com/dylan9538/BodegaeSemaforo/blob/master/Prueba1.PNG "Diagrama de clases")
![alt text](https://github.com/dylan9538/BodegaeSemaforo/blob/master/Prueba2.PNG "Diagrama de clases")
![alt text](https://github.com/dylan9538/BodegaeSemaforo/blob/master/Prueba3.PNG  "Diagrama de clases")
