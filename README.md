<<<<<<< HEAD
El objetivo de esta implementación fue validar un método de ingesta de logs "agentless" (sin agente).
Este enfoque se tomo por las limitaciones que tiene oneagent en los servidores Solaris 6 donde la instalación de un OneAgent estándar no es viable.
La prueba demuestra la capacidad de enviar logs de aplicaciones Java directamente a la API de Dynatrace.

Se utilizaron dos componentes principales para esta simulación:
Aplicación de Demostración (LogDemo.java):

Ubicación: /demoLogs/src/main/java/com/dynatrace/demo/

Función: Una aplicación Java que utiliza Log4j2 para generar logs de muestra en múltiples niveles (INFO, WARN, ERROR), simulando la carga de una aplicación real.

Configuración del Appender (log4j2.xml):

Ubicación: /demoLogs/src/main/resources/

Función: Este archivo de configuración es el núcleo de la solución. Define un DynatraceGenericLogIngestAppender que se conecta de forma segura al endpoint de la API de Dynatrace (/api/v2/logs/ingest) utilizando la URL del tenant y un token de API.
=======
# Demo-Logs
>>>>>>> d112bc6 (Initial commit)
# Demo-Logs
