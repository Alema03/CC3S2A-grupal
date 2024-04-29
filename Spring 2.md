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
            <td  align="center">Iniciando Juego de damas</td>
            <td align="center">Como usuario del juego, quiero iniciar la aplicación y 
              ver el tablero con las piezas de dama colocadas en las posiciones correctas 
              para que pueda empezar a jugar de inmediato.
            </td>
          <td align="center">Alta</td>
          <td align="center">3 horas</td>
          <td align="center">3 horas</td>
          <td align="center">En curso</td>
          <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">2</td>
            <td  align="center">Jugador realizando movimiento  de pieza</td>
            <td align="center">Como jugador, quiero hacer un movimiento legal en el tablero de 
              damas para que el juego progrese de acuerdo con las reglas oficiales.
            </td>
          <td align="center">Alta</td>
          <td align="center">5 horas</td>
          <td align="center">6 horas</td>
          <td align="center">En curso</td>
          <td align="center">Marcelo Nuñez</td>
          <tr>
            <td align="center">3</td>
            <td  align="center">Conversión a rey</td>
            <td align="center">Como jugador, quiero que mi pieza se convierta en una pieza 
              rey cuando llega a la última fila del tablero para que pueda obtener más 
              habilidades y movilidad en el juego.
            </td>
          <td align="center">Alta</td>
          <td align="center">8 horas</td>
          <td align="center">9 horas</td>
          <td align="center">En curso</td>
          <td align="center">Marcelo Nuñez</td>
        </tr>
      <tr>
            <td align="center">4</td>
            <td  align="center">Capturar pieza</td>
            <td align="center">Como jugador, quiero que mi pieza capture la pieza 
              del oponente cuando salta sobre ella para que pueda avanzar y 
              obtener una ventaja en el juego de damas.
            </td>
          <td align="center">Alta</td>
          <td align="center">4 horas</td>
          <td align="center">4 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
      <tr>
            <td align="center">5</td>
            <td  align="center">Finalizar juego</td>
            <td align="center">Como jugador, quiero que el juego termine cuando un 
              jugador captura la última pieza del oponente, cuando no hay movimientos 
              válidos restantes, o cuando ambos jugadores acuerdan un empate para que 
              el resultado final se determine de manera clara y justa.
            </td>
          <td align="center">Alta</td>
          <td align="center">5 horas</td>
          <td align="center">5 horas</td>
          <td align="center">En curso</td>
          <td align="center">Cleber Aguado</td>
        </tr>
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
            <td rowspan=9 align="center">1 Iniciando Juego de damas</td>
            <td rowspan=3 align="center">1.1 Inicio del Juego</td>
            <td align="left">Dado la aplicación del juego</td>
            <td rowspan=3 align="center">En progreso</td>
            <td rowspan=9 align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="left">Cuando el usuario la inicia</td>
        </tr>
        <tr>
            <td align="left">Entonces se debe mostrar un tablero de damas con cuadrados de colores alternos ( blancos y verdes)</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">1.2 Colocación de las piezas de damas a bordo</td>
              <td align="left">Dado que el usuario ejecuta la aplicación.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando el tablero de damas está cargado.</td>
        </tr>
      <tr>     
          <td align="left">Entonces las piezas de las damas deben estar dispuestas en su posición correcta.</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">1.3 Lanzamiento para determinar quién juega primero</td>
              <td align="left">Dado que el usuario ejecuta la aplicación.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
              <td  align="left">Cuando el tablero de damas está cargado</td>
        </tr>
      <tr>
              <td align="left">Entonces se abre un cuadro de diálogo de lanzamiento para determinar quién juega primero.</td>
        </tr>
         <tr>
            <td rowspan=18 align="center">2.Jugador realizando movimiento  de pieza </td>
            <td rowspan=3 align="center">2.1 Primer movimiento de las negras</td>
            <td align="left">Dado un tablero de damas con piezas de damas</td>
            <td rowspan=3 align="center">En progreso</td>
            <td rowspan=18 align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="left">Cuando el jugador negro intenta hacer el primer movimiento del juego</td>
        </tr>
        <tr>
            <td align="left">Entonces negro debería poder mover su pieza a la posición deseada.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">2.2 Primer movimiento inválido del rojo</td>
              <td align="left">Dado un tablero de damas con piezas de damas.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando el jugador rojo intenta hacer el movimiento cuando no es su turno.</td>
        </tr>
      <tr>     
          <td align="left">Entonces el jugador no debería poder mover su pieza a la posición deseada.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">2.3 Realizar un movimiento válido</td>
              <td align="left">Dado el turno de un jugador para realizar un movimiento.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando un jugador intenta hacer un movimiento válido.</td>
        </tr>
      <tr>     
          <td align="left">Entonces el jugador debería poder realizar un movimiento válido.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">2.4 Realizar un movimiento no válido</td>
              <td align="left">Dado el turno de un jugador para realizar un movimiento.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando un jugador intenta realizar un movimiento no válido.</td>
        </tr>
      <tr>     
          <td align="left">Entonces el jugador no debería poder realizar un movimiento inválido.</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">2.5 Realizar un movimiento válido con pieza de rey</td>
              <td align="left">Dado el turno de un jugador para hacer un movimiento.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
              <td  align="left">Cuando un jugador intenta hacer un movimiento válido usando la pieza rey</td>
        </tr>
      <tr>
              <td align="left">Entonces el jugador debería poder realizar un movimiento válido.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">2.6 Realizar un movimiento no válido con pieza de rey</td>
              <td align="left">Dado el turno de un jugador para hacer un movimiento.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando un jugador intenta realizar una jugada inválida con pieza de rey.</td>
        </tr>
      <tr>     
          <td align="left">Entonces el jugador no debería poder realizar un movimiento inválido.</td>
        </tr>
         <tr>
            <td rowspan=6 align="center">3 Conversión a rey</td>
            <td rowspan=3 align="center">3.1 Promocionar una pieza normal a pieza rey</td>
            <td align="left">Dado el turno de un jugador para moverse.</td>
            <td rowspan=3 align="center">En progreso</td>
            <td rowspan=6 align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="left">Cuando la pieza del jugador llega a la última fila</td>
        </tr>
        <tr>
            <td align="left">Entonces la pieza debería ser promovida a pieza rey</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">3.2 Promoción fallida del rey </td>
              <td align="left">Dado el turno de un jugador para moverse.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando la pieza del jugador no llegó a la última fila.</td>
        </tr>
      <tr>     
          <td align="left">Entonces la pieza del jugador no debería ascender a pieza rey.</td>
        </tr>
         <tr>
            <td rowspan=6 align="center">4 Capturar una pieza</td>
            <td rowspan=3 align="center">4.1 Saltar sobre la pieza del oponente</td>
            <td align="left">Dado el turno de un jugador para moverse</td>
            <td rowspan=3 align="center">En progreso</td>
            <td rowspan=6 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="left">Cuando un jugador da un salto válido sobre la pieza del oponente</td>
        </tr>
        <tr>
            <td align="left">Entonces el jugador debería poder dar el salto válido y capturar la pieza del oponente.</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">4.2 Realizar un salto fallido sobre una pieza del mismo color</td>
              <td align="left">Dado el turno de un jugador para moverse.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando un jugador realiza un salto inválido sobre una pieza del mismo color.</td>
        </tr>
      <tr>     
          <td align="left">Entonces el jugador no debería poder realizar el salto inválido y capturar la pieza.</td>
        </tr>
         <tr>
            <td rowspan=9 align="center">5 Fin del juego</td>
            <td rowspan=3 align="center">5.1 Ganar el juego</td>
            <td align="left">Dado el turno de un jugador para moverse</td>
            <td rowspan=3 align="center">En progreso</td>
            <td rowspan=9 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="left">Cuando el jugador captura la última pieza del oponente</td>
        </tr>
        <tr>
            <td align="left">Entonces el jugador gana el juego y aparece un mensaje de ganador en la pantalla</td>
        </tr>
        <tr>
              <td rowspan=3 align="center">5.2 Empatando el juego</td>
              <td align="left">Dado el turno de un jugador para moverse.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
               <td align="left">Cuando ningún jugador captura la pieza del oponente en los últimos 40 movimientos.</td>
        </tr>
      <tr>     
          <td align="left">Luego el juego termina en empate y aparece el empate en la pantalla.</td>
        </tr>
      <tr>
              <td rowspan=3 align="center">5.3 Ganar la partida sin que queden movimientos legales</td>
              <td align="left">Dado el turno de un jugador para moverse.</td>
              <td rowspan=3 align="center">En progreso</td>
        </tr>
      <tr>
              <td  align="left">Cuando un jugador no tiene ningún movimiento legal que hacer</td>
        </tr>
      <tr>
              <td align="left">Luego, el oponente gana y aparece un mensaje de victoria en la pantalla.</td>
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
            <td rowspan=3 align="center">1 Iniciando Juego de damas</td>
            <td align="center">1.1</td>
            <td align="center">AmericanCheckersGUI</td>
            <td align="center">drawBoard(Graphics g)</td>
            <td rowspan=3 align="center">Maycoll Escobar</td>
            <td rowspan=3 align="center">Hecho</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td align="center">1.2 </td>
            <td align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">drawBoard(Graphics g),init game</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td align="center">1.3</td>
            <td align="center">American Checkers GUI</td>
            <td align="center">toss</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td rowspan=14 align="center">2 Jugador realizando movimiento  de pieza</td>
            <td rowspan=3 align="center">2.1</td>
            <td rowspan=3 align="center">American Checkers Game.
                               American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=14 align="center">Marcelo Nuñez</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center"></td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">2.2 </td>
            <td align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td align="center">Hecho</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td rowspan=3 align="center">2.3</td>
            <td rowspan=3 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center"></td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td align="center">2.4 </td>
            <td align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td align="center">Hecho</td>
            <td align="center"></td>
        </tr>
        <tr>
            <td rowspan=4 align="center">2.5 </td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center"></td>
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
            <td rowspan=2 align="center">2.6 </td>
            <td rowspan=2 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=2 align="center">Hecho</td>
            <td rowspan=2 align="center"></td>
        </tr>
        <tr>
            <td align="center">isKing()</td>
        </tr>
    </tbody>
    <tr>
            <td rowspan=7 align="center">3. Conversión a rey</td>
            <td rowspan=4 align="center">3.1</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=7 align="center">Marcelo Nuñez</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center"></td>
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
            <td rowspan=3 align="center">3.2</td>
            <td rowspan=3 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center"></td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td rowspan=5 align="center">4. Capturar una pieza</td>
            <td rowspan=3 align="center">4.1</td>
            <td rowspan=3 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=5 align="center">Cleber Aguado</td>
            <td rowspan=3 align="center">Hecho</td>
            <td rowspan=3 align="center"></td>
        </tr>
        <tr>
            <td align="center">makeMove()</td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
        <tr>
            <td rowspan=2 align="center">4.2</td>
            <td rowspan=2 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=2 align="center">Hecho</td>
            <td rowspan=2 align="center"></td>
        </tr>
        <tr>
            <td align="center">changeTurn()</td>
        </tr>
    <tr>
            <td rowspan=12 align="center">5. Fin del juego</td>
            <td rowspan=4 align="center">5.1</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td align="center">validMove()</td>
            <td rowspan=12 align="center">Cleber Aguado</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center"></td>
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
            <td rowspan=4 align="center">5.2</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center"></td>
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
            <td rowspan=4 align="center">5.3</td>
            <td rowspan=4 align="center">American Checkers Game.
                                American Checkers GUI</td>
            <td rowspan=1 align="center">validMove()</td>
            <td rowspan=4 align="center">Hecho</td>
            <td rowspan=4 align="center"></td>
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
            <td rowspan=2 align="center">1 Iniciando Juego de damas</td>
            <td align="center">1.1 </td>
            <td rowspan=2 align="center">CheckersBoardTest</td>
            <td align="center">testCheckersBoard()</td>
            <td align="center">Comprueba si el tablero es visible o no</td>
            <td align="center">Hecho</td>
            <td rowspan=2 align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">1.2</td>
            <td align="center">testCheckersBoardPiecePlacement()</td>
            <td align="center">Comprueba si las piezas están colocadas en la posición correcta</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td rowspan=6 align="center">2 Jugador realizando movimiento de pieza</td>
            <td align="center">2.1</td>
            <td rowspan=6 align="center">CheckersMoveTest</td>
            <td align="center">testFirtsMoveByBlack()</td>
            <td align="center">Asegura  que el primer movimiento lo hagan las negras.</td>
            <td align="center">Hecho</td>
            <td rowspan=6 align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">2.2</td>
            <td align="center">testFirstByRed()</td>
            <td align="center">Cuando el rojo intenta el primer movimiento no se le permite.</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td align="center">2.3</td>
            <td align="center">testValidMove()</td>
            <td align="center">Se debe permitir cualquier movimiento válido y se debe cambiar el turno.</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td align="center">2.4</td>
            <td align="center">testInvalidMove()</td>
            <td align="center">No se debe permitir un movimiento no válido y el turno debe seguir siendo el mismo.</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td align="center">2.5</td>
            <td align="center">testValidMoveByKing()</td>
            <td align="center">A la pieza rey se le debe permitir moverse en las cuatro direcciones diagonales</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td align="center">2.6</td>
            <td align="center">testInvalidMoveByKing()</td>
            <td align="center">Hacer un movimiento inválido por parte del rey debe estar restrignido</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td rowspan=2 align="center">3</td>
            <td align="center">3.1</td>
            <td rowspan=2 align="center">KingPromotionTest</td>
            <td align="center">testSuccesfulKingPromotion()</td>
            <td align="center">Cuando una pieza normal llega a la primera fila del oponente, debe ascender a rey</td>
            <td align="center">Hecho</td>
            <td rowspan=2 align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">3.2</td>
            <td align="center">testUnSuccesfulKingPromotion()</td>
            <td align="center">Una pieza normal que no llega a la última fila del oponente debe seguir siendo una pieza normal</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td rowspan=2 align="center">4</td>
            <td align="center">4.1</td>
            <td rowspan=2 align="center">HopTest</td>
            <td align="center">testValidHop()</td>
            <td align="center">Debería permitirse matar una pieza del oponente.</td>
            <td align="center">Hecho</td>
            <td rowspan=2 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">4.2</td>
            <td align="center">testValidHop()</td>
            <td align="center">No se debe permitir matar piezas del mismo color</td>
            <td align="center">Hecho</td>
        </tr>
        <tr>
            <td rowspan=2 align="center">5</td>
            <td align="center">5.1</td>
            <td rowspan=2 align="center">EndGameTest</td>
            <td align="center">winPositionTest()</td>
            <td align="center">Cuando no quede ninguna pieza del oponente, éste deberá ser declarado ganador.</td>
            <td align="center">Hecho</td>
            <td rowspan=2 align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">5.2</td>
            <td align="center">drawGameTest()</td>
            <td align="center">Si no se captura ninguna pieza en los últimos 40 movimientos, entonces el juego debería empatarse.</td>
            <td align="center">Hecho</td>
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
            <td align="center">Checkers Board</td>
            <td align="center">Hecho</td>
            <td align="center">Se debe mostrar el tablero de damas.</td>
            <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">2 Inicio de Sesión</td>
            <td align="center">2.1 Inicio de sesión exitoso con nombre de usuario y contraseña</td>
            <td align="center">2</td>
            <td align="center">Posición de la pieza</td>
            <td align="center">Hecho</td>
            <td align="center">La pieza de damas debe estar dispuesta correctamente</td>
            <td align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">3 Visualización del Tablero</td>
            <td align="center">3.1 Visualización del tablero de damas en línea con posiciones de piezas para ambos jugadores</td>
            <td align="center">2</td>
            <td align="center">Player 1 o Player 2</td>
            <td align="center">Hecho</td>
            <td align="center">Cuadro de texto que muestre quien gano el turno</td>
            <td align="center">Cleber Aguado</td>
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
            <td align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">2 </td>
            <td align="center"></td>
            <td align="center">false-true</td>
            <td align="center">CheckersPiecePositionTest</td>
            <td align="center">testCheckersKingPiece()</td>
            <td align="center">Hecho</td>
            <td align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">3</td>
            <td align="center"></td>
            <td align="center">Moverse con las piezas negras</td>
            <td align="center">CheckersMoveTest</td>
            <td align="center">testFirstmoveByBlack()</td>
            <td align="center">Hecho</td>
            <td align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">4</td>
            <td align="center"></td>
            <td align="center">No se mueve con las rojas</td>
            <td align="center">CheckersMoveTest</td>
            <td align="center">testFirstmoveByRed()</td>
            <td align="center">Hecho</td>
            <td align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">5</td>
            <td align="center"></td>
            <td align="center">Piezas Rojas Capturadas</td>
            <td align="center">HopTest</td>
            <td align="center">BlackTestValidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">6</td>
            <td align="center"></td>
            <td align="center">Piezas Negras Capturadas</td>
            <td align="center">HopTest</td>
            <td align="center">RedTestValidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">7</td>
            <td align="center"></td>
            <td align="center">Pieza Roja no capturada</td>
            <td align="center">HopTest</td>
            <td align="center">BlackTestInvalidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">Marcelo Nuñez</td>
        </tr>
        <tr>
            <td align="center">8</td>
            <td align="center"></td>
            <td align="center">Pieza Negra no capturada</td>
            <td align="center">HopTest</td>
            <td align="center">RedTestInvalidHop()</td>
            <td align="center">Hecho</td>
            <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">9</td>
            <td align="center"></td>
            <td align="center">Pieza rey negra</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testBlckSuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">10</td>
            <td align="center"></td>
            <td align="center">Pieza rey roja</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testRedSuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">11</td>
            <td align="center"></td>
            <td align="center">Pieza normal negra</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testBlckUnsuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">12</td>
            <td align="center"></td>
            <td align="center">Pieza normal roja</td>
            <td align="center">KingPromotionTest</td>
            <td align="center">testRedUnsuccesfulKingPromotion()</td>
            <td align="center">Hecho</td>
            <td align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">13</td>
            <td align="center"></td>
            <td align="center">Rojo gana</td>
            <td align="center">EndGameTest</td>
            <td align="center">redWinPosition()</td>
            <td align="center">Hecho</td>
            <td align="center">Cleber Aguado</td>
        </tr>
        <tr>
            <td align="center">14</td>
            <td align="center"></td>
            <td align="center">Negro gana</td>
            <td align="center">EndGameTest</td>
            <td align="center">blackWinPosition()</td>
            <td align="center">Hecho</td>
            <td align="center">Maycoll Escobar</td>
        </tr>
        <tr>
            <td align="center">15</td>
            <td align="center"></td>
            <td align="center">Empate</td>
            <td align="center">EndGameTest</td>
            <td align="center">EndGameTest()</td>
            <td align="center">Hecho</td>
            <td align="center">Marcelo Nuñez</td>
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
            <td rowspan=3 align="center">Creacion de Clases</td>
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
            <td rowspan=3 align="center">10/04/2024</td>
            <td rowspan=3 align="center">2 horas</td>
            <td rowspan=3 align="center">Meet</td>
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
