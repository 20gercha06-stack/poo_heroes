from retos import Reto

class Mision:
    def __init__(self, id_mision: str, reto: Reto):
        self.id_mision = id_mision
        self.reto = reto
        self.estado = "activa"
        self.pistas = []

    def procesar_intento(self, respuesta: str) -> bool:
        if self.reto.evaluar_respuesta(respuesta):
            self.completar()
            return True
        return False

    def completar(self) -> None:
        self.estado = "completada"
