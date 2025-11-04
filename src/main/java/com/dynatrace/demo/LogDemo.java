// src/main/java/com/dynatrace/demo/LogDemo.java
package com.dynatrace.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Aplicación de demostración para el envío de logs a Dynatrace
 * a través del Appender de Log4j2, que llama directamente a la API
 * de ingesta de logs (sin OneAgent).
 */
public class LogDemo {

    // Inicializa el Logger para esta clase
    private static final Logger logger = LogManager.getLogger(LogDemo.class);

    public static void main(String[] args) {
        System.out.println("Iniciando la demostración de logs de Dynatrace...");
        
        // Simular una secuencia de logs con diferentes niveles
        logger.info("La aplicación se ha iniciado correctamente. Demostración de ingesta de logs.");

        // Simular una operación de procesamiento
        for (int i = 1; i <= 3; i++) {
            logger.debug("Procesando el ítem número {}.", i);
            try {
                // Pequeña pausa para simular trabajo
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("Error al pausar el thread: {}", e.getMessage());
            }
        }

        // Simular una advertencia (Warning)
        logger.warn("Se detectó un valor inusual en el procesamiento. Ítem 3 excedió el umbral.");

        // Simular un evento crítico (Error)
        try {
            // Simular un error que conduce a una excepción
            throw new RuntimeException("Fallo en la conexión con el servicio externo 'InventoryAPI'");
        } catch (Exception e) {
            // Los logs de ERROR suelen incluir el stack trace para mejor análisis
            logger.error("Excepción crítica capturada. El servicio no pudo completar la solicitud.", e);
        }

        logger.info("Demostración de logs finalizada. Revisa tu Logs App en Dynatrace.");
    }
}
