# Proyecto Llamadas

## Descripción

Este proyecto se trata de una aplicación para controlar los gastos telefónicos de una empresa. Permite gestionar llamadas realizadas a través de varias cabinas telefónicas, incluyendo llamadas locales, de larga distancia y a celulares. La aplicación registra llamadas, muestra información detallada y proporciona un resumen consolidado de los costos.

## Funcionalidades

1. **Registrar una llamada**: Permite registrar llamadas locales, de larga distancia o a celulares con su duración en minutos.
2. **Mostrar información detallada**: Muestra el número de llamadas realizadas, la duración total y el costo total de cada tipo de llamada.
3. **Mostrar consolidado total**: Proporciona un resumen general de todas las cabinas, incluyendo el costo total, el número total de llamadas y el costo promedio por minuto.
4. **Reiniciar la cabina**: Restablece todos los contadores y costos de una cabina telefónica a cero.
   

## Tarifas

- Minuto Llamada Local: $50 pesos
- Minuto Llamada Larga Distancia: $350 pesos
- Minuto Llamada Celular: $150 pesos
  
## Creatividad (Nuevas Funcionalidades)
 Múltiples Cabinas: Permitir la gestión de múltiples cabinas simultáneamente y generar informes consolidados.
 
## Estructura del Proyecto

- **src/**: Contiene el código fuente de la aplicación.
    - `Main.kt`: Archivo principal que ejecuta el menú y maneja la interacción con el usuario.
    - `GestionGastosTelefonicos.kt`: Clase que gestiona el registro y el cálculo de los gastos telefónicos.
      
      
## Calidad del codigo
 En cuanto a la Legibilidad es claro, ya que tu estructura se encuentra ordenada y tiene variables con nombres muy entendibles de acuerdo al ejercicio.

## Aspectos Relevantes
Entradas del Usuario: El usuario debe ingresar valores válidos para el tipo de llamada y la duración. El código maneja entradas no válidas de forma básica.
Manejo de Errores: Se realiza una validación simple de entradas para evitar errores en el tipo de llamada. 

# Posibles Mejoras
Validación de Entradas: Implementar una validación más robusta para las entradas del usuario para evitar errores o valores inesperados.



