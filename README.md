## Atividade N2 - Serviço de Meteorologia

Este projeto é um web service que usa a API OpenWeatherMap para fornecer informações sobre o clima de uma cidade e permite o envio de dados via POST para o processamento. Ele foi desenvolvido com o uso de Spring Boot e Docker.

# Requisitos

* Java 17
* Maven para gerenciar dependências
* Docker para execução em container (opcional)

# Como executar(Maven)

1. Clonar o repositório:
```
git clone https://github.com/seu_usuario/atividade_n2.git
```
2. No arquivo ClimaService.java, coloque sua chave real da API OpenWeatherMap na string "coloque_sua_api_key":
```
private final String API_KEY = "coloque_sua_api_key";
```
3. Execute o projeto usando Maven:
```
mvn spring-boot:run
```
# Como executar(Docker)
```
docker build -t atividade_n2 .
docker-compose up
```
## Rotas Disponíveis

# Rota GET/api/clima

Esta rota consulta a API OpenWeatherMap para obter informações sobre um clima de uma cidade.

Requisição:
```
GET http://localhost:8080/api/clima?cidade=São%20Paulo
```
Resposta:
```
{
    "coord": { "lon": -46.6361, "lat": -23.5475 },
    "weather": [
        {
            "id": 800,
            "main": "Clear",
            "description": "clear sky",
            "icon": "01d"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 25.32,
        "feels_like": 25.3,
        "temp_min": 24.61,
        "temp_max": 26.47,
        "pressure": 1015,
        "humidity": 65
    },
    "visibility": 10000,
    "wind": { "speed": 3.13, "deg": 85, "gust": 6.41 },
    "clouds": { "all": 0 },
    "dt": 1618317040,
    "sys": {
        "type": 2,
        "id": 2039045,
        "country": "BR",
        "sunrise": 1618282134,
        "sunset": 1618324734
    },
    "timezone": -10800,
    "id": 3448439,
    "name": "São Paulo",
    "cod": 200
}
```
# Rota POST/api/processo

Esta rota recebe dados os para processamento

Requisição:
```
POST http://localhost:8080/api/processo
Content-Type: application/json

{
    "dados": "Exemplo de dados enviados"
}
```
Resposta
```
{
    "mensagem": "Dados processados: Exemplo de dados enviados"
}
```
# Rota GET/api/sobre

Meu nome e o nome do projeto

Requisição:
```
GET http://localhost:8080/api/sobre
```
Resposta:
```
{
    "estudante": "Seu Nome",
    "projeto": "atividade_n2_Serviço de Meteorologia"
}
```
