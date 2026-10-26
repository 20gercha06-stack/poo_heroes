from reto import Reto
from dificultad import Dificultad

class Mision:
    def __init__(self, reto: Reto):
        self._reto = reto
        self._estado = "activa"
        self._errores = 0
        self._recompensa_acreditada = False
        self._dificultades = []

    def procesar_intento(self, respuesta: str) -> bool:
        # TODO: Implementar validación de formato
        # TODO: Delegar a self._reto.evaluar()
        # TODO: Manejar errores y bloqueo al 3er error
        pass

    def agregar_dificultad(self, dificultad: Dificultad):
        # TODO: Aplicar dificultad solo si la misión está activa y no rompe el reto
        pass
