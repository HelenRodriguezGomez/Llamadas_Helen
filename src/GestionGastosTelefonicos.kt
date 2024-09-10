class GestionGastosTelefonicos {


        private var llamadasLocales = 0
        private var minutosLocales = 0
        private var costoTotalLocal = 0

        private var llamadasDistancia = 0
        private var minutosDistancia = 0
        private var costoTotalDistancia = 0

        private var llamadasCelular = 0
        private var minutosCelular = 0
        private var costoTotalCelular = 0

        fun registrarLlamada(tipoLlamada: Int, duracion: Int) {
            when (tipoLlamada) {
                1 -> {
                    llamadasLocales++
                    minutosLocales += duracion
                    costoTotalLocal += duracion * COSTO_MINUTO_LOCAL
                }
                2 -> {
                    llamadasDistancia++
                    minutosDistancia += duracion
                    costoTotalDistancia += duracion * COSTO_MINUTO_DISTANCIA
                }
                3 -> {
                    llamadasCelular++
                    minutosCelular += duracion
                    costoTotalCelular += duracion * COSTO_MINUTO_CELULAR
                }
            }
        }

        fun mostrarDetalleCabina() {
            println("Detalles de las llamadas:")
            println("Llamadas locales: $llamadasLocales, Duración: $minutosLocales minutos, Costo: $costoTotalLocal pesos")
            println("Llamadas larga distancia: $llamadasDistancia, Duración: $minutosDistancia minutos, Costo: $costoTotalDistancia pesos")
            println("Llamadas a celular: $llamadasCelular, Duración: $minutosCelular minutos, Costo: $costoTotalCelular pesos")
        }

        fun mostrarResumenGeneral() {
            val llamadasTotales = llamadasLocales + llamadasDistancia + llamadasCelular
            val minutosTotales = minutosLocales + minutosDistancia + minutosCelular
            val costoTotal = costoTotalLocal + costoTotalDistancia + costoTotalCelular
            val costoPromedioPorMinuto = if (minutosTotales > 0) costoTotal / minutosTotales else 0

            println("Resumen general de todas las cabinas:")
            println("Llamadas totales: $llamadasTotales")
            println("Minutos totales: $minutosTotales")
            println("Costo total: $costoTotal pesos")
            println("Costo promedio por minuto: $costoPromedioPorMinuto pesos")
        }

        fun restablecerCabina() {
            llamadasLocales = 0
            minutosLocales = 0
            costoTotalLocal = 0

            llamadasDistancia = 0
            minutosDistancia = 0
            costoTotalDistancia = 0

            llamadasCelular = 0
            minutosCelular = 0
            costoTotalCelular = 0

            println("Los datos de la cabina han sido restablecidos.")
        }

        companion object {
            const val COSTO_MINUTO_LOCAL = 50
            const val COSTO_MINUTO_DISTANCIA = 350
            const val COSTO_MINUTO_CELULAR = 150
        }
    }





