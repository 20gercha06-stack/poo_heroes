# Videojuego POO - Versión 3 (Héroes y Acertijos)

Bienvenido al repositorio del caso de estudio de la Unidad II. Este código base contiene las clases abstractas e interfaces que modelan la Versión 3 del juego.

## Reglas de Negocio (Diseño V3)

1. Ciclo de Intentos: Un error suma 1 al contador de la misión.
2. Al llegar al límite (3 errores), la misión se bloquea.
3. Un cuarto intento debe ser rechazado sin procesarse.

- Recompensas: La recompensa se acredita solo una vez al completar la misión.
- Dificultades Dinámicas: Las clases que implementen la interfaz Dificultad (ej. bloquear rutas) solo se aplican si la misión está activa. Una dificultad no puede aplicarse si deja el reto sin solución posible.
- Estado Persistente: Al reiniciar una partida, se restauran las condiciones iniciales del reto, pero se conservan las compras de pistas y premios registrados. Leer una pista ya comprada es gratis.

1. Gestión de Partida y Misiones
Contenedor Principal: La clase Partida actúa como el orquestador principal del juego. Administra una colección de objetos Mision mediante una relación de composición (una misión no existe de forma independiente fuera de una partida).
Composición de Misiones: Cada objeto Mision encapsula exactamente un Reto y puede contener cero o más objetos Pista.
Independencia de Configuración: Una partida se puede configurar dinámicamente agregando misiones que contengan retos de diferente tipo y con distintos niveles de dificultad.

2. Jerarquía Polimórfica de Retos Matemáticos
Clase Abstracta Base (Reto): Define el contrato común para todos los problemas matemáticos del juego (evaluarRespuesta, generarProblema, aumentarDificultad).

Tipos Concretos de Habilidades:
RetoSecuencia: Representa ejercicios de patrones y series numéricas.
RetoOrdenamiento: Representa ejercicios de ordenamiento de listas de elementos.
RetoRutaCorta: Representa ejercicios de optimización de caminos sobre grafos.

Escala de Dificultad: La dificultad de cada reto está fuertemente tipada a través del enumerado NivelDificultad (FACIL, MEDIO, DIFICIL).

3. Especialización y Roles de los Villanos
Especialización por Tipo de Reto: La clase abstracta Villano obliga a sus subclases a implementar el método complicarReto(r: Reto).

Modificación Dirigida:

Joker: Evalúa y eleva la complejidad exclusivamente cuando el reto es de tipo RetoSecuencia.
GreenGoblin: Modifica y aumenta la dificultad únicamente en retos de tipo RetoRutaCorta.

Creación de Misiones: Los villanos pueden actuar como creadores/generadores de misiones mediante el método plantearMision(r: Reto).

4. Interacción de Héroes y Ayudantes
Resolución de Misiones: El Heroe (ej. Batman) interactúa con la Partida para resolver misiones, consumiendo intentos y gestionando un saldo para comprar pistas.

Sistema de Pistas: El héroe puede solicitar ayuda a un Ayudante (ej. Alfred), quien le provee objetos Pista a cambio de un costo definido.



## Instrucciones para Estudiantes (GitHub Flow)
- Revisa el tablero de Issues y asígnate una tarea (máximo 2 personas Peer-Programming por tarea para evitar colisiones).
- Haz un Fork del repositorio y trabaja en una rama descriptiva (ej. feature/34-reto-spiderman).
- Puedes agregar clases concretas o métodos privados, pero NO puedes modificar las firmas de los métodos en las clases abstractas o interfaces ya definidas.
- Sube tus cambios y abre un Pull Request (PR).
- Solicita la revisión de al menos dos compañeros de clase. Una vez aprobada por ellos, la profesora hará el merge final.
