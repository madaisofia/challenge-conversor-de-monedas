<h1 align="center"> <strong>Challenge del Conversor de Monedas </strong></h1>
<p align="center">
  <img src="src/Badge-Conversor.png" alt="Insignia">
</p>
<p align="center">
  <img src="https://img.shields.io/badge/STATUS-EN%20DESARROLLO-green" alt="Estado del proyecto">
  <img src="https://img.shields.io/badge/Versión-1.0.0-orange" alt="Versión">
</p>
<br>


## 📌 Introducción
> El Challenge "Conversor de Monedas" es parte de la formación en programación orientada a objetos del programa ONE de Alura y Oracle.  
> Esta aplicación permite a los usuarios convertir entre diferentes monedas utilizando la **Exchange Rate API** en tiempo real.

<br>

## 🛠 Funcionalidades
- <strong> Conversión de monedas: </strong> La aplicación permite convertir entre Dólar (USD), Peso Mexicano (MXN), Euro (EUR) y Libra Esterlina (GBP).  
- <strong> Consulta en tiempo real: </strong> La aplicación obtiene las tasas de cambio actualizadas desde la API `ExchangeRate-API`.  
- <strong> Interfaz de usuario en consola: </strong> Permite seleccionar la moneda de origen y destino, ingresar el monto y ver el resultado de manera clara.  
- <strong> Manejo de errores: </strong> La aplicación valida la respuesta de la API y muestra mensajes de error en caso de problemas de conexión o tasas no disponibles.  

<br>

## 💡 Ejecución
1. Abre **IntelliJ IDEA** y crea un nuevo proyecto de tipo **Java** llamado `El challengue del conversor de monedas`.

2. Crea el paquete `conversor` dentro de `src` y copia dentro los archivos:  
   - `Main.java`  
   - `Menu.java`  
   - `ConversorMonedas.java`  
   - `Moneda.java`  
   - `ApiConnector.java`  

3. Agrega la librería `org.json` al proyecto
4. Ejecuta `Main.java` y sigue las instrucciones en consola.
   
<br>

## 💻 Tecnologías utilizadas
Para la realización del proyecto se utilizaron las siguientes tecnologías:
- Java (versión 11 o superior)
- IntelliJ IDEA
- API: Exchange Rate API
- Librería `org.json` para manejo de JSON

<br>

## 👥️ Agradecimientos
Agradezco a mis instructores de Alura Latam y Oracle por la formación y el desafío:
- Génesys Rondon
- Bruno Darío Fernández Ellerbach  
- Eric Monné Fraga de Oliveira
