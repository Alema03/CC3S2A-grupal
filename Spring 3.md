# I. Historias de usuarios actualizadas
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
            <td  align="center">Registrar un nuevo usuario</td>
            <td align="center">Como usuario nuevo, necesito crear 
              una cuenta en la aplicación con mi nombre de usuario, 
              dirección de correo electrónico,celular y contraseña 
              para poder acceder a todas las funciones y servicios 
              disponibles en la aplicación.
            </td>
          <td align="center">Baja</td>
          <td align="center">3 horas</td>
          <td align="center">3 horas</td>
          <td align="center">En curso</td>
          <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">2</td>
            <td  align="center">Iniciar sesión existente</td>
            <td align="center">Como usuario registrado, necesito poder 
              iniciar sesión en mi cuenta utilizando mi nombre de 
              usuario y contraseña para poder acceder a mi cuenta y 
              utilizar todas las funcionalidades disponibles.
            </td>
          <td align="center">Media</td>
          <td align="center">5 horas</td>
          <td align="center">6 horas</td>
          <td align="center">En curso</td>
          <td align="center">Marcelo Nuñez</td>
          <tr>
            <td align="center">3</td>
            <td  align="center">Iniciando Juego de damas</td>
            <td align="center">Como usuario del juego, quiero iniciar 
              la aplicación y ver el tablero con las piezas de dama 
              colocadas en las posiciones correctas para que pueda 
              empezar a jugar de inmediato.
            </td>
          <td align="center">Alta</td>
          <td align="center">8 horas</td>
          <td align="center">9 horas</td>
          <td align="center">En curso</td>
          <td align="center">Marcelo Nuñez</td>
        </tr>
      <tr>
            <td align="center">4</td>
            <td  align="center">Jugador realizando movimiento  de pieza</td>
            <td align="center">Como jugador, quiero hacer un movimiento legal 
              en el tablero de damas para que el juego progrese de acuerdo 
              con las reglas oficiales.
            </td>
          <td align="center">Alta</td>
          <td align="center">4 horas</td>
          <td align="center">4 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
      <tr>
            <td align="center">5</td>
            <td  align="center">Conversión a rey</td>
            <td align="center">Como jugador, quiero que mi pieza se convierta en 
              una pieza rey cuando llega a la última fila del tablero para que 
              pueda obtener más habilidades y movilidad en el juego.
            </td>
          <td align="center">Alta</td>
          <td align="center">5 horas</td>
          <td align="center">5 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">6</td>
            <td  align="center">Capturar pieza</td>
            <td align="center">Como jugador, quiero que mi pieza capture 
              la pieza del oponente cuando salta sobre ella para que pueda 
              avanzar y obtener una ventaja en el juego de damas.
            </td>
          <td align="center">Alta</td>
          <td align="center">5 horas</td>
          <td align="center">5 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
      <tr>
            <td align="center">7</td>
            <td  align="center">Humano vs Bot</td>
            <td align="center">Como jugador, quiero tener la opción de jugar 
              contra un bot para disfrutar del juego incluso cuando no hay 
              otros jugadores humanos disponibles.
            </td>
          <td align="center">Alta</td>
          <td align="center">5 horas</td>
          <td align="center">5 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
      <tr>
            <td align="center">8</td>
            <td  align="center">Finalizar juego</td>
            <td align="center">Como jugador, quiero que el juego 
              termine cuando un jugador captura la última pieza del 
              oponente, cuando no hay movimientos válidos restantes, o 
              cuando ambos jugadores acuerdan un empate para que el 
              resultado final se determine de manera clara y justa.
            </td>
          <td align="center">Alta</td>
          <td align="center">5 horas</td>
          <td align="center">5 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
    </tbody>
</table>

# II. Criterios de Aceptación (AC) actualizados

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
            <td rowspan=48 align="center">1 Registrar un nuevo usuario</td>
            <td rowspan=7 align="center">1.1 Registro exitoso de un nuevo usuario</td>
            <td align="left">Dado un nombre de usuario válido inexistente</td>
            <td rowspan=7 align="center">Hecho</td>
            <td rowspan=7 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="left">Cuando registro un usuario con este nombre de usuario</td>
        </tr>
        <tr>
            <td align="left">Y un Nombre y Apellido válidos</td>
        </tr>
       <tr>
            <td align="left">Y una contraseña válida que coincida con la contraseña confirmada</td>
        </tr>
       <tr>
            <td align="left">Y una dirección de correo electrónico válida</td>
        </tr>
       <tr>
            <td align="left">Y un número de teléfono válido</td>
        </tr>
        <tr>
            <td align="left">Entonces el sistema debe registrar un nuevo usuario.</td>
        </tr>
        <tr>
              <td rowspan=7 align="center">1.2 Registro de usuario fallido con un nombre de usuario existente</td>
              <td align="left">Dado un nombre de usuario válido que ya existe.</td>
              <td rowspan=7 align="center">Hecho</td>
              <td rowspan=7 align="center">Cleber Aguado</td>
        </tr>
      <tr>
               <td align="left">Cuando registro un usuario con este nombre de usuario.</td>
        </tr>
      <tr>     
          <td align="left">Y un Nombre y Apellido válidos.</td>
        </tr>
      <tr>
               <td align="left">Y una contraseña válida que coincida con la contraseña confirmada.</td>
        </tr>
      <tr>
               <td align="left">Y una dirección de correo electrónico válida .</td>
        </tr>
      <tr>
               <td align="left">Y un número de teléfono válido.</td>
        </tr>
      <tr>
               <td align="left">Entonces el sistema no debería registrar al nuevo usuario y mostrara mensaje de error.</td>
        </tr>
      <tr>
              <td rowspan=7 align="center">1.3 Registro de usuario fallido con contraseña no válida</td>
              <td align="left">Dado un nombre de usuario válido inexistente.</td>
              <td rowspan=7 align="center">Hecho</td>
              <td rowspan=7 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando registro un nuevo usuario con este nombre de usuario</td>
        </tr>
      <tr>
              <td align="left">Y un Nombre y Apellido válidos.</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que NO coincide con la contraseña confirmada</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que NO coincide con la contraseña confirmada.</td>
        </tr>
      <tr>
              <td align="left">Y un correo electrónico válido dirección y un número de teléfono válido.</td>
        </tr>
      <tr>
              <td align="left">Entonces el sistema no debería registrar al nuevo usuario y mostrar un mensaje de error.</td>
        </tr>
      <tr>
              <td rowspan=6 align="center">1.4 Registro de usuario fallido con contraseña válida</td>
              <td align="left">Dado un nombre de usuario válido inexistente.</td>
              <td rowspan=6 align="center">Hecho</td> 
              <td rowspan=6 align="center">Cleber Aguado</td>
      </tr>
      <tr>
              <td  align="left">Cuando registro un nuevo usuario con este nombre de usuario</td>
        </tr>
      <tr>
              <td align="left">Y un Nombre y Apellido válidos.</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que NO coincide con la contraseña confirmada.</td>
        </tr>
      <tr>
              <td align="left">Y un correo electrónico válido dirección y un número de teléfono válido.</td>
        </tr>
      <tr>
              <td align="left">Entonces el sistema no debería registrar al nuevo usuario y mostrar un mensaje de error.</td>
        </tr>
      <tr>
              <td rowspan=7 align="center">1.5 Registro de usuario fallido con dirección de correo electrónico no válida
</td>
              <td align="left">Dado un nombre de usuario válido inexistente.</td>
              <td rowspan=7 align="center">Hecho</td>
              <td rowspan=7 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando registro un nuevo usuario con este nombre de usuario</td>
        </tr>
      <tr>
              <td align="left">Y un Nombre y Apellido válidos.</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que coincide con la contraseña confirmada.</td>
        </tr>
      <tr>
              <td align="left">Y una dirección de correo electrónico NO válida.</td>
        </tr>
      <tr>
              <td align="left">Y un número de teléfono válido.</td>
        </tr>
      <tr>
              <td align="left">Entonces el sistema no debería registrar al nuevo usuario Y mostrar mensaje de error.</td>
        </tr>
         <tr>
            <td rowspan=7 align="center">1.6.Registro de usuario fallido con apellido no válido </td>
            <td align="left">Dado un nombre de usuario válido inexistente</td>
            <td rowspan=7 align="center">Hecho</td>
            <td rowspan=7 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="left">Cuando registro un nuevo usuario con este nombre de usuario</td>
        </tr>
        <tr>
            <td align="left">Y un Nombre y Apellido NO válidos.</td>
        </tr>
      <tr>
            <td align="left">Y una contraseña válida que coincide con la contraseña confirmada.</td>
        </tr>
      <tr>
            <td align="left">Y una dirección de correo electrónico válida.</td>
        </tr>
      <tr>
            <td align="left">Y un número de teléfono válido.</td>
        </tr>
      <tr>
            <td align="left">Entonces el sistema no debería registrar al nuevo usuario Y mostrar mensaje de error.</td>
        </tr>
      <tr>
              <td rowspan=7 align="center">1.7 Registro de usuario fallido con teléfono no válido</td>
              <td align="left">Dado un nombre de usuario válido inexistente.</td>
              <td rowspan=7 align="center">Hecho</td>
              <td rowspan=7 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando registro un nuevo usuario con este nombre de usuario</td>
        </tr>
      <tr>
              <td align="left">Y un Nombre y Apellido  válidos</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que coincide con la contraseña confirmada</td>
        </tr>
      <tr>
              <td align="left">Y una dirección de correo electrónico válida</td>
        </tr>
      <tr>
              <td align="left">Y un número de teléfono NO válido</td>
        </tr>
      <tr>
              <td align="left">Entonces el sistema no debería registrar al nuevo usuario Y mostrar mensaje de error</td>
        </tr>
      <tr>
              <td rowspan=11 align="center">2 Iniciar sesión existente</td>
              <td rowspan=4 align="center">2.1 Inicio de sesión exitoso del usuario </td>
              <td align="left">Dado un nombre de usuario válido existente.</td>
              <td rowspan=4 align="center">Hecho</td>
              <td rowspan=4 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando inicio sesión con este nombre de usuario</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que coincida con la contraseña establecida por el usuario</td>
        </tr>
      <tr>
              <td align="left">Entonces el sistema debería iniciar sesión con el usuario</td>
        </tr>
      <tr>
              <td rowspan=4 align="center">2.2  Inicio de sesión fallido de un usuario con contraseña no válida </td>
              <td align="left">Dado un nombre de usuario válido existente</td>
             <td rowspan=4 align="center">Hecho</td>
              <td rowspan=4 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando inicio sesión con este nombre de usuario</td>
        </tr>
      <tr>
              <td align="left">Y una contraseña válida que NO coincida con la contraseña establecida por el usuario</td>
        </tr>
        <tr>
              <td align="left">Entonces el sistema no debería iniciar sesión con el usuario y mostrar un mensaje de error</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">2.3  Inicio de sesión fallido de un usuario con un nombre de usuario no válido </td>
              <td align="left">Dado un nombre de usuario válido inexistente</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando inicio sesión con este nombre de usuario y una contraseña que coincide con la contraseña establecida por el usuario</td>
        </tr>
      <tr>
              <td align="left">Entonces el sistema no debería iniciar sesión con el usuario y mostrar un mensaje de error</td>
        </tr>
        <tr>
              <td rowspan=9 align="center">3 Inicio del Juego</td>
              <td rowspan=3 align="center">3.1 Inicio del Juego </td>
              <td align="left">Dado la aplicación del juego.</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando el usuario la inicia</td>
        </tr>
      <tr>
              <td align="left">Entonces se debe mostrar un tablero de damas con cuadrados de colores alternos ( blancos y verdes)</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">3.2  Colocación de las piezas de damas a bordo</td>
              <td align="left">Dado que el usuario ejecuta la aplicación.</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando el tablero de damas está cargado</td>
        </tr>
      <tr>
              <td align="left">Entonces las piezas de las damas deben estar dispuestas en su posición correcta.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">3.3  Lanzamiento para determinar quién juega primero </td>
              <td align="left">Dado un nombre de usuario válido inexistente</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando el tablero de damas está cargado</td>
        </tr>
      <tr>
              <td align="left">Entonces se abre un cuadro de diálogo de lanzamiento para determinar quién juega primero</td>
        </tr>
        <tr>
              <td rowspan=18 align="center">4 Jugador realizando movimiento  de pieza</td>
              <td rowspan=3 align="center">4.1 Primer movimiento de las negras </td>
              <td align="left">Dado un tablero de damas con piezas de damas</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando el jugador negro intenta hacer el primer movimiento del juego</td>
        </tr>
      <tr>
              <td align="left">Entonces negro debería poder mover su pieza a la posición deseada.</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">4.2  Primer movimiento inválido del rojo</td>
              <td align="left">Dado un tablero de damas con piezas de damas</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando el jugador rojo intenta hacer el movimiento cuando no es su turno</td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador no debería poder mover su pieza a la posición deseada</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">4.3  Realizar un movimiento válido </td>
              <td align="left">Dado el turno de un jugador para realizar un movimiento</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando un jugador intenta hacer un movimiento válido </td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador debería poder realizar un movimiento válido.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">4.4  Realizar un movimiento no válido</td>
              <td align="left">Dado el turno de un jugador para realizar un movimiento</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando un jugador intenta realizar un movimiento no válido</td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador no debería poder realizar un movimiento inválido</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">4.5  Realizar un movimiento válido con pieza de rey </td>
              <td align="left">Dado el turno de un jugador para hacer un movimiento</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando un jugador intenta hacer un movimiento válido usando la pieza rey </td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador debería poder realizar un movimiento válido</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">4.6  Realizar un movimiento no válido con pieza de rey</td>
              <td align="left">Dado el turno de un jugador para hacer un movimiento</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando un jugador intenta realizar una jugada inválida con pieza de rey</td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador no debería poder realizar un movimiento inválido</td>
        </tr>
        <tr>
              <td rowspan=6 align="center">5 Conversión a rey</td>
              <td rowspan=3 align="center">5.1 Promocionar una pieza normal a pieza rey</td>
              <td align="left">Dado el turno de un jugador para moverse</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando la pieza del jugador llega a la última fila</td>
        </tr>
      <tr>
              <td align="left">Entonces la pieza debería ser promovida a pieza rey</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">5.2  Promoción fallida del rey </td>
              <td align="left">Dado el turno de un jugador para moverse</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando la pieza del jugador no llegó a la última fila</td>
        </tr>
      <tr>
              <td align="left">Entonces la pieza del jugador no debería ascender a pieza rey</td>
        </tr>
        <tr>
              <td rowspan=6 align="center">6 Capturar una pieza</td>
              <td rowspan=3 align="center">6.1 Saltar sobre la pieza del oponente</td>
              <td align="left">Dado el turno de un jugador para moverse</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando un jugador da un salto válido sobre la pieza del oponente</td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador debería poder dar el salto válido y capturar la pieza del oponente</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">6.2  Realizar un salto fallido sobre una pieza del mismo color</td>
              <td align="left">Dado el turno de un jugador para moverse</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando un jugador realiza un salto inválido sobre una pieza del mismo color </td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador no debería poder realizar el salto inválido y capturar la pieza</td>
        </tr>
        <tr>
              <td rowspan=6 align="center">7 Humano vs Bot</td>
              <td rowspan=3 align="center">7.1 Movimiento exitoso del Bot</td>
              <td align="left">Dado un usuario jugando un juego</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando un usuario realiza un movimiento válido</td>
        </tr>
      <tr>
              <td align="left">Entonces la computadora hace un movimiento válido</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">7.2  Cambio de Turno</td>
              <td align="left">Dado un usuario jugando un juego</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando la computadora realiza un movimiento válido </td>
        </tr>
      <tr>
              <td align="left">Entonces el turno debe cambiar al usuario</td>
        </tr>
        <tr>
              <td rowspan=9 align="center">8 Fin del juego</td>
              <td rowspan=3 align="center">8.1 Ganar el juego</td>
              <td align="left">Dado el turno de un jugador para moverse</td>
              <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td  align="left">Cuando el jugador captura la última pieza del oponente</td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador gana el juego y aparece un mensaje de ganador en la pantalla</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">8.2  Empatando el juego</td>
              <td align="left">Dado el turno de un jugador para moverse</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando ningún jugador captura la pieza del oponente en los últimos 40 movimientos</td>
        </tr>
      <tr>
              <td align="left">Luego el juego termina en empate y aparece el empate en la pantalla</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">8.3  Ganar la partida sin que queden movimientos legale</td>
              <td align="left">Dado el turno de un jugador para moverse</td>
             <td rowspan=3 align="center">Hecho</td>
              <td rowspan=3 align="center">Cleber Aguado</td>
        </tr>
      <tr>
              <td align="left">Cuando un jugador no tiene ningún movimiento legal que hacer</td>
        </tr>
      <tr>
              <td align="left">Luego, el oponente gana y aparece un mensaje de victoria en la pantalla</td>
        </tr>
    </tbody>
</table>



# III. Tareas de implementación actualizadas
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
            <td rowspan=7 align="center">1 Registrar un nuevo usuario</td>
            <td align="center">1.1</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate()</td>
            <td rowspan=7 align="center">4</td>
            <td  align="center">Hecho</td>
            <td align="center">Nuevo usuario se registra exitosamente</td>
        </tr>
        <tr>
            <td align="center">1.2 </td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate() isUserNameValid()</td>
            <td  align="center">Hecho</td>
            <td align="center">El registro falla si usuario entra un nombre existente</td>
        </tr>
        <tr>
            <td align="center">1.3</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate() isPasswordValid()</td>
            <td  align="center">Hecho</td>
            <td align="center">El registro falla si usuario ingresa una contraseña incorrecta</td>
        </tr>
        <tr>
            <td align="center">1.4</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate() isPasswordValid()</td>
            <td  align="center">Hecho</td>
            <td align="center">El registro falla si usuario ingresa que no coincide</td>
        </tr>
        <tr>
            <td align="center">1.5</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate() isEmailValid()</td>
            <td  align="center">Hecho</td>
            <td align="center">El registro falla si usuario ingresa un correo invalido</td>
        </tr>
         <tr>
            <td align="center">1.6</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate() isPhoneValid()</td>
             <td  align="center">Hecho</td>
            <td align="center">El registro falla si usuario ingresa un numero invalido</td>
        </tr>
         <tr>
            <td align="center">1.7</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI </td>
            <td align="center">registerNewUser() doesUserNameExist() executeUpdate() isFirstNameValid() isLastNameValid()</td>
             <td  align="center">Hecho</td>
            <td align="center">El registro falla si usuario ingresa un nombre o apellido inválidos</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">2 Iniciar sesión existente</td>
            <td align="center">2.1</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI</td>
            <td align="center">login() executeQuery()</td>
            <td rowspan=3 align="center">4</td>
            <td rowspan=1 align="center">Hecho</td>
            <td align="center">Acceso de usuario exitoso</td>
        </tr>
        <tr>
            <td align="center">2.2 </td>
             <td align="center">UserAccount UserAccountManager UserManagerGUI</td>
            <td align="center">login() executeQuery()</td>
            <td rowspan=1 align="center">Hecho</td>
            <td align="center">El inicio de sesión del usuario falla si la contraseña es incorrecta</td>
        </tr>
        <tr>
            <td align="center">2.3</td>
            <td align="center">UserAccount UserAccountManager UserManagerGUI</td>
            <td align="center">login() executeQuery()</td>
            <td rowspan=1 align="center">Hecho</td>
            <td align="center">Usuario el inicio de sesión falla si está mal nombre de usuario</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">3 Iniciando Juego de damas</td>
            <td align="center">3.1</td>
            <td align="center">AmericanCheckersGUI</td>
            <td align="center">drawBoard(Graphics g)</td>
            <td rowspan=3 align="center">4</td>
            <td rowspan=1 align="center">Hecho</td>
            <td align="center">Verifica si el tablero es visible o no</td>
        </tr>
        <tr>
            <td align="center">3.2 </td>
            <td align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">drawBoard(Graphics g),init game</td>
            <td rowspan=1 align="center">Hecho</td>
            <td align="center">Comprueba si las piezas están colocadas en la posición correcta </td>
        </tr>
        <tr>
            <td align="center">3.3</td>
            <td align="center">American Checkers GUI</td>
            <td align="center">toss</td>
            <td rowspan=1 align="center">Hecho</td>
            <td align="center">Escoge que jugador empieza primero</td>
        </tr>
        <tr>
            <td rowspan=14 align="center">4 Jugador realizando movimiento  de pieza</td>
            <td rowspan=3 align="center">4.1</td>
            <td rowspan=3 align="center">American Checkers Game.
                               American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=14 align="center">4</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center">Se asegura que el primer movimiento lo realicen las negras</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">4.2 </td>
            <td align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td align="center">Hecho</td>
            <td align="center">Cuando el rojo intenta moverse primero no debe suceder</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">4.3</td>
            <td rowspan=3 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center">Se debe permitir cualquier movimiento válido y se debe cambiar el turno</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">4.4 </td>
            <td align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td align="center">Hecho</td>
            <td align="center">No se debe permitir un movimiento no válido y el turno debe seguir siendo el mismo</td>
        </tr>
        <tr>
            <td rowspan=4 align="center">4.5 </td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center">Se debe permitir que la pieza del rey se mueva en las cuatro direcciones diagonales</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">isKing()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td rowspan=2 align="center">4.6 </td>
            <td rowspan=2 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=2 align="center">Hecho</td>
            <td rowspan=2 align="center">Debería restringirse el movimiento inválido del rey</td>
        </tr>
        <tr>
            <td align="center">isKing()</td>
        </tr>
    </tbody>
    <tr>
            <td rowspan=7 align="center">5. Conversión a rey</td>
            <td rowspan=4 align="center">5.1</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=7 align="center">des</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center">Cuando una pieza normal llega a la primera fila del oponente, debe ascender a rey</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">setKing()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
    <tr>
            <td rowspan=3 align="center">5.2</td>
            <td rowspan=3 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center">Una pieza normal que no llegue a la última fila del oponente debe seguir siendo una pieza normal</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td rowspan=5 align="center">6. Capturar una pieza</td>
            <td rowspan=3 align="center">6.1</td>
            <td rowspan=3 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=5 align="center">des</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center">Debería permitirse matar una pieza del oponente</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td rowspan=2 align="center">6.2</td>
            <td rowspan=2 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=2 align="center">Hecho</td>
            <td rowspan=2 align="center">No se debe permitir matar piezas del mismo color</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
    <tr>
            <td rowspan=2 align="center">7. Humano vs Bot</td>
            <td  align="center">7.1</td>
            <td  align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">findValidBotMove()</td>
            <td rowspan=2 align="center">des</td>
            <td rowspan=2 align="center">Hecho</td>
            <td align="center">BOT hace un movimiento valido</td>
        </tr>
    <tr>
            <td  align="center">7.2</td>
            <td  align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">findValidBotMove()</td>
            <td align="center">Turno cambia al usuario</td>
        </tr>
    <tr>
            <td rowspan=12 align="center">8. Fin del juego</td>
            <td rowspan=4 align="center">8.1</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=12 align="center">des</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center">Cuando no quede ninguna pieza del oponente, éste deberá ser declarado ganador</td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">setGameState()</td>
        </tr>
        <tr>
            <td rowspan=4 align="center">8.2</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center">Si no se captura ninguna pieza en los últimos 40 movimientos, entonces el juego debería empatarse</td>
        </tr>
         <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">setGameState()</td>
        </tr>
        <tr>
            <td rowspan=4 align="center">8.3</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center">Cuando adversario no tiene legal se mueve, el debería ser declarado ganador</td>
        </tr>
         <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">setGameState()</td>
        </tr>
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
            <td align="center">Se abre la página de registro</td>
            <td align="center">Hecho</td>
            <td align="center">Se abre la página de registro para registrar un nuevo usuario</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">2 Inicio de Sesión</td>
            <td align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="center">2</td>
            <td align="center">Página de inicio de sesión</td>
            <td align="center">Hecho</td>
            <td align="center">Se abre la página de inicio de sesión</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Checkers Board</td>
            <td align="center">Hecho</td>
            <td align="center">Se debe mostrar el tablero de damas.</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">4 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Checkers Board</td>
            <td align="center">Hecho</td>
            <td align="center">Se debe mostrar el tablero de damas.</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td rowspan=3align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Checkers Board</td>
            <td align="center">Hecho</td>
            <td align="center">Se debe mostrar el tablero de damas.</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3.2 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Posición de la pieza</td>
            <td align="center">Hecho</td>
            <td align="center">La pieza de damas debe estar dispuesta correctamente</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Player 1 o Player 2</td>
            <td align="center">Hecho</td>
            <td align="center">Cuadro de texto que muestre quien gano el turno</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td rowspan=3align="center">4 </td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Humano vs computadora el juego comienza</td>
            <td align="center">Hecho</td>
            <td align="center">Se inicia el juego vs la computadora</td>
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
            <td align="center">1 </td>
            <td align="center">Red-Black</td>
            <td align="center">Red-Black</td>
            <td align="center">CheckersPiecePositionTest</td>
            <td align="center">testCheckersPíeceColor()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">2 </td>
            <td align="center"></td>
            <td align="center">false-true</td>
            <td align="center">CheckersPiecePositionTest</td>
            <td align="center">testCheckersKingPiece()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">3</td>
            <td align="center"></td>
            <td align="center">Moverse con las piezas negras</td>
            <td align="center">CheckersMoveTest</td>
            <td align="center">testFirstmoveByBlack()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">4</td>
            <td align="center"></td>
            <td align="center">No se mueve con las rojas</td>
            <td align="center">CheckersMoveTest</td>
            <td align="center">testFirstmoveByRed()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">5</td>
            <td align="center"></td>
            <td align="center">Piezas Rojas Capturadas</td>
            <td align="center">HopTest</td>
            <td align="center">BlackTestValidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">6</td>
            <td align="center"></td>
            <td align="center">Piezas Negras Capturadas</td>
            <td align="center">HopTest</td>
            <td align="center">RedTestValidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">7</td>
            <td align="center"></td>
            <td align="center">Pieza Roja no capturada</td>
            <td align="center">HopTest</td>
            <td align="center">BlackTestInvalidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">8</td>
            <td align="center"></td>
            <td align="center">Pieza Negra no capturada</td>
            <td align="center">HopTest</td>
            <td align="center">RedTestInvalidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">9</td>
            <td align="center"></td>
            <td align="center">Pieza rey negra</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testBlckSuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">10</td>
            <td align="center"></td>
            <td align="center">Pieza rey roja</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testRedSuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">11</td>
            <td align="center"></td>
            <td align="center">Pieza normal negra</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testBlckUnsuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">12</td>
            <td align="center"></td>
            <td align="center">Pieza normal roja</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testRedUnsuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">13</td>
            <td align="center"></td>
            <td align="center">Rojo gana</td>
            <td align="center">EndGameTest</td>
            <td align="center">redWinPosition()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">14</td>
            <td align="center"></td>
            <td align="center">Negro gana</td>
            <td align="center">EndGameTest</td>
            <td align="center">blackWinPosition()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td align="center">15</td>
            <td align="center"></td>
            <td align="center">Empate</td>
            <td align="center">EndGameTest</td>
            <td align="center">EndGameTest()</td>
            <td align="center">Hecho</td>
            <td align="center">6</td>
        </tr>
    </tbody>
</table>

# IV. Documentación de diseño

## 1. Diseño de interfaz de usuario

Enumere los nombres de los miembros del equipo que contribuyeron a esta sección.

Resuma el diseño de la interfaz de usuario mediante una combinación de capturas de pantalla y descripciones textuales.


Contribuidores: Escobar Maycoll, Aguado Clever, Nuñez Gerson

### Registrar nuevo usuario:

Siempre que un usuario quiera jugar un juego, debe registrarse para un juego. Para eso, el usuario debe ingresar un nombre de usuario válido, nombre, apellido, correo electrónico, contraseña, contraseña reingresada y número de teléfono. Una vez que todos estos campos están validados y verificados, el usuario debería poder registrarse. Los detalles ingresados también se almacenarán en la tabla de registro en la base de datos MySQL “American Checkers” y una vez que el usuario se registre exitosamente, podrá iniciar sesión en el juego y, de manera similar, quien quiera jugar debe registrarse. Sólo los usuarios registrados pueden jugar.

Después de un registro exitoso, la base de datos tendrá los valores ingresados como se muestra a continuación: 

### Registre un nuevo usuario con datos no válidos:
Si el usuario ingresó los valores no coinciden con cualquiera de los escenarios de validación, aparecerá una ventana emergente que indicará que se ingresaron datos no válidos. Y además, los datos no se almacenarán en la base de datos MySQL de damas americanas creada:
![image](https://github.com/Alema03/CC3S2A-grupal/assets/137519831/ba773e41-ac25-442d-b8f7-42b894f8326b)

### Inicio de sesión de usuario: :
Al iniciar sesión, un usuario debe ingresar el nombre de usuario y la contraseña; una vez que este nombre de usuario y contraseña coincidan con los valores registrados en la base de datos, el usuario podrá acceder a la interfaz del juego:

### Inicio de sesión no válido:
Si ingresa un nombre de usuario o contraseña que no coincide con el registro de la base de datos, aparecerá una ventana emergente con el mensaje de “logueo ha fallado”.

### Decidir el Turno:
Una vez que el usuario haya iniciado sesión correctamente, obtendrá un juego para proceder a realizar un lanzamiento. Y ahora podrás ver el botón decidir turno junto con el tablero de damas.

Cuando haga clic en el botón Hacer un lanzamiento, aparecerá un mensaje para ingresar el nombre del “player1” y el nombre del ‘’player2’’ y luego podrá hacer clic en Aceptar para decidir el turno:

### Funcionalidad de desactivación de lanzamiento:
Quien gane el sorteo tendrá la oportunidad de hacer un movimiento primero y el color asignado para el ganador del sorteo será el negro. Y ambos usuarios solo pueden realizar un lanzamiento una vez y después de realizarlo, se desactiva automáticamente.




### Cambiar al modo Computadora
Y ahora, si quieres cambiar del modo humano al modo computadora, debes hacer clic en el botón Humano vs Computadora al lado del botón de lanzamiento en la parte superior de la interfaz de usuario del juego. Si hace clic en el botón Humano a computadora, recibirá un mensaje emergente que indica que cambió al modo Humano a computadora.
Cambiar al modo humano desde el modo computadora

Y si desea volver al modo normal o al modo humano, puede hacer clic nuevamente en el botón Humano vs computadora y luego cambiará al modo humano a humano. Si quieres continuar con el oponente de la computadora, puedes continuar hasta el final del juego. Funcionará y nuestro código informático derrotará al peor jugador humano.

### Gameplay: 
Ahora puedes jugar con 2 usuarios registrados o con un usuario registrado en una computadora. Las negras harán un primer movimiento un paso en diagonal hacia arriba o hacia abajo. Y luego el rojo hará un movimiento de un paso en diagonal hacia arriba. Y cada vez, el usuario sólo puede realizar un movimiento diagonal a menos que sea un movimiento de salto.

Movimiento rojo seguido de movimiento negro:

Antes de una captura y después de una captura

Pieza negra convertida en Rey, Pieza roja convertida en Rey

El usuario se convertirá en ganador si mata todas las piezas de su oponente en el juego.

## 2. Arquitectura de software

Contribuidores: Escobar Maycoll, Aguado Clever, Nuñez Gerson

Enumere los nombres de los miembros del equipo que contribuyeron a esta sección.
Proporcione un diagrama de clases que capture las clases principales y sus relaciones en su programa final.

El diseño de este juego tiene 2 categorías principales.

    1. AmericanCheckersGame
    
    2.CheckersPiece
    
    3. AmericanCheckersGUI
    
Las clases mencionadas anteriormente están relacionadas con la interfaz de usuario y la mecánica del juego American Checkers Game.

    1.UserAccount
    
    2.UserAccountManger
    
    3.EditProfileWindow
    
    4.UserAccountManagerUI
    
Estas clases están relacionadas con la Gestión de Usuarios de los jugadores, su información y registros de juego que se guardan en la base de datos MySQL.

#### validMove(): 
Para comprobar si el usuario está tratando de hacer un movimiento válido. 

#### makeMove():
Una vez que se verifica que un movimiento es válido, el movimiento se puede realizar utilizando el método makeMove().

#### changeTurn(): 
Para finalizar el turno del usuario y darle al oponente la oportunidad de jugar.

#### findValidBotMove(): 
Para encontrar un bot, muévete cuando sea el turno del bot. 

#### CheckersPiece 
Este objeto representa la pieza física en el tablero que tiene atributos que representan el color y el estado de promoción de la pieza. Y su posición real a bordo se memoriza mediante una matriz de cuadrícula.

#### setKing(): 
Promover una pieza normal de damas a una pieza de rey. 

#### AmericanChecksGUI 
Esta clase actúa como clase de representación para las dos clases anteriores y se construye utilizando subprogramas de Java. Consta de tablero y piezas a través de las cuales los jugadores interactúan con el juego.

#### GameBoardCanvas(): 
El diseño actual del layout donde se colocan el tablero de damas y las piezas.

#### UserAccount and UserAccountManager 
Estas clases tratan sobre los registros de los usuarios y sus juegos jugados. Gestiona acciones de registros de usuario como creación, actualización y eliminación que se realizan almacenados en la base de datos MySQL.

#### registerNewUser():
Registrar un nuevo usuario y darle privilegios para jugar.

#### login(): 
Ayude a los usuarios registrados a iniciar sesión y jugar.

#### UserAccountManagerUI and EditProfileWindow 
Estas son ventanas emergentes que ayudan a los usuarios a registrarse y jugar. Una vez registrados, los usuarios pueden iniciar sesión y jugar.

#### buttonHandlers(): 
Contiene principalmente controladores de botones y tiene detalles sobre la acción que se debe realizar cuando se hace clic en los botones.

## 3. Diseño de algoritmos
Enumere los nombres de los miembros del equipo que contribuyeron a esta sección.

Contribuidores: Escobar Maycoll, Aguado Clever, Nuñez Gerson

Describir el diseño del algoritmo del oponente de la computadora (por ejemplo, usando pseudocódigo). La descripción debe ser comprensible sin hacer referencia al código fuente.

El bot está diseñado basándose en un enfoque bruto y puede vencer a un ser humano que no juega bien.

#### Pseudocodigo
```pseudocode
BEGIN 
checkerboard 
turn <- bot 
possibleMoves <- 4;
    WHILE row 1 : 8 
        WHILE column 1 : 8
             botCheckerPiece <-  (row,colums)
             botCheckersPiece != empty AND botCheckersPiece.color = RED
               IF botCheckersPiece.king = true 
                    possibleMoves < -8 
                ENDIF 
                WHILE move 1: possibleMoves 
                    IF checkerboard(move.endposition) = empty
                         botCheckersPiece.position = move.endposition 
                        IF move.killmove = true 
                            humanCheckerPiece = remove
                        ENDIF 
                        Turn <- human
                    ENDIF
                ENDWHILE
        ENDWHILE 
    ENDWHILE 
END
```
####Funcionalidad del algoritmo

El algoritmo se basa en un enfoque de fuerza bruta en el que escaneamos el tablero de damas desde la parte superior izquierda y continuamos por filas hasta encontrar una pieza de color ROJO (el bot siempre tiene piezas de color rojo). Una vez que encontramos una pieza de este tipo, intentamos ver si hay algún movimiento legal que hacer, 4 movimientos posibles para una pieza normal y 8 movimientos posibles para una pieza promovida por rey, que incluyen un movimiento normal y un movimiento de salto que elimina una pieza humana del tablero. Si no existe tal movimiento, continuamos con el siguiente robot de damas y buscamos un movimiento legal para eso.
De esta manera, el bot hace un movimiento y cuando solo hay una pieza de damas humana y se mantiene en diagonal a 1 casilla de distancia de la pieza del robot informático, el robot informático mata la pieza del oponente y gana el juego.

## 4. Extensibilidad
Enumere los nombres de los miembros del equipo que contribuyeron a esta sección.

Contribuidores: Escobar Maycoll, Aguado Clever, Nuñez Gerson


Analice cómo se puede ampliar su código para las variantes de American Checkers, como las variantes nacionales y regionales (https://en.wikipedia.org/wiki/Draughts#National_and_regional_variants). ¿Qué clases y métodos deben cambiarse y cómo? ¿Cómo se aplicó el principio abierto-cerrado (es decir, qué funciones o clases están abiertas a la extensión, pero cerradas a lamodificación)? 

La interfaz de usuario del tablero de damas americanas 8x8 que creamos se puede ampliar aún más para crear un juego de ajedrez 8x8 o cualquier variante de Damas Americanas nacionales y regionales (que en esencia cambian el tamaño del tablero 10x10,12x2, etc). A medida que implementamos el método genérico para crear la interfaz de usuario del tablero de juego, se puede ampliar en el futuro a juegos de mesa pequeños como 3x3 o juegos de mesa grandes con cuadrículas de 12x12 u otros juegos de mesa de 8x8.

Para cualquier otro juego de mesa extendido, solo necesitamos agregar una nueva clase que imite AmericanCheckersGame.java como ChessGame.java o TicToeGame.java.

Para agregar la nueva funcionalidad a otros juegos extendidos o juegos existentes, solo necesitamos cambiar los métodos validMove() y makeMove() en nuestro proyecto. Lo que hace que sea más fácil agregar nuevas funciones o nuevas reglas al juego existente, adaptando las reglas individuales del juego ya existente.

Hemos implementado una clase UserManagerGUI para seguir el principio abierto y cerrado. Todos los métodos que tenemos en esta clase se declaran como privados y estarán disponibles para extensión y cerrados para realizar modificaciones adicionales. De manera similar, también tenemos una variable clave llamada bot que también sigue el mismo principio.

# V. Hallazgos del ejercicio de revisión del código
<table>
    <thead>
        <tr>
            <th>Lista de Verificación</th>
            <th>Elemento de la lista de verificación</th>
            <th>Recomendaciones</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td rowspan=5 align="center">Estándares de codificación </td>
            <td align="center">Convenciones de nombres</td>
            <td align="center">Para seguir estándares de codificación optamos por nombrar a nuestras clases, variables y métodos en el idioma Inglés.
Se viola la convención de nomenclatura para constantes con varias palabras. En lugar de usar guiones bajos entre palabras, hemos usado una sola palabra con la primera letra de la nueva palabra en mayúscula.
La convención de nomenclatura de los métodos de prueba no era coherente ya que la clase fue desarrollada por varios desarrolladores del equipo.
</td>
        </tr>
        <tr>
            <td align="center">Convención de ordenamiento de argumentos de método.</td>
            <td align="center">La convención de orden se mantuvo bien y siempre que había más de 4 argumentos, se pasaba un objeto para mantener el método simple.</td>
        </tr>
        <tr>
            <td align="center">Comentarios significativos y válidos.</td>
            <td align="center">Se eliminaron pocos comentarios innecesarios y se documentaron las condiciones previas y posteriores para todos los métodos complejos.</td>
        </tr>
        <tr>
            <td align="center">Estilo consistente de bloques de código.</td>
            <td align="center">Sí, se utilizaron llaves del mismo estilo en todo el proyecto, donde la llave abierta está escrita en la línea donde se declara la función.</td>
        </tr>
        <tr>
            <td align="center">Sangría consistente</td>
            <td align="center">Siempre que había bucles y bloques, se usaba un solo espacio de tabulación para indicar que el bloque de código está anidado. </td>
        </tr>
        <tr>
            <td rowspan=5 align="center">Criterios de diseño</td>
            <td align="center">Buena abstracción de clase e interfaz.</td>
            <td align="center">Hemos utilizado métodos privados que restringen la visibilidad de todos los datos confidenciales.</td>
        </tr>
        <tr>
            <td align="center">Visibilidad adecuada de cada variable, método y clase.</td>
            <td align="center">Los getters and setters se hacen públicos para que puedan ser utilizados por la clase de interfaz de usuario. De manera similar, otras variables y métodos se mantienen en consecuencia.</td>
        </tr>
        <tr>
            <td align="center">Diseño por contrato (pre/postcondiciones)</td>
            <td align="center">La mayoría de los métodos públicos son utilizados por las clases de UI y cuando las entradas se toman mediante clicks del mouse, se pueden predecir sus límites de salida, lo que hace que la condición previa sea razonable y esté disponible.</td>
        </tr>
        <tr>
            <td align="center">¿Se viola el principio abierto-cerrado?</td>
            <td align="center">Hemos implementado una clase UserManagerGUI para seguir el principio abierto y cerrado. Todos los métodos que tenemos en esta clase se declaran como privados y estarán disponibles para extensión y cerrados para realizar modificaciones adicionales. </td>
        </tr>
                <tr>
            <td align="center">¿Se viola el Principio de Responsabilidad Única?</td>
            <td align="center">No, no se viola el principio de responsabilidad única. Las damas americanas pueden funcionar de forma independiente ya que contienen funciones puras. De igual forma, la gestión de usuarios funciona de forma independiente cuya finalidad es registrar e iniciar sesión a los usuarios.</td>
        </tr>
        <tr>
            <td rowspan=9 align="center">El código huele</td>
            <td align="center">números mágicos</td>
            <td align="center">No se utilizaron números mágicos en nuestro proyecto ya que utilizamos variables constantes y locales para verificar las condiciones.</td>
        </tr>
        <tr>
            <td align="center">Variable global/clase innecesaria</td>
            <td align="center">No, no hay variables globales o de clase innecesarias. Se le dio prioridad a convertirla en una variable de función cuando es utilizada por múltiples métodos, solo entonces se mueve a una variable de clase.</td>
        </tr>
        <tr>
            <td align="center">Código duplicado</td>
            <td align="center">El principio DRY se siguió estrictamente al escribir el código. Por lo tanto, se evita en gran medida el código duplicado.</td>
        </tr>
        <tr>
            <td align="center">Métodos largos</td>
            <td align="center">No, no existen métodos largos; siempre que existe la posibilidad, los métodos largos se dividen en varios métodos.</td>
        </tr>
        <tr>
            <td align="center">Lista larga de parámetros</td>
            <td align="center">Siempre que había más de 4 parámetros, se utilizaba un único parámetro de objeto para mantener la simplicidad.</td>
        </tr>
        <tr>
            <td align="center">Expresión demasiado compleja</td>
            <td align="center">Solo hay una expresión demasiado complicada al escribir el algoritmo para el Bot. sin embargo, se explica claramente con comentarios razonables.</td>
        </tr>
        <tr>
            <td align="center">Cambiar o if-then-else que debe ser reemplazado con polimorfismo</td>
            <td align="center">No, como el proyecto está destinado a ser un juego único, no había necesidad de reemplazarlo con un comportamiento de polimorfismo. El polimorfismo tendría más sentido cuando es necesario crear varios juegos diferentes utilizando las mecánicas principales del juego.</td>
        </tr>
        <tr>
            <td align="center">Nombre de variable o método cuya intención no está clara</td>
            <td align="center">La intención del método checkAndMakeMove no está clara, pero se aclara a través de los comentarios y la documentación del método.</td>
        </tr>
        <tr>
            <td align="center">¿Algún método similar en otras clases?</td>
            <td align="center">No se encuentran métodos similares en comparación con otras clases, ya que cada clase tiene una funcionalidad limitada.</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">Codificación segura</td>
            <td align="center">Política de contraseñas seguras</td>
            <td rowspan=3 align="center">El uso de SQL incrustado puede ser problemático desde el punto de vista de seguridad y mantenimiento. </td>
        </tr>
        <tr>
            <td align="center">Prevención de la inyección SQL</td>
        </tr>
        <tr>
            <td align="center">Desbordamiento de enteros</td>
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
            <td rowspan=3 align="center">8/04/2024</td>
            <td rowspan=3 align="center">3 horas</td>
            <td rowspan=3 align="center">Meet</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Implementación del juego Humano vs Computadora y prueba del código escribiendo casos de prueba relevantes.</td>
            <td align="left">Discucion sobre el algoritmo para el juego entre humanos y computadoras.</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Implementar el juego entre humano vs computadora.</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Probar el juego entre humanos y computadoras escribiendo casos de prueba relevantes.</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">10/04/2024</td>
            <td rowspan=3 align="center">2 horas</td>
            <td rowspan=3 align="center">Meet</td>
            <td align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Revisión de todo el proyecto</td>
            <td align="left">Elección de representante del grupo</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="left">Organizó una revisión del código y anotó los hallazgos</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="left">Práctica de uso de commits y edición</td>
        </tr>
        <tr>
            <td rowspan=3 align="center">13/04/2024</td>
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
            <td rowspan=3 align="center">14/04/2024</td>
            <td rowspan=3 align="center">1 hora</td>
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
            <td rowspan=3 align="center">16/04/2024</td>
            <td rowspan=3 align="center">1 hora</td>
            <td rowspan=3 align="center">Bilbioteca de FC</td>
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
            <td align="center">16</td>
        </tr>
        <tr>
            <td align="center">Marcelo Nuñez</td>
            <td align="center">15</td>
            <td align="center"></td>
            <td align="center">15</td>
        </tr>
        <tr>
            <td align="center">Maycoll Escobar</td>
            <td align="center">16</td>
            <td align="center">15</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td align="center">Promedio</td>
            <td align="center">15.5</td>
            <td align="center">16</td>
            <td align="center">15.5</td>
        </tr>
    </tbody>
</table>
