# Videojuego POO - Versión 3 (Héroes y Acertijos)

Bienvenido al repositorio del caso de estudio de la Unidad II. Este código base contiene las clases abstractas e interfaces que modelan la Versión 3 del juego.

## Reglas de Negocio (Diseño V3)

1. Ciclo de Intentos: Un error suma 1 al contador de la misión.
2. Al llegar al límite (3 errores), la misión se bloquea.
3. Un cuarto intento debe ser rechazado sin procesarse.

- Recompensas: La recompensa se acredita solo una vez al completar la misión.
- Dificultades Dinámicas: Las clases que implementen la interfaz Dificultad (ej. bloquear rutas) solo se aplican si la misión está activa. Una dificultad no puede aplicarse si deja el reto sin solución posible.
- Estado Persistente: Al reiniciar una partida, se restauran las condiciones iniciales del reto, pero se conservan las compras de pistas y premios registrados. Leer una pista ya comprada es gratis.

## Instrucciones para Estudiantes (GitHub Flow)
- Revisa el tablero de Issues y asígnate una tarea (máximo 2 personas Peer-Programming por tarea para evitar colisiones).
- Haz un Fork del repositorio y trabaja en una rama descriptiva (ej. feature/34-reto-spiderman).
- Puedes agregar clases concretas o métodos privados, pero NO puedes modificar las firmas de los métodos en las clases abstractas o interfaces ya definidas.
- Sube tus cambios y abre un Pull Request (PR).
- Solicita la revisión de al menos dos compañeros de clase. Una vez aprobada por ellos, la profesora hará el merge final.
