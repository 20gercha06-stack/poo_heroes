from abc import ABC, abstractmethod

class Reto(ABC):
    @abstractmethod
    def evaluar(self, respuesta: str) -> bool:
        """Evalúa si la respuesta resuelve el reto específico."""
        pass
