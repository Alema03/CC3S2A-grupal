# Proyecto de equipo CC 3S2 (Resumen)
Busca desarrollar software limpio, confiable y seguro a través de un proceso incremental iterativo
## 1. Equipo
- grupo de 2 0 3 miembros --> Cleber, Alejandro, Marcelo
- nombre de equipo --> "LOADING"
- coordinador --> Cleber (se brindó toda la info al delegado del curso)
## 2. Problema
- Desarrollar un software que simule el juego de mesa de damas americanas --> variante elegida: https://en.wikipedia.org/wiki/English_draughts
- Se deben aclarar las reglas (reglas elegidas) (se tomaran cuestionarios de las reglas generales)
<br>---- aquí van el resumen de reglas elegidas ----</br>
- No se debe plagiar código de ninguna forma posible (será sancionado de manera ejecutiva)
- Notación algebraica </br> ![Imagen referencial no prepietaria](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/English_draughts_notation.png/220px-English_draughts_notation.png)
- Requisitos:

indice | descripción
-------|------------- 
1 | Aplicación Móvil
2 | base de datos relacional PostgrestSQL: gestión de cuentas de usuario (nombre de usuario(politicas), correo electrónico, contraseña (politicas))
3 | Funciones mínimas: registro de usuario, inicio de sesión, cierre de sesión, juego, grabación del juego (fecha, hora, oponente, todos los movimientos, resultado) y repetición
4 | Politicas:  requisitos de seguridad como contraseña segura, cifrada, (ataques de inyección SQÑ)
5 | usuario en sesión puede jugar contra otro usuario en sesión o el ordenador
6 | considerar extensibilidad a otras variantes del juego (pero no se pedirá variantes)
7 | Lenguaje de programación POO (maximizar prácticas) de propósito general JAVA 
8 | Marco de prueba unitario JUnit
9 | Alojamiento público GITHUB y sistema de control de versiones GIT
## 3. Entegables (spints)
- Para cada sprint las  condiciones mínima de "Definiciones de hecho" para la implementación de la historia de usuario incluyendo la aprobación de todos los criterior de aceptación (a través de pruebas de automatización y realización completa de pruebas manuales) y la aprobación de todas las pruebas a nivle de unidad, además de la documentación requerida
- Demostración del software funcional, además de un informe (incluye los principales artefactos de software)
- Demostración de cumplimiento de defiiciones de hecho, además mostrar característica única o mejoras, Plantillas e informe (incrementales mejorados) son en documentación separada.
- Se debe presentar para cada sprint un video de 15 min para mostrar que código cumple condiciones mínimas
#### **sprint 1:** 7 abril | Demostración 5% informe 10%
1. crear un plan de proyecto
2. especificar requisitos del producto objetivo en términos de historias de usuario y cirterios de aceptación
3. implementar funciones básicas: registro de usuario, inico de sesión, cierre de sesión, y visualización del nuevo tablero de juego. OBS: board separada de su interfaz gráfica de usuario
#### **sprint 2:** 17 abril | Demostración 10% informe 25%
todas la funciones  para usuario en sesión pueda jugar contra otro usuario en sesion, guardar juego, recuper el registro del juego, y tranmita un juego.
#### **sprint 3:** 29 de abril | De0ostración 20% informe 30%
usuario en sesión pueda jugar contra ordenador. La computadora de intentar de vencer al humano (3 niveles)
##### **adicionales** 3% adicional calificaicón final
1. calidad de software
2. otras mejoras
3. informe excepcionalmente escritos
4. impresión del proyecto
## 4. Sugerencias adicionales
1. Antes de la reunión:
   - comoprender el juego-
   - leer la documentación
   - tratar de convertirse en buen jugador
3. Durante la reunión:
   - disscusión de la lógica (buscar ejemplos en línea)
   - analizar los requisitos del proyecto
   - decidir herrameintas: lenguaje, IDE, marco de pruebas unitarias, estilo de programación
   - elegir un sitio de alojamiento
   - programar reuniones y el medio de comunicación
   - crear lista de elementos de acción y asignar tareas específicas.
5. Después de la reunión:
   - editar y aprobar las actas de la reunión por parte de todo el equipo
