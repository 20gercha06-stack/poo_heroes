from abc import ABC, abstractmethod

class Dificultad(ABC):
    @abstractmethod
    def aplicar(self, reto) -> bool:
        """Aplica el obstáculo al reto. Retorna False si deja el reto sin solución."""
        pass
