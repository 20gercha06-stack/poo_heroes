# Videojuego POO - Versión 3 (Héroes y Acertijos)

Bienvenido al repositorio del caso de estudio de la Unidad II. Este código base contiene las clases abstractas e interfaces que modelan la Versión 3 del juego.

## Reglas de Negocio (Diseño V3)

## 3. Gestión de Partida y Misiones

- **Contenedor Principal (`Partida`):** Actúa como el orquestador central del juego. Administra una colección de objetos `Mision` mediante una relación de composición (una misión no existe de forma independiente fuera de la partida).
- **Composición Interna:** Cada objeto `Mision` encapsula exactamente un `Reto` y puede contener cero o más objetos `Pista`.
- **Configuración Dinámica:** Una partida puede configurarse agregando misiones de forma flexible que contengan retos de distinta naturaleza y con diversos niveles de dificultad.

---

## 4. Jerarquía Polimórfica de Retos Matemáticos

- **Clase Abstracta Base (`Reto`):** Define el contrato común para todos los problemas del juego mediante métodos como `evaluarRespuesta()`, `generarProblema()` y `aumentarDificultad()`.
- **Tipos Concretos de Retos:**
    - `RetoSecuencia`: Representa ejercicios basados en patrones y series numéricas.
    - `RetoOrdenamiento`: Modela ejercicios de ordenamiento de listas de elementos.
    - `RetoRutaCorta`: Gestiona ejercicios de optimización de caminos sobre grafos.
- **Escala de Dificultad:** La complejidad de cada reto está tipada mediante el enumerado `NivelDificultad` (`FACIL`, `MEDIO`, `DIFICIL`).

---

## 5. Especialización y Roles de los Villanos

- **Contrato de Villano:** La clase abstracta `Villano` obliga a sus subclases a implementar el método `complicarReto(r: Reto)`.
- **Modificación Dirigida:**
    - **Joker:** Evalúa y eleva la complejidad exclusivamente cuando el reto es de tipo `RetoSecuencia`.
    - **GreenGoblin:** Modifica y aumenta la dificultad únicamente en retos de tipo `RetoRutaCorta`.
- **Generación de Desafíos:** Los villanos actúan como creadores de misiones mediante el método `plantearMision(r: Reto)`.

---

## 6. Interacción de Héroes y Ayudantes

- **Resolución de Misiones:** El `Heroe` (por ejemplo, *Batman*) interactúa con el sistema para resolver misiones, consumiendo intentos y administrando un saldo de créditos.
- **Sistema de Pistas:** El héroe puede solicitar asistencia a un `Ayudante` (por ejemplo, *Alfred*), quien le provee objetos `Pista` a cambio de un costo predefinido en el catálogo.

## Instrucciones para Estudiantes (GitHub Flow)
- Revisa el tablero de Issues y asígnate una tarea (máximo 2 personas Peer-Programming por tarea para evitar colisiones).
- Haz un Fork del repositorio y trabaja en una rama descriptiva (ej. feature/34-reto-spiderman).
- Puedes agregar clases concretas o métodos privados, pero NO puedes modificar las firmas de los métodos en las clases abstractas o interfaces ya definidas.
- Sube tus cambios y abre un Pull Request (PR).
- Solicita la revisión de al menos dos compañeros de clase. Una vez aprobada por ellos, la profesora hará el merge final.
