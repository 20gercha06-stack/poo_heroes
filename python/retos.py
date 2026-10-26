from abc import ABC, abstractmethod
from nivel_dificultad import NivelDificultad

class Reto(ABC):
    def __init__(self, descripcion: str, dificultad: NivelDificultad):
        self.descripcion = descripcion
        self.dificultad = dificultad

    @abstractmethod
    def evaluar_respuesta(self, respuesta: str) -> bool:
        pass

    @abstractmethod
    def generar_problema(self) -> None:
        pass

    def aumentar_dificultad(self) -> None:
        if self.dificultad == NivelDificultad.FACIL:
            self.dificultad = NivelDificultad.MEDIO
        elif self.dificultad == NivelDificultad.MEDIO:
            self.dificultad = NivelDificultad.DIFICIL


class RetoSecuencia(Reto):
    def __init__(self, dificultad: NivelDificultad):
        super().__init__("Completar la secuencia numérica", dificultad)
        self.patron_numerico = []

    def evaluar_respuesta(self, respuesta: str) -> bool:
        # TODO: Implementar la validación de la respuesta
        return False

    def generar_problema(self) -> None:
        # TODO: Generar patrón según la dificultad
        pass
