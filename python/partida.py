from typing import List
from mision import Mision

class Partida:
    def __init__(self):
        self.misiones: List[Mision] = []
        self.recompensas_globales = 0

    def agregar_mision(self, mision: Mision) -> None:
        self.misiones.append(mision)

    def iniciar_juego(self) -> None:
        # TODO: Implementar inicio del juego
        pass
