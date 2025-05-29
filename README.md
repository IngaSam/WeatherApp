# Weather Application 🌤️

Простое JavaFX-приложение для отображения текущей погоды в любом городе мира с использованием OpenWeatherMap API.

## 📌 Особенности
- Показывает текущую температуру, ощущаемую температуру, максимум/минимум дня и давление
- Поддержка русского языка
- Минималистичный интерфейс
- Работает с открытым API OpenWeatherMap

## 🛠 Технологии
- Java 17+
- JavaFX
- JSON-парсинг (org.json)
- Maven (для управления зависимостями)

## ⚙️ Установка и запуск
1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/ваш-username/weather-app.git
Убедитесь, что у вас установлены:

JDK 17+

Maven

Соберите проект:

bash
mvn clean install
Запустите приложение:

bash
mvn javafx:run
🌐 API Key
Приложение использует бесплатный ключ OpenWeatherMap API. Если запросы перестанут работать:

Получите свой API ключ на openweathermap.org

Замените в коде (HelloController.java):

java
String url = "...&appid=ВАШ_КЛЮЧ...";
📸 Скриншот
![image](https://github.com/user-attachments/assets/11c4d95d-2d10-46fb-94e1-c61b9143c1f0)

Интерфейс приложения

📂 Структура проекта
src/
├── main/
│   ├── java/
│   │   └── org/example/weather/
│   │       ├── HelloController.java
│   │       └── Main.java
│   ├── resources/
│   │   └── org/example/weather/
│   │       ├── hello-view.fxml
│   │       └── weather.png
pom.xml
⚠️ Известные проблемы
Для некоторых городов temp_max и temp_min могут показывать одинаковые значения (ограничение бесплатного API)

Нет обработки ошибок при неверном вводе города
