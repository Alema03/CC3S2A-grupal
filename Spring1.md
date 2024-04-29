# I. Microcarta del Proyecto

### Título del Proyecto: 

QueenPlay

### Visión: 

QueenPlay aspira a ofrecer a los entusiastas de los juegos de mesa la experiencia de jugar damas americanas, proporcionando una plataforma accesible e intuitiva que fomente la diversión y el desafío estratégico que tanto les apasiona.

### Misión: 

Nuestra misión es desarrollar una aplicación que permita a los jugadores disfrutar de partidas de damas americanas, ofreciendo funciones de gestión de cuentas de usuario, partidas registradas y la posibilidad de jugar contra otros usuario o bots, todo ello siguiendo estrictamente las reglas de dicho juego.

### Elevator Pitch: 

QueenPlay es una aplicacion para usuarios que ofrece la oportunidad de disfrutar de partidas de damas americanas en cualquier momento y lugar. Con características intuitivas y opciones para todos los niveles de habilidad, QueenPlay es el destino ideal para los amantes de este clásico juego de estrategia. Nuestra plataforma intuitiva y accesible te garantiza horas de diversión sin importar tu nivel de experiencia.

### Alcance:
- Desarrollar una aplicación  que simula jugar damas americanas desde una app local.

- Implementar un sistema de gestión de cuentas de usuario para registro, inicio de sesión, cierre de sesión y almacenamiento seguro de información, así como estadísticas relacionadas.

- Registrar y almacenar los detalles de cada juego, incluyendo fecha, hora, oponente, movimientos realizados y resultado.

- Permitir a jugar contra otros usuarios de la plataforma o contra un bot que cuenta con niveles de dificultad, siguiendo estrictamente las reglas del juego.

- Brindar algunas pautas de juego para los usuarios principiantes que no saben completamente las reglas.

- Proveer de opciones de movimientos recomendables si es que el jugador lo requiere cuando juega contra un bot.

### Objetivos:

- Desarrollar y lanzar una versión funcional de la aplicación en un plazo de 3 meses, enfocándose en la calidad del software y la experiencia del usuario.

- Cumplir con la implementación en los plazos establecidos siguiendo prácticas de una buena gestión de proyectos.

- Atraer una cantidad considerable de usuarios activos en los primeros 3 meses después del lanzamiento, mediante estrategias de marketing efectivas y una interfaz atractiva.

- Garantizar la seguridad de los datos de los usuarios implementando medidas robustas contra ataques de seguridad, como la inyección SQL, y asegurando el almacenamiento seguro de contraseñas.

- Mejorar continuamente la aplicación mediante actualizaciones regulares basadas en retroalimentación de usuarios y evaluaciones internas de desempeño.

- Establecer una estrategia de monetización sostenible, explorando modelos de negocio como publicidad en la plataforma, suscripciones premium y ventas de artículos virtuales dentro del juego.

### Clientes y usuarios:

- Equipo de Desarrollo de Software

- Usuarios finales de la aplicación (jugadores de damas)

- Equipo de Control de Calidad y Pruebas

- Equipo de Marketing y Promoción


### Riesgos: 

Algunos riesgos potenciales incluyen la competencia con otras plataformas de juegos en línea, problemas de seguridad de datos, problemas de usabilidad y experiencia del usuario, así como desafíos en la adquisición y retención de usuarios.

### Autores:

- Cleber Aguado
- Marcelo Nuñez
- Maycoll Escobar


# II. Historias de usuarios
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre de la historia de usuario</th>
            <th>Descripción de la historia de usuario</th>
            <th>Prioridad</th>
            <th>Esfuerzo estimado (horas)</th>
            <th>Esfuerzo real (si se completa)</th>
            <th>Estado (completado, pendiente, en curso )</th>
            <th>Desarrollador</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1</td>
            <td  align="center">Registro de Usuario</td>
            <td align="center">Como usuario nuevo, necesito crear una cuenta en la aplicación 
              con mi nombre de usuario, dirección de correo electrónico y contraseña para 
              poder acceder a todas las funciones y servicios disponibles en la aplicación.
            </td>
          <td align="center">Media</td>
          <td align="center">4 horas</td>
          <td align="center">3 horas</td>
          <td align="center">En curso</td>
          <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">2</td>
            <td  align="center">Inicio de Sesión</td>
            <td align="center">Como usuario registrado, necesito poder iniciar sesión en 
              mi cuenta utilizando mi nombre de usuario y contraseña para poder acceder 
              a mi cuenta y utilizar todas las funcionalidades disponibles
            </td>
          <td align="center">Media</td>
          <td align="center">4 horas</td>
          <td align="center">3 horas</td>
          <td align="center">En curso</td>
          <td align="center">Marcelo Nuñez</td>
          <tr>
            <td align="center">3</td>
            <td  align="center">Visualización del Tablero</td>
            <td align="center">Como jugador, necesito ver el tablero de damas en línea con las posiciones de 
              las piezas para ambos jugadores , para poder planificar y ejecutar mis 
              movimientos durante el juego de manera efectiva.
            </td>
          <td align="center">Alta</td>
          <td align="center">8 horas</td>
          <td align="center">9 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
      <tr>
            <td align="center">4</td>
            <td  align="center">Registro de Usuario</td>
            <td align="center">Como jugador, necesito colocar mis piezas en el tablero de 
              acuerdo con las reglas del juego de damas para comenzar la partida en la aplicación.
            </td>
          <td align="center">Alta</td>
          <td align="center">10 horas</td>
          <td align="center">8 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
        </tr>
    </tbody>
</table>

# III. Criterios de Aceptación (AC)








<table>
    <thead>
        <tr>
            <th>ID y nombre de la historia del usuario</th>
            <th>AC ID</th>
            <th>Descripción del criterio de aceptación</th>
            <th>Estado (completado, pendiente, en progreso)</th>
            <th>Desarrollador</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td rowspan=6 align="center">1 Registro de Usuario</td>
            <td rowspan=6 align="center">1.1 Creación exitosa de una cuenta de usuario válida</td>
            <td align="left">Dado que soy un usuario nuevo en la aplicación</td>
            <td rowspan=6 align="center">En progreso</td>
            <td rowspan=6 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="left">Cuando ingreso un nombre de usuario único</td>
        </tr>
        <tr>
            <td align="left">Y proporcionó una dirección de correo electrónico válida</td>
        </tr>
        <tr>
            <td align="left">Y seleccione una contraseña segura</td>
        </tr>
        <tr>
              <td align="left">Entonces el sistema debería permitirme crear una cuenta</td>
          </tr>
        <tr>
              <td align="left">Y debería darme acceso a todas las funciones y servicios disponibles en la aplicación.</td>
          </tr>
        <tr>
            <td rowspan=5 align="center">2 Inicio de Sesión</td>
            <td rowspan=5 align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="left">Dado que soy un usuario registrado en la aplicación</td>
            <td rowspan=5 align="center">En progreso</td>
            <td rowspan=5 align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="left">Cuando ingreso mi nombre de usuario y contraseña válidos en el formulario de inicio de sesión</td>
        </tr>
        <tr>
            <td align="left">Y hago clic en el botón de iniciar sesión</td>
        </tr>
        <tr>
            <td align="left">Entonces el sistema debería permitirme acceder a mi cuenta</td>
        </tr>
        <tr>
              <td align="left">Y debería darme acceso a todas las funcionalidades disponibles en la aplicación.</td>
          </tr>
          <tr>
            <td rowspan=4 align="center">3 Visualización del Tablero</td>
            <td rowspan=4 align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="left">Dado que soy un jugador en la plataforma de damas en línea</td>
            <td rowspan=4 align="center">En progreso</td>
            <td rowspan=4 align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="left">Cuando accedo al juego</td>
        </tr>
        <tr>
            <td align="left">Entonces el sistema debería mostrarme un tablero de damas con las posiciones de las piezas para ambos jugadores</td>
        </tr>
        <tr>
            <td align="left">Y las piezas de ambos jugadores deberían estar claramente diferenciadas</td>
        </tr>
        <tr>
            <td rowspan=4 align="center">4 Colocación de Piezas</td>
            <td rowspan=4 align="center">4.1 Colocación inicial de piezas en el tablero de acuerdo con las reglas del juego de damas</td>
            <td align="left">Dado que soy un jugador en la aplicación de damas en línea.</td>
            <td rowspan=4 align="center">En progreso</td>
            <td rowspan=4 align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="left">Cuando inicio una partida</td>
        </tr>
        <tr>
            <td align="left">Entonces el sistema debería colocar mis piezas en el tablero siguiendo las reglas del juego de damas.</td>
        </tr>
        <tr>
            <td align="left">Y las piezas deberían estar distribuidas en las casillas correctas según la configuración inicial del juego.</td>
        </tr>
    </tbody>
</table>

# IV. Tareas de implementación
<table>
    <thead>
        <tr>
            <th>ID y nombre de la historia del usuario</th>
            <th>AC ID </th>
            <th>Nombre(s) de clase</th>
            <th>Nombre(s) del método</th>
            <th>Desarrollador</th>
            <th>Estado</th>
            <th>Notas (opcional)</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1 Registro de Usuario</td>
            <td align="center">1.1 Creación exitosa de una cuenta de usuario válida</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">2 Inicio de Sesión</td>
            <td align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">4 Colocación de Piezas</td>
            <td align="center">4.1 Colocación inicial de piezas en el tablero de acuerdo con las reglas del juego de damas</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
    </tbody>
</table>

Resumen del código de prueba automatizado (que corresponde directamente a algunos criterios de aceptación)

<table>
    <thead>
        <tr>
            <th>ID y nombre de la historia del usuario</th>
            <th>AC ID </th>
            <th>Nombre(s) de clase del código de prueba</th>
            <th>Nombre(s) del método del código de prueba</th>
            <th>Descripción del caso de prueba (entrada y salida esperada)</th>
            <th>Estado</th>
            <th>Desarrollador</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1 Registro de Usuario</td>
            <td align="center">1.1 Creación exitosa de una cuenta de usuario válida</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">2 Inicio de Sesión</td>
            <td align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">4 Colocación de Piezas</td>
            <td align="center">4.1 Colocación inicial de piezas en el tablero de acuerdo con las reglas del juego de damas</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
    </tbody>
</table>

Resumen de casos de prueba manuales (que corresponden directamente a algunos criterios de aceptación)

<table>
    <thead>
        <tr>
            <th>ID y nombre de la historia del usuario</th>
            <th>AC ID </th>
            <th>Entrada de caso de prueba</th>
            <th>Prueba de Oracle (resultado esperado)</th>
            <th>Estado</th>
            <th>Notas</th>
            <th>Desarrollador</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1 Registro de Usuario</td>
            <td align="center">1.1 Creación exitosa de una cuenta de usuario válida</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">2 Inicio de Sesión</td>
            <td align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">4 Colocación de Piezas</td>
            <td align="center">4.1 Colocación inicial de piezas en el tablero de acuerdo con las reglas del juego de damas</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
    </tbody>
</table>

Resumen de otras pruebas automatizadas o manuales (que no corresponden a los criterios de aceptación)

<table>
    <thead>
        <tr>
            <th>Número</th>
            <th>Entrada de prueba</th>
            <th>Resultado Esperado</th>
            <th>Nombre de clase del código de prueba</th>
            <th>Nombre del método del código de prueba</th>
            <th>Estado</th>
            <th>Desarrollador</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1 Registro de Usuario</td>
            <td align="center">1.1 Creación exitosa de una cuenta de usuario válida</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">2 Inicio de Sesión</td>
            <td align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">4 Colocación de Piezas</td>
            <td align="center">4.1 Colocación inicial de piezas en el tablero de acuerdo con las reglas del juego de damas</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
    </tbody>
</table>

# V. Acta de la reunión

Informe las actas de todas las reuniones, incluidas, entre otras: reunión de planificación de proyecto/sprint, backlog grooming, preparación del trabajo pendiente, reunión retrospectiva y sesión de programación en pareja.

<table>
    <thead>
        <tr>
            <th>Fecha</th>
            <th>Tiempo y duración</th>
            <th>Lugar</th>
            <th>Nombres de los participantes</th>
            <th>Propósito de la reunión</th>
            <th>Elementos de acción específicos</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td rowspan=3 align="center">25/03/2024</td>
            <td rowspan=3 align="center">1 hora</td>
            <td rowspan=3 align="center">Biblioteca FC</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Formación de grupo y planificación de actividades</td>
            <td align="left">Lectura de los sprints</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Creación de carpeta compartida para la edición de documentos</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Investigación sobre las reglas y diferencias del juego de damas</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">27/03/2024</td>
            <td rowspan=3 align="center">30 min</td>
            <td rowspan=3 align="center">Biblioteca FC</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Creación del repositorio del grupo</td>
            <td align="left">Elección de representante del grupo</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Lectura de actividad dada en clase</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Práctica de uso de commits y edición</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">29/03/2024</td>
            <td rowspan=3 align="center">1 hora</td>
            <td rowspan=3 align="center">Meet</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Debate sobre implementación y software a utilizar</td>
            <td align="left">Investigar sobre la viabilidad de hacer una app o una página</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Elección del lenguaje a utilizar</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Elección de IDE a utilizar</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">2/04/2024</td>
            <td rowspan=3 align="center">2 hora</td>
            <td rowspan=3 align="center">Meet</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Repartir el trabajo del Sprint 1 y mejorar lo hecho en clase y presentación de avance</td>
            <td align="left">Actualización de Microcarta, historias de uso y criterios de aceptación</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Presentación de avance de desarrollo de código</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Revisión y corrección de códigos y colaboración para la resolución de los problemas o dudas</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">6/04/2024</td>
            <td rowspan=3 align="center">2 hora</td>
            <td rowspan=3 align="center">Meet</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Concluir el Sprint 1</td>
            <td align="left">Revisar las actividades requeridas así como la implementación primitiva.</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Lectura grupal del Spring 1</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Grabación de vídeo de presentación de avance</td>
        </tr> 
    </tbody>
</table>

### Decisiones clave:
- Lenguaje de programación: JAVA
- Guía de estilo de programación:Prácticas de colaboración y revisión de código
- IDE: Android Studio
- Sitio de alojamiento del proyecto: Repositorio Grupal
- Horario habitual de reunión: 8:00 pm

# VI. Calificaciones de amigos

<table>
    <thead>
        <tr>
            <th> </th>
            <th>Cleber Aguado</th>
            <th>Marcelo Nuñez</th>
            <th>Maycoll Escobar</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">Cleber Aguado</td>
            <td align="center"></td>
            <td align="center">17</td>
            <td align="center">17</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="center">17</td>
            <td align="center"></td>
            <td align="center">16</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="center">17</td>
            <td align="center">18</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td align="center">Promedio</td>
            <td align="center">17</td>
            <td align="center">17.5</td>
            <td align="center">16.5</td>
        </tr>
    </tbody>
</table>

